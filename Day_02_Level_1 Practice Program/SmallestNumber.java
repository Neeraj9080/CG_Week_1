// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class SmallestNumber to check if the first number is the smallest of the three
class SmallestNumber
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
	 
	 // Checking if the first number is the smallest
	 if (number1 < number2 && number1 < number3) 
	 {
	     // Displaying the result if the first number is the smallest
	     System.out.println("Is the first number the smallest? Yes");
	 } 
	 else 
	 {
	     // Displaying the result if the first number is not the smallest
	     System.out.println("Is the first number the smallest? No");
	 }
   }
}
