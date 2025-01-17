// Importing Scanner class for user input
import java.util.Scanner;
// Importing Random class for random number
import java.util.Random;

// creating a class GuessingGame to guess a user's number
class GuessingGame
{
    
   // Method generateRandomNumber to generate Random number	
   public static int generateRandomNumber()
   {
     Random randomNumber = new Random();
	 // generate Random number input in random from 0 to 99
	 return randomNumber.nextInt(100);
   }
   
   // Method guessingNumber to perform guessing operation
   public static String guessingNumber()
   {
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number between 1 to 100 \nThe machine will guess the number ");
		int number = input.nextInt();
		
		System.out.println("Guessed Number by machine is " + generateRandomNumber());
		System.out.println("Please enter your feedback in following three options   \n High  \n Low  \n Correct ");
		String feedback = input.next();
		
		return feedback;
   }
   
   // Main method
   public static void main(String[] args)
   { 
       Scanner input = new Scanner(System.in);
	   
	   // Taking user input
	   System.out.println("Welcome, to the number guessing game");
	   
	   // running an infinte loop
	   while(true)
	   { 
            // Taking user input
            System.out.println("Select any one option ");
	        System.out.println(" \n 1. Play  \n 2. Exit ");
	        int option = input.nextInt();
			
	        if(option == 2)
			{
			   break;
			}
			else
			{
			   if(option == 1)
			   {
				  System.out.println("Given feedback is " + guessingNumber());
			   }
			   else
			   {
			      System.out.println("Error, Invalid Selection");
			   }
			}
	   }
   }
}