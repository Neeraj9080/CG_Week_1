// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class LargestNumber to check if the first, second, or third number is the largest
class LargestNumber
{
   public static void main(String args[])
   {
     // Create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	 // Create variables to store the three input numbers
	 int number1, number2, number3;
	 
	 // Displaying a message to take input for the first number
	 System.out.println("Enter first number ");
	 number1 = input.nextInt();
	 
	 // Displaying a message to take input for the second number
	 System.out.println("Enter second number ");
	 number2 = input.nextInt();
	 
	 // Displaying a message to take input for the third number
	 System.out.println("Enter third number ");
	 number3 = input.nextInt();
	 
	 // Checking if the first number is the largest
	 System.out.println("Is the first number the largest? " + (number1 > number2 && number1 > number3 ? "Yes" : "No"));
	 
	 // Checking if the second number is the largest
	 System.out.println("Is the second number the largest? " + (number2 > number1 && number2 > number3 ? "Yes" : "No"));
	 
	 // Checking if the third number is the largest
	 System.out.println("Is the third number the largest? " + (number3 > number1 && number3 > number2 ? "Yes" : "No"));
   }
}
