//importing scanner class for user input
import java.util.Scanner;

// Creating a class to remove duplicate characters from a string
class RemoveDuplicates 
{

    // Main method
    public static void main(String[] args) 
	{
        // Creating a Scanner class object for input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.println("Enter a string ");
        String input = scanner.nextLine();

        StringBuffer result = new StringBuffer();

        // Iterating through each character in the string
        for (int i = 0; i < input.length(); i++) 
		{
            // Checking if the character is already in the result string
            if (result.indexOf(String.valueOf(input.charAt(i))) == -1) 
			{
                result.append(input.charAt(i));
            }
        }

        // Displaying the modified string without duplicates
        System.out.println("String after removing duplicates " + result.toString());
    }
}
