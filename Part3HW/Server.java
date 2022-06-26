import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Server {
    int port = 3001;
    Random rand = new Random();
    // connected clients
    private List<ServerThread> clients = new ArrayList<ServerThread>();

    private void start(int port) {
        this.port = port;
        // server listening
        try (ServerSocket serverSocket = new ServerSocket(port);) {
            Socket incoming_client = null;
            System.out.println("Server is listening on port " + port);
            do {
                System.out.println("waiting for next client");
                if (incoming_client != null) {
                    System.out.println("Client connected");
                    ServerThread sClient = new ServerThread(incoming_client, this);
                    
                    clients.add(sClient);
                    sClient.start();
                    incoming_client = null;
                    
                }
            } while ((incoming_client = serverSocket.accept()) != null);
        } catch (IOException e) {
            System.err.println("Error accepting connection");
            e.printStackTrace();
        } finally {
            System.out.println("closing server socket");
        }
    }
    protected synchronized void disconnect(ServerThread client) {
		long id = client.getId();
        client.disconnect();
		broadcast("Disconnected", id);
	}
    
    protected synchronized void broadcast(String message, long id) {
        if(processCommand(message, id)){

            return;
        }
        // let's temporarily use the thread id as the client identifier to
        // show in all client's chat. This isn't good practice since it's subject to
        // change as clients connect/disconnect
        message = String.format("User[%d]: %s", id, message);
        // end temp identifier
        
        // loop over clients and send out the message
        Iterator<ServerThread> it = clients.iterator();
        while (it.hasNext()) {
            ServerThread client = it.next();
            boolean wasSuccessful = client.send(message);
            if (!wasSuccessful) {
                System.out.println(String.format("Removing disconnected client[%s] from list", client.getId()));
                it.remove();
                broadcast("Disconnected", id);
            }
        }
    }

    private boolean processCommand(String message, long clientId){
        System.out.println("Checking command: " + message);
        if(message.equalsIgnoreCase("disconnect")){
            Iterator<ServerThread> it = clients.iterator();
            while (it.hasNext()) {
                ServerThread client = it.next();
                if(client.getId() == clientId){
                    it.remove();
                    disconnect(client);
                    
                    break;
                }
            }
            return true;
        }
        
        else if(message.startsWith("roll") || message.startsWith("Roll")){
            String[] k = message.split(" ");
            String[] l = k[1].split("d");
            broadcast(Dice(Integer.parseInt(l[0]), Integer.parseInt(l[1])), clientId);
            return true;
        }
        
        else if (message.equalsIgnoreCase("coin")){
            broadcast(Coin(), clientId);
            return true;
        }
        return false;
    }
    
    public String Coin(){
        int face = 0;
        String HoT;
        
        face = rand.nextInt(1);
        
        if(face == 0)
            HoT = "Heads!";
        
        else
            HoT = "Tails!";
        
        return HoT;
        
    }
            
    public String Dice(int d, int di){
        int dice, die, result = 0, total = 0;
        dice = d;
        die = di;
        
        for (int i = 0; i<dice; i++){
            result = rand.nextInt(die)+1;
            total += result;
        }
        
        
        return "You got " + total;
    }
    public static void main(String[] args) {
        System.out.println("Starting Server");
        Server server = new Server();
        int port = 3001;
        try {
            port = Integer.parseInt(args[0]);
        } catch (Exception e) {
            // can ignore, will either be index out of bounds or type mismatch
            // will default to the defined value prior to the try/catch
        }
        server.start(port);
        System.out.println("Server Stopped");
    }
}