// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class to demonstrate NullPointerException
class NullPointerExceptionExample 
{

    // Method to generate NullPointerException
    public static void generateNullPointerException() 
	{
        String text = null;
        System.out.println(text.length());  // This will throw NullPointerException
    }

    // Main method
    public static void main(String[] args) 
	{
        try 
		{
            // Calling the method to generate the exception
            generateNullPointerException();
        } 
		catch (NullPointerException e) 
		{
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
