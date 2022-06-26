<table><tr><td> <em>Assignment: </em> It114 Milestone1</td></tr>
<tr><td> <em>Student: </em> Jarrett Kuhn(jck38)</td></tr>
<tr><td> <em>Generated: </em> 6/26/2022 6:49:42 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-milestone1/grade/jck38" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create a new branch called Milestone1</li><li>At the root of your repository create a folder called Project</li><li>Create a milestone1.md file inside the project folder</li><li>Git add/commit/push it to Github</li><li>Create a pull request from Milestone1 to main (don't complete/merge it yet)</li><li>Copy in the latest Socket sample code from the most recent Socket Part example</li><ol><li>Recommended Part 5, but Part 4 should be sufficient</li></ol><li>Git add/commit the baseline</li><li>Ensure the sample is working and fill in the below deliverables</li><li>Get the markdown content or the file and paste it into the milestone1.md file or replace the file with the downloaded version</li><li>Git add/commit/push all changes</li><li>Complete the pull request merge from step 5</li><li>Locally checkout main</li><li>git pull origin main</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Startup </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot showing your server being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://i.gyazo.com/9c1f3673d516928886dc8f8c4384ef62.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Screenshot shows the server starting, listening on port 3000 for any clients to<br>connect.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot showing your client being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://i.gyazo.com/1d2a3a68b46ed1154f32037a6daebb79.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Screenshot shows my client file connecting to localhost and then I typed &quot;hi&quot;<br>just to test the connection.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the connection process</td></tr>
<tr><td> <em>Response:</em> <p>The server-side of the connection relies on the Server file to create a<br>thread (from the ServerThread file) connecting the server to the client and then<br>listens on port 3000 for any connections and when a client attempts to<br>connect (assuming they have a name), it will connect them.<div>--</div><div>The client-side of connection<br>also is reliant on the Thread and attempts to conenct to whatever port<br>is specified (3000 in this case) and is connected if the server is<br>listening on that port.<br></div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Sending/Receiving </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist on the right</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://i.gyazo.com/b7d54df9f880d2705ea9bcbaade43b69.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot shows two clients (jrt and rick) connected to the server sending<br>a message to each other, they are both in the same room so<br>they can see each other&#39;s messages.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://i.gyazo.com/43f2767d5f153efbef9417a7bf9ebfba.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot shows jrt creating a new room, r1, and typing hi, he<br>can no longer receive messages from rick.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://i.gyazo.com/ab470daaeacc50d10a8d6747dc081cb7.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot shows rick seeing jrt disconnect from his room and he types<br>&quot;oh no :(&quot;, jrt does not receive this message the same way rick<br>did not receive jrt&#39;s hi message.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the messages are sent, broadcasted, and received</td></tr>
<tr><td> <em>Response:</em> <p>From the client perspective, you simply type any message and it will be<br>broadcast into whatever room the client is currently in.<div>--</div><div>From the ServerThread perspective, a<br>message is sent from the sendMessage() method using the payload type of message<br>in order to know if the client sends a message or not.</div><div>--</div><div>From the<br>room perspective, clients must be in the same room to communicate with each<br>other, and messages will only be broadcasted into whatever room they are currently<br>in.</div><div>--</div><div>From the client perspective (receiving),&nbsp; a message is sent and then proceeded to<br>be broadcast (broadcast method in the Server file) with whatever the client&#39;s name<br>is being sent as an identifier of who sent the message.</div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Disconnecting / Terminating </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist on the right</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://i.gyazo.com/fe544405771394189f12b55155d80570.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot shows the jrt user disconnecting from the server, he receives a<br>message after typing the command /disconnect.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://i.gyazo.com/c3f4c7ea3f405c600c1b06a1a0a0d440.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot shows the client being disconnected because the server was terminated, but<br>the client is still running.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the various disconnects/terminations are handled</td></tr>
<tr><td> <em>Response:</em> <p>From a socket perspective, the client gets disconnected when the socket gets closed<br>in the close() method in the Client file, and this method is ran<br>upon disconnecting from the server (or when the cleanup() method is ran in<br>the ServerThread file).<div>--</div><div>Clients don&#39;t crash because the listenforkeyboard() method will continuously run while<br>the isRunning is set to true, and is only set to false if<br>the user types /disconnect and if the server itself terminates, the program receives<br>an error but catches said error and breaks out of the loop, running<br>the close() method.</div><div>--</div><div>Server doesn&#39;t crash from the client disconnecting because the run() method<br>in the ServerThread file catches&nbsp; (Exception e), being the error when the client<br>disconnects and sets the isRunning to false for the client before running the<br>cleanup() method to properly close the connection.</div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add the pull request for this branch</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/jrt-kuhn/IT114-450/pull/6">https://github.com/jrt-kuhn/IT114-450/pull/6</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-milestone1/grade/jck38" target="_blank">Grading</a></td></tr></table>
