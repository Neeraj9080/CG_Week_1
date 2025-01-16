// Importing Scanner class for user input
import java.util.Scanner;

// creating a class CharacterFrequencyUsingNestedLoops to find frequency of characters using nested loops in a string
class CharacterFrequencyUsingNestedLoops
{
    // Method to find the frequency of characters in a string using nested loops
    public static String[] findCharacterFrequency(String text)
    {
        // Convert the string to a character array
        char[] textArray = text.toCharArray();
        int[] frequency = new int[text.length()]; // Array to store frequency of characters
        char[] characters = new char[text.length()]; // Array to store characters
        int uniqueCharCount = 0;

        // Loop through each character in the text
        for (int i = 0; i < text.length(); i++)
        {
            char currentChar = textArray[i];
            
            // If the character has not been encountered before
            if (currentChar != '0')
            {
                characters[uniqueCharCount] = currentChar; // Store the character
                frequency[uniqueCharCount] = 1; // Initialize its frequency to 1

                // Loop to find if this character occurs again in the remaining part of the string
                for (int j = i + 1; j < text.length(); j++)
                {
                    if (currentChar == textArray[j])
                    {
                        frequency[uniqueCharCount]++; // Increment frequency
                        textArray[j] = '0'; // Mark this character as counted
                    }
                }
                uniqueCharCount++; // Increase unique character count
            }
        }

        // Create a result array to store characters and their frequencies
        String[] result = new String[uniqueCharCount];
        for (int i = 0; i < uniqueCharCount; i++)
        {
            result[i] = characters[i] + "  " + frequency[i]; // Combine character and frequency
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
        String[] frequencies = findCharacterFrequency(text);

        // Display the result
        System.out.println("Character Frequencies");
        for (String freq : frequencies)
        {
            System.out.println(freq);
        }
    }
}
