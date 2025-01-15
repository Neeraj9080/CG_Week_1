// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class to find the multiplication table of a number from 6 to 9
class MultiplicationTable
{
    public static void main(String args[])
    {
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);

        // Create a variable to store the user input number
        int number;

        // Displaying a message to the user to enter a number
        System.out.println("Enter a number to find its multiplication table: ");
        number = input.nextInt();

        // For Loop to print the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++)
        {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
