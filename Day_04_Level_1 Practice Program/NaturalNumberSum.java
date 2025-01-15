// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class NaturalNumberSum calculate the sum of n natural numbers
class NaturalNumberSum
{
   
   // create a method  sum to calculate sum of natural number
   int sum(int number)
   {
	   int sum = 0;
       for(int i=0;i<=number;i++)
	   {
	       sum = sum + i;
	   }
	   return sum;
   }
   
   public static void main(String args[])
   {
     // Create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	 // Create a variable to store the input number
	 int number;
	 
	 // Displaying a message to take input for the number
	 System.out.println("Enter a number: ");
	 number = input.nextInt();
	 
     // Creating an object of NaturalNumberSum class
	 NaturalNumberSum obj = new NaturalNumberSum();
		 
	// Displaying the sum result
	System.out.println("The sum of " + number + " natural numbers is " + (obj.sum(number)));
	 
   }
}
