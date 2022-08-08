<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone4</td></tr>
<tr><td> <em>Student: </em> Jarrett Kuhn(jck38)</td></tr>
<tr><td> <em>Generated: </em> 8/7/2022 1:06:40 AM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-chatroom-milestone4/grade/jck38" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone3 from the proposal document:&nbsp;&nbsp;<a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Client can export chat history of their current session (client-side) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot of related UI</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://i.gyazo.com/94544c384333225b87da6b5593d57aa6.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Showing the text chat going on between 2 Clients (proof for second screenshot)<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot of exported data</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://i.gyazo.com/ee870eb132cdcdf7e8d5726072d7dfef.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Screenshot of the export.txt file containing the text that was typed into the<br>chatroom<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>I made a List&lt;String&gt; (ArrayList&lt;String&gt;) called chatHistory where I stored the entire conversation<br>and then created an export.txt file (or deleted said file and replaced it<br>by creating another with the same name) and, using a FileWriter, I appended<br>to the desired file (export.txt) and then closed the FileWriter. I then created<br>a command (/export) which just called the creating of the export.txt function and<br>then the function that would write to the export.txt file.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Client's mute list will persist across sessions (server-side) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a screenshot of how the mute list is stored</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://i.gyazo.com/136db2b93b4b398fbf82324a142157a2.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Using logic similar to my exporting of chat history, I exported whatever was<br>inside of the value of the muteCheck hashMap (the value is a <String><br>ArrayList containing the muted users) to a file named after the client.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add a screenshot of the code saving/loading mute list</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://i.gyazo.com/c9ef6f40a2417f5841e0f72a0d795e0f.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>I took a similar mutedClients ArrayList that I used in my previous version<br>of muting/unmuting and I just copied whatever is from the file named after<br>the client (iterates through every line and prints it into the ArrayList).<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>I made two functions, one for exporting and one for importing the muteList.<br>For the actual muteList it was moved into a HashMap containing the name<br>of the client and then the value being an ArrayList &lt;String&gt;&nbsp; which would<br>function as the muted clients. In the export, I read the values for<br>a name and recorded them down into a file named after the client.<br>In the import, I scanned the file of the client&#39;s name, and iterated<br>through adding every line (muted user) into another ArrayList that would be returned<br>for use by the export/muteCheck (HashMap).<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Client's will receive a message when they get muted/unmuted by another user </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a screenshot showing the related chat messages</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://i.gyazo.com/07e57dc749ab667978980c370fc4b4c9.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Private message being sent to test2 upon being muted by test1.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add a screenshot of the related code snippets</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://i.gyazo.com/2abda6e68d24502328b6aed02286cd6d.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Private message being sent to test2 upon being unmuted by test1 (not sure<br>why the gap is so big).<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>I utilized the sendPrivateMessage function in my case for both the MUTE and<br>UNMUTE cases, where each one sends a private message saying Client.getClientName() has muted/unmuted<br>you.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> User list should update per the status of each user </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/ff0000/000000?text=Incomplete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot for Muted users by the client should appear grayed out</td></tr>
<tr><td><table><tr><td>Missing Image</td></tr>
<tr><td> <em>Caption:</em> (missing)</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot for Last person to send a message gets highlighted</td></tr>
<tr><td><table><tr><td>Missing Image</td></tr>
<tr><td> <em>Caption:</em> (missing)</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>(missing)</p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-chatroom-milestone4/grade/jck38" target="_blank">Grading</a></td></tr></table>
