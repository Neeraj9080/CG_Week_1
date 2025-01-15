// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class to reverse a number
class ReverseNumber
{
    public static void main(String[] args)
    {
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Take the number input
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        // Create an array to store the digits of the number
        int[] digits = new int[10];
        int index = 0;

        // Loop to extract digits and store them in the array
        while (number > 0) 
        {
            digits[index++] = number % 10;
            number /= 10;
        }

        // Display the digits in reverse order
        System.out.print("Reversed number ");
        for (int i = 0; i < index; i++) 
        {
            System.out.print(digits[i]);
        }
    }
}
