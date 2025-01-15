// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class to find the frequency of each digit in a number
class DigitFrequency
{
    public static void main(String[] args)
    {
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Take the number input
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        // Create an array to store the frequency of each digit (0-9)
        int[] frequency = new int[10];

        // Loop to find the frequency of each digit in the number
        while (number > 0) 
        {
            int digit = number % 10; // Get the last digit
            frequency[digit]++; // Increment the frequency of the digit
            number = number / 10; // Remove the last digit
        }

        // Display the frequency of each digit
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) 
        {
            if (frequency[i] > 0) 
            {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }
    }
}
