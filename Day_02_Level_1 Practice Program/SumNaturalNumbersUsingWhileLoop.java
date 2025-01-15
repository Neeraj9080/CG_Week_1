// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class SumNaturalNumbersUsingWhileLoop to find the sum of n natural numbers using while loop
class SumNaturalNumbersUsingWhileLoop
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
            int formula_sum = n * (n + 1) / 2;

            // Using a while loop to calculate the sum
            int loop_sum = 0;
            int i = 1;
            while (i <= n)
            {
                loop_sum += i;
                i++;
            }

            // Comparing both results
            if (formula_sum == loop_sum)
            {
                System.out.println("The results are matched");
            }
        }
        else
        {
            System.out.println("Please enter a valid natural number");
        }
    }
}
