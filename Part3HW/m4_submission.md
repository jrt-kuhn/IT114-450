<table><tr><td> <em>Assignment: </em> IT114 - Sockets Part 1 - 3</td></tr>
<tr><td> <em>Student: </em> Jarrett Kuhn(jck38)</td></tr>
<tr><td> <em>Generated: </em> 6/22/2022 12:01:29 AM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-sockets-part-1-3/grade/jck38" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create a new branch for this assignment</li><li>Go through the socket lessons and get each part implemented (parts 1-3)</li><li>Create a new folder called Part3HW</li><li>Create an empty m4_submission.md file in Part3HW</li><li>Add/commit/push the branch</li><li>Create a pull request to main and keep it open</li><li>Copy the the Part3 code into this new folder</li><li>Git add/commit all of the sample code and the Part3HW code</li><li>Implement two of the following server-side activities for all connected clients (majority of the logic should be processed server-side and broadcasted to all clients if/when applicable)</li><ol><li>Simple number guesser where all clients can attempt to guess</li><ol><li>Hint: may want separate commands to start, stop, and guess (or starting lasts for x rounds then stops)</li><li>No need to implement complexities like strikes</li></ol><li>Coin toss command (random heads or tails)</li><li>Dice roller given a command and text format of "roll #d#" (i.e., roll 2d6)</li><li>Math game (server outputs a basic equation, first person to guess it right gets congradulated and a new equatiion is given)</li><ol><li>Hint: may want a separate start, stop, answer commands (or starting lasts for x rounds then stops)</li></ol><li>Private message (a client can send a message targetting another client where only the two can see the messages)</li><li>Message shuffler (randomizes the order of the characters of the given message)</li></ol><li>Fill in the below deliverables</li><li>Save and generated the markdown or markdown file</li><li>Update the m4_submission.md file in the Part3HW folder</li><li>Add/commit/push your changes</li><li>Merge the pull request</li><li>From the M4-Sockets branch, navigate to your m4_submission.md file on github and copy the link</li><li>Submit the direct link to Canvas</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Baseline </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add as many screenshots as necessary to show basic communication among 3 clients and 1 server</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://i.gyazo.com/5347cfd88237a40ffa1b68202207bdc3.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>There are 3 users all of whom type a message each other and<br>they all show up for each other.<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Feature Implementation 1 </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> What feature did you pick? Briefly explain how you implemented it</td></tr>
<tr><td> <em>Response:</em> <p>The first implementation I did was a coin toss method which uses the<br>command &quot;coin&quot; in order to run. It then randomizes either 0 or 1<br>and based upon which number it generates it assigns the coin to heads<br>or tails which it then broadcasts.<br></p><br></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot(s) showing the implemented feature working</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://i.gyazo.com/a36b11d37a87bcfe4867f1ee30125143.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>User 18 entered &quot;coin&quot;, running the coin toss and they got heads so<br>it broadcasted &quot;Heads!&quot; from that user.<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Feature Implementation 2 </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> What feature did you pick? Briefly explain how you implemented it</td></tr>
<tr><td> <em>Response:</em> <p>The second implementation I did was the dice roll, using the command of<br>&quot;roll xdx&quot; in order to run (with both x&#39;s being numbers). The numbers<br>are then rolled in a for statement and added to the total which<br>is broadcast using the user&#39;s id.<br></p><br></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot(s) showing the implemented feature working</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://i.gyazo.com/167c5b75897957596b89b1eb48ba0f6c.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>User 17 rolls 2 6-sided dice and gets 6 and then rolls 5<br>8-sided dice and gets 18.<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/f2c037/000000?text=Partial"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Did you have an issues and how did you resolve them? If no issues, what did you learn during this assignment that you found interesting?</td></tr>
<tr><td> <em>Response:</em> <p>I had a time issue with this assignment (personal issue, not excused). Assignment-wise,<br>I was confused on where to start, the instructions were clear but looking<br>through all of the files confused me as well as looking through all<br>of the slides and documentation made me overthink some of the steps.<br></p><br></td></tr>
<tr><td> <em>Sub-Task 2: </em> Pull request link</td></tr>
<tr><td>Not provided</td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-sockets-part-1-3/grade/jck38" target="_blank">Grading</a></td></tr></table>
