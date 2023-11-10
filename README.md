# Assignment1_Adeline
Simple 
Calculator
Assignment 1
Simple Calculator
Part 1 – Stander Version
• Calculator app is a special version of a 
standard calculator with some extra 
features. The calculator has two versions, 
standard and advance.
Simple Calculator 
Part 1 – Stander Version implementation
• All operands used in this calculator have 
one digit only, so for example we can do 4 
+ 3 or 8 – 7 but not 11 – 2.
• All operators in this calculator are 
calculated in the order of entering from 
left to right (no priority), for example 11 -
2 * 4 = 36, 3 + 5 – 4 * 2 =8
Simple Calculator 
Part 1 – Stander Version UI
• Simple Calculator app has one activity only.
• You have to design the UI using Linear 
Layout ONLY, add those components for 
the stander verson
• 10 buttons for the digits (0 – 9)
• 5 buttons for the operators (+ - * / =)
• Clear button
• Text View for the result
Simple Calculator 
Part 1 – Stander Version logic
• Simple Calculator app need a logic to be placed in a Java Class 
called Calculator.
• You have to manage the logic of this calculator in Calculator 
class not in Main Activity class.
• Add two functions to your class:
• Push function void push (String value), add all user's 
values in one list including the operands and the 
operators.
• Calculate function int calculate(), pares the string list and 
calculate the result.
Simple Calculator Features
Part 1 – Stander Version logic
Implementation example: Assume the user enter this line 3 + 4 – 2 * 5 =
The calculator list will have 7 elements
[ "3", "+" , " 4" , " - " , "2" , "*", "5"] the result must be 25.
During parsing the list
• 3 is considered the first operand and 4 is considered the second 
operand to calculate the result of the first operator "+" which is 7.
• Then 7 is considered the first operand and 2 is considered the second 
operand to calculate the result of the second operator "-" which is 5.
• Lastly 5 is considered the first operand and 5 is considered the 
second operand to calculate the result of the third operator "*" which is 25.
Simple Calculator 
Part 2 – Advance Version implementation
• Clicking on "Advance – With History" button 
moves the calculator to an advance mode, 
where the calculator could save the history of 
operators in a Text View.
• When the user click on that button, its title 
must be changed to be "Standard – No 
History"
• After each calculation, and when the user 
click on "=" button, the new operator inserted 
in the history text.
• If the user return to standard version, the 
history text must disappear.
Simple Calculator 
Part 2 – Advance Version UI
• Advance version UI components are
• A button underneath the calculator with 
the text "Advance – With History"
• A text View with multiple lines.
Simple Calculator 
Part 2 – Advance Version logic
• You have to add the needed 
variables and functions to 
Calculator class manage the 
printing of operator history and 
the calculator mode.
