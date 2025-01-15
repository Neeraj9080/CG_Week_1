// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class for FizzBuzz problem
class FizzBuzz
{
    public static void main(String[] args)
    {
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number ");
        int number = input.nextInt();
        
        // Create a String array to store the FizzBuzz results
        String[] result = new String[number];
        
        // Loop from 0 to the entered number
        for (int i = 0; i < number; i++) 
		{
            // Check if the number is divisible by 3 and 5
            if (i % 3 == 0 && i % 5 == 0) 
			{
                result[i] = "FizzBuzz";
            }
            // Check if the number is divisible by 3
            else if (i % 3 == 0) 
			{
                result[i] = "Fizz";
            }
            // Check if the number is divisible by 5
            else if (i % 5 == 0) 
			{
                result[i] = "Buzz";
            }
            // If none of the conditions are true, save the number itself
            else 
			{
                result[i] = Integer.toString(i);
            }
        }
        
        // Display the results of FizzBuzz
        for (int i = 0; i < result.length; i++) 
		{
            System.out.println("Position " + (i) + " = " + result[i]);
        }
    }
}
