// Importing Scanner class for user input
import java.util.Scanner;

// creating a class CharacterFrequencyUsingUniqueCharacter to find frequency of characters in a string
class CharacterFrequencyUsingUniqueCharacter
{
    // Method to find unique characters in a string
    public static char[] uniqueCharacters(String text)
    {
        // Create a temporary string to store unique characters
        String uniqueChars = "";
        
        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++)
        {
            char currentChar = text.charAt(i);
            
            // Check if the character is not already in the uniqueChars string
            if (uniqueChars.indexOf(currentChar) == -1)
            {
                uniqueChars = uniqueChars + currentChar; // Add the character to the unique string
            }
        }

        // Return the unique characters as a character array
        return uniqueChars.toCharArray();
    }

    // Method to find the frequency of characters in a string
    public static String[][] findCharacterFrequency(String text)
    {
        // Create an array to store the frequency of each character
        int[] frequency = new int[256]; // ASCII characters (256 values)
        
        // Loop through the text and count the frequency of each character
        for (int i = 0; i < text.length(); i++)
        {
            frequency[text.charAt(i)]++;
        }

        // Find the unique characters in the text
        char[] uniqueChars = uniqueCharacters(text);
        
        // Create a 2D array to store the unique characters and their frequencies
        String[][] result = new String[uniqueChars.length][2];

        // Loop through the unique characters and store their frequencies in the 2D array
        for (int i = 0; i < uniqueChars.length; i++)
        {
            result[i][0] = String.valueOf(uniqueChars[i]); // Store the character
            result[i][1] = String.valueOf(frequency[uniqueChars[i]]); // Store the frequency
        }

        // Return the result array
        return result;
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Taking user input for the string
        System.out.println("Enter a string ");
        String text = input.nextLine();

        // Find the character frequencies
        String[][] frequencies = findCharacterFrequency(text);

        // Display the result
        System.out.println("Character Frequencies ");
        for (int i = 0; i < frequencies.length; i++)
        {
            System.out.println(frequencies[i][0] + "  " + frequencies[i][1]);
        }
    }
}
