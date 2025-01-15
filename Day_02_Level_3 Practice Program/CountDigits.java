// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class CountDigits to count the number of digits in an integer
class CountDigits 
{
    public static void main(String[] args) 
	{
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);

        // Displaying a message to the user to enter a number
        System.out.println("Enter a number ");
        int number = input.nextInt();

        // Initialize a variable to count digits
        int count = 0;

        // Loop to count digits in the number
        while (number != 0) 
		{
            // Remove the last digit
            number /= 10;

            // Increment the count
            count++;
        }

        // Print the total number of digits
        System.out.println("Number of digits " + count);

    }
}
