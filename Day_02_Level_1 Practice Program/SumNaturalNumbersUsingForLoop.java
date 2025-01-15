// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class SumNaturalNumbersUsingForLoop to find the sum of n natural numbers using a for loop
class SumNaturalNumbersUsingForLoop
{
    public static void main(String args[])
    {
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);

        // Create a variable n to store the user input
        int n;

        // Displaying a message to the user to enter a natural number
        System.out.println("Enter a natural number: ");
        n = input.nextInt();

        // Check if the entered number is positive
        if (n > 0)
        {
            // Using the formula for sum of natural numbers
            int formulaSum = n * (n + 1) / 2;

            // Using a for loop to calculate the sum
            int loopSum = 0;
            for (int i = 1; i <= n; i++)
            {
                loopSum += i;
            }

            // Comparing both results
            if (formulaSum == loopSum)
            {
                System.out.println("The results are correct and matched");
            }
        }
        else
        {
            System.out.println("Please enter a valid natural number");
        }
    }
}
