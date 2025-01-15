// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class CheckPositiveNegativeZero to check if the given number is positive , negative or zero;
class CheckPositiveNegativeZero
{
  public static void main(String[] args)
  {
    // Create an object of Scanner class to take input from the user
       Scanner input = new Scanner(System.in);
	   
	// Create a variable named arraySize and assign value 5
	   int arraySize = 5;  
	   
    // Declare a array named numbers to store the numbers entered by user
       int[] numbers = new int[arraySize];
	   
	// loop start from 0 and goes to 5   
	   for(int i=0;i<5;i++)
	   {
         // Prompt to user to enter a number
         System.out.println("Enter the number"+(i+1));
         numbers[i] = input.nextInt();
		 
		 // checking the given number is positive, negative or zero
		 if (numbers[i] > 0 )
		 {
		     // checking the given number is even or odd
		     if(numbers[i]%2 == 0)
		     System.out.println("The given number is even number "); 
			 
			 else
		     System.out.println("The given number is odd number "); 	 
		 }
		 else if ( numbers[i] == 0 )
		 {
		     System.out.println("The given number is zero "); 
		 }
		 else
		 {
		     System.out.println("The given number is negative ");
		 }
		}
		
		// checking first and last number is equal,greater or less
		if(numbers[0] > numbers[4])
		{
		     System.out.println("First number is greater than last number"); 
		}
		else if(numbers[0] == numbers[4])
		{
		     System.out.println("First number and last number both are equal"); 
		}
		else
		{
		     System.out.println("First number is smaller than last number"); 
		}
	}	
} 	   