<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone 2</td></tr>
<tr><td> <em>Student: </em> Jarrett Kuhn(jck38)</td></tr>
<tr><td> <em>Generated: </em> 7/17/2022 10:17:46 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-chatroom-milestone-2/grade/jck38" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone2 from the proposal document:&nbsp; <a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Server will have the functionality to switch users between “Rooms” </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Screenshots of lobby</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://i.gyazo.com/2ba74a620e838d35189243a8eddb28ba.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>The server running, showing two users (Thread-0 and Thread-2) joining the Lobby<br></p>
</td></tr>
<tr><td><img width="768px" src="https://i.gyazo.com/9e9021c5e0c25be428b7a6c3605d4a53.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>User 1 (Jerald) saying hi and then User 2 (Luff) saying hello, showing<br>some communication between two users.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Screenshots of different room</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://i.gyazo.com/c3c85acb713c499c9f1658c623f51291.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Jerald creating a new room called &quot;secret&quot;<br></p>
</td></tr>
<tr><td><img width="768px" src="https://i.gyazo.com/faa460a34009735fd3012b7f01d51fa1.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>User 1 (Thread-0) leaving the lobby and entering new room &quot;secret&quot;<br></p>
</td></tr>
<tr><td><img width="768px" src="https://i.gyazo.com/1818ca45dff8fc337268492da02331ca.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>User Luff typing &quot;he left :(&quot; in the lobby<br></p>
</td></tr>
<tr><td><img width="768px" src="https://i.gyazo.com/328b7f61aa82e68b5ac67f0463088c1c.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Jerald in the new secret room saying &quot;hi&quot;, he cannot see Luff&#39;s message<br>and Luff cannot see his.<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Payload </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Payload Screenshots</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://i.gyazo.com/f6afbe4c440222a07a7f39cde36f72fc.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>My code for the Payload.java file, showing how the project handles the paylods<br>and the format in which it is sent to the terminal.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://i.gyazo.com/b18ddb1ae2be6797afd48aa32d9a5cb5.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Screenshot of the server showing an example of the payload&#39;s content, including the<br>message type and what the message was.<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Server-side commands </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the mentioned commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://i.gyazo.com/3ab1276741053e1ee0cc595f17a00ea2.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>My code for the /roll and /flip commands, I set an int to<br>0 and had either 0 or 1 generated, with each of those corresponding<br>to a different face on the coin. For the roll, I just had<br>it generate a random number between 1 and 100 and it returns a<br>short statement saying &quot;You got&quot; + the number.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://i.gyazo.com/622393df4a93a2d8974732cf59dd3668.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>The implementation of turning the method into an actual command for the server<br>to recognize.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Explain the logic/implementation of each commands</td></tr>
<tr><td> <em>Response:</em> <p>/Roll works by generating a number between 1 and 100 and returning a<br>statement containing the number. /Flip works by generating either a 0 or a<br>1, and based on which of the two it will return either heads<br>or tails.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Text Display </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/f2c037/000000?text=Partial"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the various style handling</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://i.gyazo.com/3cef45b7d5f746a4ebbeb4a56271c374.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>I was still trying to figure out the way to  convert characters<br>in java to bold/italics/change the color/underline, but I set down ground work for<br>how to differentiate the styles using a similar system to how the server<br>commands work.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show source message and the result output in the terminal (note, you won't actually see the styles until Milestone3)</td></tr>
<tr><td><table><tr><td>Missing Image</td></tr>
<tr><td> <em>Caption:</em> (missing)</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Explain how you got each style applied</td></tr>
<tr><td> <em>Response:</em> <p>(missing)</p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 5: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Include the pull request for Milestone2 to main</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/jrt-kuhn/IT114-450/pull/7">https://github.com/jrt-kuhn/IT114-450/pull/7</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-chatroom-milestone-2/grade/jck38" target="_blank">Grading</a></td></tr></table>
