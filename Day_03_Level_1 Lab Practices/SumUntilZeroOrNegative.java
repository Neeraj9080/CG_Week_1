
// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class SumUntilZeroOrNegative to calculate sum of number untill zero or negative number encountered
class SumUntilZeroOrNegative
{
  public static void main(String[] args)
  {
    // Create an object of Scanner class to take input from the user
       Scanner input = new Scanner(System.in);
	   
	// Create a variable named arraySize and assign value 5
	   int arraySize = 10;  
	   
    // Declare a array named array to store multiple value entered by user
       double[] array = new double[arraySize];
	   
	//Create a variable sum to store sum of numbers given by user
       double sum = 0.0;

    //create a iterator i and assign a value 0.0;
       int i = 0;
	   
	//  a infinite loop is running  
	    while (true && i<10)
	    {
		   // Prompt to user to enter a number
            System.out.println("Enter a number ");
            array[i] = input.nextDouble();
		
		  // checking user has enter a zero or negative value
	      if(array[i] <= 0 )
		  {
		    break;
		  }
		  else
		  {
		  // calculating some of given number
		  sum = sum + array[i];
		  i++;
		  }
		}
        System.out.println("The total Value is " + sum);		
	}
}	