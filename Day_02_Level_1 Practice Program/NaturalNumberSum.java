// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class NaturalNumberSum to check if a given number is natural or not and calculate the sum of n natural numbers
class NaturalNumberSum
{
   public static void main(String args[])
   {
     // Create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	 // Create a variable to store the input number
	 int number;
	 
	 // Displaying a message to take input for the number
	 System.out.println("Enter a number: ");
	 number = input.nextInt();
	 
	 // Checking if the number is positive or not
	 if (number > 0) 
	 {
	     // Calculate the sum of first n natural numbers
	     int sum = number * (number + 1) / 2;
		 
	     // Displaying the sum result
	     System.out.println("The sum of " + number + " natural numbers is " + sum);
	 } 
	 else 
	 {
	     // Displaying the message if not a natural number
	     System.out.println("The number " + number + " is not a natural number");
	 }
   }
}
