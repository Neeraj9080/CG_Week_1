// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class to find the sum until the user enters 0 or a negative number
class SumUntilNegativeUsingWhileLoop
{
    public static void main(String args[])
    {
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);

        // Create a variable total_sum to store the sum
        int total_sum = 0;

        // Infinite loop to keep taking input until a 0 or negative number is entered
        while (true)
        {
            // Displaying a message to the user to enter a number
            System.out.println("Enter a number (0 or negative to stop) ");
            int number = input.nextInt();

            // If the entered number is 0 or negative, break the loop
            if (number <= 0)
            {
                break;
            }

            // Add the number to the total sum
            total_sum = total_sum + number;
        }

        // Display the total sum
        System.out.println("The total sum is " + total_sum);
    }
}
