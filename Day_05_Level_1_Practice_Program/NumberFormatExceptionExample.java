// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class to demonstrate NumberFormatException
class NumberFormatExceptionExample
{
    // Method to generate NumberFormatException
	public static void generateNumberFormatException(String text)
	{
	    int num = Integer.parseInt(text);  
	}
	
	// Main method
    public static void main(String[] args) 
	{

	    // Creating a Scanner class object for input
        Scanner input = new Scanner(System.in);

        // Taking user input for the string and indexes
        System.out.println("Enter the string ");
        String text = input.next();
		
		try{
		    // Calling the method to generate the exception
		    generateNumberFormatException(text);
		}
		catch (NumberFormatException e)
		{
		    System.out.println("Caught NumberFormatException: " + e.getMessage());
		}
	}	
}