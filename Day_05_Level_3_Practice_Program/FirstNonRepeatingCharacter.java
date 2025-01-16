// Importing Scanner class for user input
import java.util.Scanner;

// creating a class FirstNonRepeatingCharacter to find first non-repeating character in a string
class FirstNonRepeatingCharacter
{
    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingCharacter(String text)
    {
        // Array to store the frequency of characters
        int[] frequency = new int[256]; // ASCII characters

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++)
        {
            frequency[text.charAt(i)]++;
        }

        // Find the first character with frequency 1 (non-repeating)
        for (int i = 0; i < text.length(); i++)
        {
            if (frequency[text.charAt(i)] == 1)
            {
                return text.charAt(i);
            }
        }

        // If no non-repeating character is found
        return '\0';
    }

    // Main method to take input and display first non-repeating character
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Taking user input for the string
        System.out.println("Enter a string");
        String text = input.nextLine();

        // Find the first non-repeating character
        char result = findFirstNonRepeatingCharacter(text);

        if (result == '\0')
        {
            System.out.println("No non-repeating character found");
        }
        else
        {
            System.out.println("First non-repeating character is " + result);
        }
    }
}
