// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class PositiveNegativeZeroCheck to check whether a number is positive, negative, or zero
class PositiveNegativeZeroCheck
{
   public static void main(String args[])
   {
     // Create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	 // Create a variable to store the number
	 int number;
	 
	 // Displaying a message to take input for the number
	 System.out.println("Enter a number: ");
	 number = input.nextInt();
	 
	 // Checking if the number is positive, negative, or zero
	 if (number > 0) 
	 {
	     System.out.println("positive");
	 } 
	 else if (number < 0) 
	 {
	     System.out.println("negative");
	 } 
	 else 
	 {
	     System.out.println("zero");
	 }
   }
}
