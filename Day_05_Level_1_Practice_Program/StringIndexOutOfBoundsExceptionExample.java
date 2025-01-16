// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class to demonstrate StringIndexOutOfBoundsException
class StringIndexOutOfBoundsExceptionExample 
{

    // Method to generate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String text) 
	{
        int length = text.length();
        System.out.println(text.charAt(length+1));  // This will throw StringIndexOutOfBoundsException
    }

    // Main method
    public static void main(String[] args) 
	{
	
	    // Creating a Scanner class object for input
        Scanner input = new Scanner(System.in);

        // Taking user input for the string and indexes
        System.out.println("Enter the string ");
        String text = input.next();
		
        try 
		{
            // Calling the method to generate the exception
            generateStringIndexOutOfBoundsException(text);
        } 
		catch (StringIndexOutOfBoundsException e) 
		{
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}