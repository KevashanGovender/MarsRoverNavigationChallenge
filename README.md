**Mars Rover Navigation Program**

* **Instructions**
    * Run the main method in the class Main, the program will guide you through the input instructions
    

---

* This was a rather interesting little project after doing android development for the last two years, it felt really 
good to go back to the basics with just a straight java console application. When I first read the problem I was slightly 
confused and started thinking about two dimensional arrays and needing to store values  in a temporary array, I was
basically having a hard time visualizing the solution for this application in my head so I decided that when I got home 
I would draw the problem out and try to solve it on paper first then translate the solution into code.


* Before attempting to solve the logic of the solution I decided to create the model objects that this application would
need. First I chose to use enums for the direction and the instruction as these were static and would not change,  next
was the rover, I knew from the brief that the rover would need to have a starting x-axis position, a starting y-axis 
position and a initial direction, and with this is mind I architected the rover object.


* After solving the problem on paper I saw that I would need some sort of flow controller and thats where the NavigationUtil
comes into play. I started with the unit tests for this class, by thinking that if the rovers direction was North and one
of the three instructions were received there were only three possible outcomes, the rover would either move forward, change 
direction to EAST or to change direction to WEST, to get this test to pass I implemented three if statements, each checking 
if the initial direction was North, and checking what the instruction was and then performing that instruction. During 
the refactoring step after the tests had gone green I simplified the if statements into switch statements as this made the 
class look a little cleaner and easier to read. The same process was followed for the other directions.


* The main method of this project started of as a hardcoded program, this was done to fully test the application and the logic
kind of like an integration test, I hard coded the values from the brief and verified that the end position of the rover
was the same as that of the brief. After that verification did I start to implement the code to actually get user input,
I tried to make the instructions as clear as possible and give the user the valid options. Upon entering an invalid option
for a direction I immediately kill the application. There is some logic in the "view"(main method) thats untested but this was
a needed evil for the loop to get the instructions to work correctly, had this been an android application, that logic would have
sat in the viewmodel and I would have had a callback to the view to show the rovers final position.

* There is also some helper util classes that the main method references and the purpose of these were to help translate 
the user input into either a direction enum or instruction enum.