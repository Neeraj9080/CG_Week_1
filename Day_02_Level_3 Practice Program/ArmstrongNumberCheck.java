// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class ArmstrongNumberCheck to check if a number is an Armstrong number
class ArmstrongNumberCheck 
{
    public static void main(String[] args) 
	{
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);

        // Displaying a message to the user to enter a number
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        // Initialize sum and store the original number
        double sum = 0;
		int originalNumber = number;

        // Loop to calculate the sum of cubes of each digit
        while (originalNumber != 0) {
            // Get the last digit
            int remainder = originalNumber % 10;

            // Add the cube of the digit to the sum
            sum = sum + Math.pow(remainder, 3);

            // Remove the last digit
            originalNumber /= 10;
        }

        // Check if the original number is equal to the sum
        if (number == sum) 
		{
            System.out.println("GIven Number is an Armstrong number");
        } 
		else 
		{
            System.out.println("Given Number is not an Armstrong number");
        }
    }
}
