// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class HeightCalculation to calculate height of players present in a football team
class HeightCalculation
{
    public static void main(String[] args)
  {
    // Create an object of Scanner class to take input from the user
       Scanner input = new Scanner(System.in);
	   
	// Declare a array named heightOfPlayers to store height of player
       int[] heightOfPlayers = new int[11];
    
    // loop start from 0 and goes to 10
       for(int i=0;i<11;i++)
       {
         //prompt to the user to enter height of the player
         System.out.println("Enter the height of the player ");
		 heightOfPlayers[i] = input.nextInt();
	   }
	
	// create a variable sum to calculate sum of height of all the footballer
	   int sum = 0;
	
    // loop start from 0 and goes to 10
       for(int i=0;i<11;i++)
       {	
	      sum = sum + heightOfPlayers[i];
	   }
	   
	// create a variable mean to store mean height of the footballer
      double mean = sum/11.0;	
	  
	// Displaying the result
      System.out.println("The mean height of the footballer " + mean);	
	}
}