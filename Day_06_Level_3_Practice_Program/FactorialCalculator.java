// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class FactorialCalculator to calculate factorial using recursion
class FactorialCalculator 
{
    // Method to calculate factorial using recursion
    public static long calculateFactorial(long number)
	{
	
        if (number == 0 || number == 1)
            return 1;
       
        else
            return number * calculateFactorial(number - 1);
	}

    // Method to display the output
    public static void displayOutput(long number, long factorial) 
	{
        // Displaying the factorial of the entered number
        System.out.println("Factorial of " + number + " is " + factorial);
    }

    public static void main(String[] args) 
	{
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Displaying a message to the user to enter a number
        System.out.println("Enter a number to calculate its factorial ");
        long number = input.nextLong();
        
        // Calculate the factorial of the number using recursion
        long factorial = calculateFactorial(number);
        
        // Display the output
        displayOutput(number, factorial);
    }
}
