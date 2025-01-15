// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class OddEvenNumbers to print odd and even numbers between 1 and the number entered by user
class OddEvenNumbers
{
    public static void main(String args[])
    {
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);

        // Create a variable to store the user input number
        int number;

        // Prompt user to enter a natural number
        System.out.println("Enter a natural number: ");
        number = input.nextInt();

        // Check if the entered number is positive
        if (number > 0)
        {
            // Loop from 1 to the entered number
            for (int i = 1; i <= number; i++)
            {
                // Check if the number is even or odd
                if (i % 2 == 0)
                {
                    System.out.println(i + " is even");
                }
                else
                {
                    System.out.println(i + " is odd");
                }
            }
        }
        else
        {
            System.out.println("Please enter a valid natural number");
        }
    }
}
