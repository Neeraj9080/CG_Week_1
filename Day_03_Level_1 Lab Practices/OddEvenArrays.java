// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class to save odd and even numbers into separate arrays
class OddEvenArrays
{
    public static void main(String[] args)
    {
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter a number ");
        int number = input.nextInt();
        
        // Check if the entered number is a natural number
        if (number <= 0) 
		{
            System.out.println("Error: Please enter a natural number");
            return; // Exit the program if the input is not a natural number
        }
        
        // Create arrays to store odd and even numbers with a maximum size
        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];
        
        // Initialize index variables for odd and even arrays
        int oddIndex = 0;
        int evenIndex = 0;
        
        // Loop start from 1 and goes to the entered number
        for (int i = 1; i <= number; i++) 
		{
            if (i % 2 == 0) 
			{
                evenNumbers[evenIndex++] = i; // Store even numbers
            } 
			else 
			{
                oddNumbers[oddIndex++] = i; // Store odd numbers
            }
        }
        
        // Display the odd numbers array
        System.out.println("Odd numbers ");
        for (int i = 0; i < oddIndex; i++) 
		{
            System.out.println(oddNumbers[i] + " ");
        }
        System.out.println();
        
        // Display the even numbers array
        System.out.println("Even numbers ");
        for (int i = 0; i < evenIndex; i++) 
		{
            System.out.println(evenNumbers[i] + " ");
        }
        System.out.println();
    }
}
