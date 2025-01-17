//importing scanner class for user input
import java.util.Scanner;

// Creating a class to remove a specific character from a string
class RemoveSpecificCharacter 
{

    // Main method
    public static void main(String[] args) 
	{
        // Creating a Scanner class object for input
        Scanner input = new Scanner(System.in);

        // Taking user input for the string and character to remove
        System.out.println("Enter a string ");
        String text = input.nextLine();

        System.out.println("Enter the character to remove ");
        char removeChar = input.next().charAt(0);
        
        // Removing the specified character from the string
           String result = text.replaceAll(String.valueOf(removeChar), "");

        // Displaying the modified string
        System.out.println("Modified string " + result);
    }
}
