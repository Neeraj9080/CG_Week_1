// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class FactorialUsingForLoop to calculate factorial using a for loop
class FactorialUsingForLoop
{
    public static void main(String args[])
    {
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);

        // Create a variable to store the user input number
        int number;

        // Displaying a message to the user to enter a positive integer
        System.out.println("Enter a positive integer to find its factorial: ");
        number = input.nextInt();

        // Check if the entered number is positive number
        if (number >= 0)
        {
            // Calculate factorial using a for loop
            int factorial = 1;
            for (int i = 1; i <= number; i++)
            {
                factorial = factorial * i;
            }

            // Display the factorial
            System.out.println("The factorial of " + number + " is " + factorial);
        }
        else
        {
            System.out.println("Please enter a positive integer");
        }
    }
}
