*/When to use functions:*/

When repeating the same lines of code 2+ times.
Lenghtly code.

if the lenght of my function does not fit in the screen, the function is not clean because is too long.
Each function must be based in one purpose.

// feeding a person
System.out.println("Break 2 eggs on a pan"); 
System.out.println("Add chopped vegetables"); 
System.out.println("Stir occasionally for 2 mins");

// feeding another person
System.out.println("Break 2 eggs on a pan"); 
System.out.println("Add chopped vegetables"); 
System.out.println("Stir occasionally for 2 mins");

// OR GOOD PROGRAMMING PRACTICES :)
// define a function
public void makeOmelet() {
System.out.println("Break 2 eggs on a pan"); 
System.out.println("Add chopped vegetables"); 
System.out.println("Stir occasionally for 2 mins");
}

// feeding a person
makeOmelet()

// feeding another person
makeOmelet()
