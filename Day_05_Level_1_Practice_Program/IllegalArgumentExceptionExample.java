// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class to demonstrate IllegalArgumentException
class IllegalArgumentExceptionExample 
{

    // Method to generate IllegalArgumentException
    public static void generateIllegalArgumentException(String text) 
	{
        int length = text.length();
        System.out.println(text.substring(length, length-2));  // This will throw IllegalArgumentException
    }

    // Main method
    public static void main(String[] args) 
	{

	    // Creating a Scanner class object for input
        Scanner input = new Scanner(System.in);

        // Taking user input for the string and indexes
        System.out.println("Enter the string ");
        String text = input.next();
		
        try {
            // Calling the method to generate the exception
            generateIllegalArgumentException(text);
        } 
		catch (IllegalArgumentException e) 
		{
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }
}
