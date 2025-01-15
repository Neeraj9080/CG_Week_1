// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class PositiveNegativeZeroCheck to check whether a number is positive, negative, or zero
class PositiveNegativeZeroCheck
{
    
	//creating a method checkPostiveNegativeZero to check whether a number is positive, negative, or zero
	int checkPostiveNegativeZero(int number)
	{
	  // Checking if the number is positive, negative, or zero
	 if (number > 0) 
	 {
	     return 1;
	 } 
	 else if (number < 0) 
	 {
	     return -1;
	 } 
	 else 
	 {
	     return 0;
	 }
	}
	
   public static void main(String args[])
   {
     // Create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	 // Create a variable to store the number
	 int number;
	 
	 // Displaying a message to take input for the number
	 System.out.println("Enter a number: ");
	 number = input.nextInt();
	 
	 // creating object of the PositiveNegativeZeroCheck class
	 PositiveNegativeZeroCheck obj = new PositiveNegativeZeroCheck();
	 
	 //Displaying the result
	 System.out.println(obj.checkPostiveNegativeZero(number));
   }
}
