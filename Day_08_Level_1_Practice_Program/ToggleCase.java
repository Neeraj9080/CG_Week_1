//importing scanner class for user input
import java.util.Scanner;

// Creating a class to toggle the case of each character
class ToggleCase 
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

        // Iterating through each character and toggling the case
        for (int i = 0; i < input.length(); i++) 
		{
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) 
			{
                result.append(Character.toLowerCase(ch));
            } 
			else if (Character.isLowerCase(ch)) 
			{
                result.append(Character.toUpperCase(ch));
            } 
			else 
			{
                result.append(ch);
            }
        }

        // Displaying the string after toggling case
        System.out.println("Toggled case string " + result.toString());
    }
}
