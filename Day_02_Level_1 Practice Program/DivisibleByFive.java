// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class DivisibleByFive to check if a number is divisible by 5
class DivisibleByFive
{
   public static void main(String args[])
   {
     // Create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	 // Create a variable number to store the user input number
	 int number;
	 
	 // Displaying a message to take input for the number
	 System.out.println("Enter a number ");
	 number = input.nextInt();
	 
	 // Checking if the given number is divisible by 5 or not
	 if (number % 5 == 0) 
	 {
	     System.out.println("Is the number " + number + " divisible by 5? Yes");
	 } 
	 else 
	 {
	     System.out.println("Is the number " + number + " divisible by 5? No");
	 }
   }
}
