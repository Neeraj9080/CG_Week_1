// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class MultiplicationTable to store the results of multiplication from 1 to 10
class MultiplicationTable
{
  public static void main(String[] args)
  {
    // Create an object of Scanner class to take input from the user
       Scanner input = new Scanner(System.in);
	   
	// Create a variable named number of int type
	   int number;  
	   
	// Prompt to user to enter a number
       System.out.println("Enter the number ");
       number = input.nextInt();
	   
    // Declare a array named table to store multiplication table of a number
       int[] table = new int[10];
	   
	// loop start from 0 and goes to 9   
	   for(int i=0;i<10;i++)
	   {
          table[i] = number * (i+1) ;
	   }
    
    // loop start from 0 and goes to 9   
	   for(int i=0;i<10;i++)
	   {
          System.out.println(number +" * " + (i+1) + " = " + table[i]) ;
	   }	
	   
	}
}	