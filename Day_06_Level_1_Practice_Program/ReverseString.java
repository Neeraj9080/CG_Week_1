//importing scanner class for user input
import java.util.Scanner;

// Creating a class to reverse a string without built-in reverse methods
class ReverseString 
{

    // Main method
    public static void main(String[] args) 
	{
        // Creating a Scanner class object for input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.println("Enter a string ");
        String input = scanner.nextLine();

        String reversed = "";

        // Iterating through the string in reverse order
        for (int i = input.length() - 1; i >= 0; i--) 
		{
            reversed = reversed + input.charAt(i);
        }

        // Displaying the reversed string
        System.out.println("Reversed string " + reversed);
    }
}
