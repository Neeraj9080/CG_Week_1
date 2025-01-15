// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class AbundantNumberCheck to check if a number is an Abundant number
class AbundantNumberCheck 
{
    public static void main(String[] args) 
	{
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);

        // Displaying a message to the user to enter a number
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        // Initialize sum to store the sum of divisors
        int sum = 0;

        // Loop to find all divisors of the number
        for (int i = 1; i < number; i++) 
		{
            // Check if i is a divisor of the number
            if (number % i == 0) 
			{
                sum = sum + i;
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sum > number) 
		{
            System.out.println("It is an Abundant number");
        } 
		else 
		{
            System.out.println("It is not an Abundant number");
        }
    }
}
