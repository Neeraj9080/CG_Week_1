// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class SumUntilZero to find the sum of numbers until the user enters 0
class SumUntilZero
{
   public static void main(String args[])
   {
     // Create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	 // Create a variable to store the total sum
	 double total = 0.0;
	 
	 // Infinite loop to take user input until 0 is entered
	 while (true) 
	 {
	     // Displaying a message to take input from the user
	     System.out.println("Enter a number (0 to stop): ");
	     double number = input.nextDouble();
	     
	     // Breaking the loop if user enters 0
	     if (number == 0) 
		 {
	         break;
	     }
	     
	     // Adding the number to total
	     total = total + number;
	 }
	 
	 // Displaying the total sum
	 System.out.println("The total sum is " + total);
   }
}
