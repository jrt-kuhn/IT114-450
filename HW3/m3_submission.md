<table><tr><td> <em>Assignment: </em> IT114 - Number Guesser</td></tr>
<tr><td> <em>Student: </em> Jarrett Kuhn(jck38)</td></tr>
<tr><td> <em>Generated: </em> 6/11/2022 10:15:54 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-number-guesser/grade/jck38" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create the below branch name</li><li>Implement the NumberGuess4 example from the lesson/slides</li><li>Add/commit the files as-is from the lesson material</li><li>Pick 2 of the following options to implement</li><ol><li>Display higher or lower as a hint after a wrong guess</li><li>Implement anti-data tampering of the save file data (reject edits)</li><li>Add a difficulty selector that adjusts the max strikes per level</li><li>Display a cold, warm, hot indicator based on how close to the correct value the guess is (example, 10 numbers away is cold, 5 numbers away is warm, 2 numbers away is hot; adjust these per your preference)</li><li>Add a hint command that can be used once per level and only after 2 strikes have been used that reduces the range around the correct number (i.e., number is 5 and range is initially 1-15, new range could be 3-8 as a hint)</li><li>Implement separate save files based on a "What's your name?" prompt at the start of the game</li></ol><li>Fill in the below deliverables</li><li>Create an m3_submission.md file and fill in the markdown from this tool when you're done</li><li>Git add/commit/push your changes to the HW branch</li><li>Create a pull request to main</li><li>Complete the pull request</li><li>Grab the link to the m3_submission.md from the main branch and submit that direct link to github</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Implementation 1 (one of the picked items) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Two Screenshots: Add a screenshot demonstrating the feature during runtime; Add a screenshot (or so) of the snippets of code that implement the feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://i.gyazo.com/afce3aad7997232a2621a51289a277c8.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>I implemented a hint telling the user if their guess was higher or<br>lower than the target number. I used a simple if and else if<br>statement comparing the guess to the number.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://i.gyazo.com/72e39e81207d258ac095165b19bf7f65.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Code in motion<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the logic behind your implementation</td></tr>
<tr><td> <em>Response:</em> <p>I used an if and else if statement comparing the guess to the<br>number and based on whether the number was higher or lower than the<br>target it lets the user know.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Implementation 2 (one of the picked items) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Two Screenshots: Add a screenshot demonstrating the feature during runtime; Add a screenshot (or so) of the snippets of code that implement the feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://i.gyazo.com/40907eda6278563e28e665135d1db9b9.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>I implemented a difficulty system in which the user enters E, M or<br>H and sets the number of maxStrikes based on their difficulty choice.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://i.gyazo.com/b9426650a7f3076849243bcf387ce572.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Code in motion<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the logic behind your implementation</td></tr>
<tr><td> <em>Response:</em> <p>I used&nbsp; two println statements to let the user know that they will<br>be selecting a difficulty and defining the parameters for the difficulty selection (E,<br>M or H). Then I take the nextLine of input and (not case<br>sensitive!) based on their response of &quot;e&quot;, &quot;m&quot; or &quot;h&quot; it sets the<br>max number of Strikes to 8, 5 or 3 respectively using an if/else<br>if statement.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/f2c037/000000?text=Partial"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a link to the related pull request of this hw</td></tr>
<tr><td>Not provided</td></tr>
<tr><td> <em>Sub-Task 2: </em> Discuss anything you learned during this lesson/hw or any struggles you had</td></tr>
<tr><td> <em>Response:</em> <p>I learned about some of the try/catches that are used as well as<br>the methodology of setting a &quot;quit&quot; out of something that would normally look<br>for a number. I also got a refresh on the .equalsIgnoreCase method and<br>how useful it can be for allowing a user to have freedom with<br>their response.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-450-M22/it114-number-guesser/grade/jck38" target="_blank">Grading</a></td></tr></table>
