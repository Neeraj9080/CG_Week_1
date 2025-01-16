// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class to demonstrate ArrayIndexOutOfBoundsException
class ArrayIndexOutOfBoundsExceptionExample 
{

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException() 
	{
        String[] names = {"neeraj", "abhishek", "rajan"};
        System.out.println(names[5]);  // This will throw ArrayIndexOutOfBoundsException
    }

    // Main method
    public static void main(String[] args) 
	{
        try {
            // Calling the method to generate the exception
            generateArrayIndexOutOfBoundsException();
        } 
		catch (ArrayIndexOutOfBoundsException e) 
		{
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
