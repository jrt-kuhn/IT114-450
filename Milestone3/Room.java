import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random;
import java.util.HashMap;
import java.util.Map.Entry;
//import Module7.Part9.common.Constants;

public class Room implements AutoCloseable {
	private String name;
        Random rand = new Random();
	private List<ServerThread> clients = Collections.synchronizedList(new ArrayList<ServerThread>());
	private boolean isRunning = false;
	// Commands
	private final static String COMMAND_TRIGGER = "/";
	private final static String CREATE_ROOM = "createroom";
	private final static String JOIN_ROOM = "joinroom";
	private final static String DISCONNECT = "disconnect";
	private final static String LOGOUT = "logout";
	private final static String LOGOFF = "logoff";
        private final static String FLIP = "flip";
        private final static String ROLL = "roll";
        private final static String MUTE = "mute";
        private final static String UNMUTE = "unmute";
	private static Logger logger = Logger.getLogger(Room.class.getName());
        private HashMap<String, String> converter = null;

	public Room(String name) {
		this.name = name;
		isRunning = true;
	}

	private void info(String message) {
		logger.log(Level.INFO, String.format("Room[%s]: %s", name, message));
	}

	public String getName() {
		return name;
	}

	public boolean isRunning() {
		return isRunning;
	}

	protected synchronized void addClient(ServerThread client) {
		if (!isRunning) {
			return;
		}
		client.setCurrentRoom(this);
		if (clients.indexOf(client) > -1) {
			info("Attempting to add a client that already exists");
		} else {
			clients.add(client);
			sendConnectionStatus(client, true);
			sendRoomJoined(client);
			sendUserListToClient(client);
		}
	}

	protected synchronized void removeClient(ServerThread client) {
		if (!isRunning) {
			return;
		}
		clients.remove(client);
		// we don't need to broadcast it to the server
		// only to our own Room
		if (clients.size() > 0) {
			// sendMessage(client, "left the room");
			sendConnectionStatus(client, false);
		}
		checkClients();
	}

	/***
	 * Checks the number of clients.
	 * If zero, begins the cleanup process to dispose of the room
	 */
	private void checkClients() {
		// Cleanup if room is empty and not lobby
		if (!name.equalsIgnoreCase("lobby") && clients.size() == 0) {
			close();
		}
	}

	/***
	 * Helper function to process messages to trigger different functionality.
	 * 
	 * @param message The original message being sent
	 * @param client  The sender of the message (since they'll be the ones
	 *                triggering the actions)
	 */
	private boolean processCommands(String message, ServerThread client) {
		boolean wasCommand = false;
		try {
			if (message.startsWith(COMMAND_TRIGGER)) {
				String[] comm = message.split(COMMAND_TRIGGER);
				String part1 = comm[1];
				String[] comm2 = part1.split(" ");
				String command = comm2[0];
				String roomName;
				wasCommand = true;
				switch (command) {
					case CREATE_ROOM:
						roomName = comm2[1];
						Room.createRoom(roomName, client);
						break;
					case JOIN_ROOM:
						roomName = comm2[1];
						Room.joinRoom(roomName, client);
						break;
					case DISCONNECT:
					case LOGOUT:
					case LOGOFF:
						Room.disconnectClient(client, this);
						break;
                                        case FLIP:
                                            sendMessage(client, Flip());
                                            break;
                                        case ROLL:
                                            sendMessage(client, Roll());
                                            break;
                                            
                                        case MUTE:
                                            String mUser = comm2[1];
                                            client.mute(mUser);
                                            sendPrivateMessage(client, new ArrayList<String>(), "You have been muted");
                                            break;
                                        case UNMUTE:
                                            String umUser = comm2[1];
                                            client.unmute(umUser);
                                            sendPrivateMessage(client, new ArrayList<String>(), "You have been unmuted");
                                            break;
					default:
						wasCommand = false;
						break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return wasCommand;
	}

	// Command helper methods

	protected static void getRooms(String query, ServerThread client) {
		String[] rooms = Server.INSTANCE.getRooms(query).toArray(new String[0]);
		client.sendRoomsList(rooms,(rooms!=null&&rooms.length==0)?"No rooms found containing your query string":null);
	}

	protected static void createRoom(String roomName, ServerThread client) {
		if (Server.INSTANCE.createNewRoom(roomName)) {
			Room.joinRoom(roomName, client);
		} else {
			client.sendMessage(Constants.DEFAULT_CLIENT_ID, String.format("Room %s already exists", roomName));
			client.sendRoomsList(null, String.format("Room %s already exists", roomName));
		}
	}

	protected static void joinRoom(String roomName, ServerThread client) {
		if (!Server.INSTANCE.joinRoom(roomName, client)) {
			client.sendMessage(Constants.DEFAULT_CLIENT_ID, String.format("Room %s doesn't exist", roomName));
			client.sendRoomsList(null, String.format("Room %s doesn't exist", roomName));
		}
	}

	protected static void disconnectClient(ServerThread client, Room room) {
		client.setCurrentRoom(null);
		client.disconnect();
		room.removeClient(client);
	}
	// end command helper methods

        private boolean privatemessage(String message, ServerThread client){
            boolean wasPrivate = false;
            String m = message;
            try {
                if (m.indexOf("@")>-1){
                    String arr[] = m.split("@");
                    String clientName = arr[1];
                    clientName = clientName.trim().toLowerCase();
                    List<String> clientss = new ArrayList<String>();
                    clientss.add(clientName);
                    wasPrivate = true;
                    sendPrivateMessage(client, clientss, message);
            }
            }catch(Exception e){
                        e.printStackTrace();
                        }
                return wasPrivate;
            }
        
        protected void sendPrivateMessage(ServerThread sender, List<String> list, String message) {
            Iterator<ServerThread> iterator = clients.iterator();
            long from = (sender == null) ? Constants.DEFAULT_CLIENT_ID : sender.getClientId();
            while (iterator.hasNext()) {
                ServerThread client = iterator.next();
                if (list.contains(client.getClientName().toLowerCase())) {
                    boolean messageSent = client.sendMessage(from, message);
                    if (!messageSent) {
                        iterator.remove();
                    }
                    break;
                    }
                }
            }
	/***
	 * Takes a sender and a message and broadcasts the message to all clients in
	 * this room. Client is mostly passed for command purposes but we can also use
	 * it to extract other client info.
	 * 
	 * @param sender  The client sending the message
	 * @param message The message to broadcast inside the room
	 */
	protected synchronized void sendMessage(ServerThread sender, String message) {
		if (!isRunning) {
			return;
		}
		info("Sending message to " + clients.size() + " clients");
		if (sender != null && processCommands(message, sender) || privatemessage(message, sender)) {
			// it was a command, don't broadcast
			return;
		}
                message = formatMessage(message);
		long from = (sender == null) ? Constants.DEFAULT_CLIENT_ID : sender.getClientId();
		synchronized (clients) {
			Iterator<ServerThread> iter = clients.iterator();
			while (iter.hasNext()) {
				ServerThread client = iter.next();
                                    if (!client.isMuted(sender.getClientName())){
                                            boolean messageSent = client.sendMessage(from, message);
                                    if (!messageSent) {
                                            handleDisconnect(iter, client);
                                    }
                                        }
			}
		}
	}

	protected synchronized void sendUserListToClient(ServerThread receiver) {
		logger.log(Level.INFO, String.format("Room[%s] Syncing client list of %s to %s", getName(), clients.size(),
				receiver.getClientName()));
		synchronized (clients) {
			Iterator<ServerThread> iter = clients.iterator();
			while (iter.hasNext()) {
				ServerThread clientInRoom = iter.next();
				if (clientInRoom.getClientId() != receiver.getClientId()) {
					boolean messageSent = receiver.sendExistingClient(clientInRoom.getClientId(),
							clientInRoom.getClientName());
					// receiver somehow disconnected mid iteration
					if (!messageSent) {
						handleDisconnect(null, receiver);
						break;
					}
				}
			}
		}
	}

	protected synchronized void sendRoomJoined(ServerThread receiver) {
		boolean messageSent = receiver.sendRoomName(getName());
		if (!messageSent) {
			handleDisconnect(null, receiver);
		}
	}

	protected synchronized void sendConnectionStatus(ServerThread sender, boolean isConnected) {
		// converted to a backwards loop to help avoid concurrent list modification
		// due to the recursive sendConnectionStatus()
		// this should only be needed in this particular method due to the recusion
		if (clients == null) {
			return;
		}
		synchronized (clients) {
			for (int i = clients.size() - 1; i >= 0; i--) {
				ServerThread client = clients.get(i);
				boolean messageSent = client.sendConnectionStatus(sender.getClientId(), sender.getClientName(),
						isConnected);
				if (!messageSent) {
					clients.remove(i);
					info("Removed client " + client.getClientName());
					checkClients();
					sendConnectionStatus(client, false);
				}
			}
		}
	}

	private synchronized void handleDisconnect(Iterator<ServerThread> iter, ServerThread client) {
		if (iter != null) {
			iter.remove();
		}
		info("Removed client " + client.getClientName());
		checkClients();
		sendConnectionStatus(client, false);
		// sendMessage(null, client.getClientName() + " disconnected");
	}

	public void close() {
		Server.INSTANCE.removeRoom(this);
		isRunning = false;
		clients = null;
	}
        
        public String Flip(){
        int face = 0;
        String HoT;
        
        face = rand.nextInt(1);
        
        if(face == 0)
            HoT = "Heads!";
        
        else
            HoT = "Tails!";
        
        return "<font color = blue>"+HoT;
        
    }
        
        public String Roll(){
        int num;
        num = rand.nextInt(100)+1;
        String result = "You got " + num;
        return "<font color = red>"+result;
    }
        
        public static int countOccurencesInString(String str, String target) {
        if(str == null || target == null){
            return 0;
        }
        if(str.trim().length() == 0 || target.trim().length() == 0){
            return 0;
        }
        return str.split(target, -1).length -1; //(str.length() - str.replace(target, "").length()) / target.length();
    }
        
        protected String formatMessage(String message) {
            String alteredMessage = message;
            
            if (converter == null){
                converter = new HashMap<String, String>();
                
                converter.put("\\*{2}", "<b>|</b>");
                converter.put("--", "<i>|</i>");
                converter.put("__", "<u>|<u>");
                converter.put("#r#", "<font color = red>|</font>");
                converter.put("#g#", "<font color = green>|</font>");
                converter.put("#b#", "<font color = blue>|</font>");
            }
            
            for (Entry<String, String> kvp : converter.entrySet()){
                if (countOccurencesInString(alteredMessage, kvp.getKey().toLowerCase()) >= 2){
                    String[] s1 = alteredMessage.split(kvp.getKey().toLowerCase());
                    String m = "";
                    for (int i = 0; i < s1.length; i++){
                        if(i%2 == 0){
                            m += s1[i];
                        }
                        else {
                            String[] wrapper = kvp.getValue().split("\\|");
                            m += String.format("%s%s%s", wrapper[0], s1[i], wrapper[1]);
                        }
                    }
                    alteredMessage = m;
                }
            }
            return alteredMessage;
           }
       
}