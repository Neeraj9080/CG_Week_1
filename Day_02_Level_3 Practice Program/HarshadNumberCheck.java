// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class HarshadNumberCheck to check if a number is a Harshad number
class HarshadNumberCheck 
{
    public static void main(String[] args) 
	{
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);

        // Displaying a message to the user to enter a number
        System.out.println("Enter a number ");
        int number = input.nextInt();

        // Initialize sum and store the original number
        int sum = 0, originalNumber = number;

        // Loop to calculate the sum of the digits
        while (number != 0) 
		{
            // Add the last digit to the sum
            sum = sum + (number % 10);

            // Remove the last digit
            number /= 10;
        }

        // Check if the original number is Harshad numer or not
        if (originalNumber % sum == 0) 
		{
            System.out.println(originalNumber + " is a Harshad number");
        } 
		else 
		{
            System.out.println(originalNumber + " is not a Harshad number");
        }
    }
}
