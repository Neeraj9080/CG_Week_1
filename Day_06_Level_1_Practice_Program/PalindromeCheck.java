//importing scanner class for user input
import java.util.Scanner;

// Creating a class to check if a string is a palindrome
class PalindromeCheck 
{

    // Main method
    public static void main(String[] args) 
	{
        // Creating a Scanner class object for input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = "";

        // Iterating through the string in reverse order
        for (int i = input.length() - 1; i >= 0; i--) 
		{
            reversed += input.charAt(i);
        }

        // Checking if the string is a palindrome
        if (input.equals(reversed)) 
		{
            System.out.println("The string is a palindrome");
        } 
		else 
		{
            System.out.println("The string is not a palindrome");
        }
    }
}
