// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class MultiplicationTableCalculation to calculate Multiplication Table of a given number
class MultiplicationTableCalculation
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
	   
    // Declare a array named multiplicationResult to store multiplication table of a number
       int[] multiplicationResult = new int[4];	
	   
    // create a variable counter 
           int counter = 6; 

    // loop start from 1 and goes to 4   
	   for(int i=0;i<4;i++)
	   {
          multiplicationResult[i] = number * counter  ;
		  counter++;
	   }
	   
	// create a variable counter 
           counter = 6;   

	// loop start from 0 and goes to 4   
	   for(int i=0;i<4;i++)
	   {
          System.out.println(number +" * " + counter + " = " + multiplicationResult[i]) ;
		  counter++;
	   }	
	   
	}
}  