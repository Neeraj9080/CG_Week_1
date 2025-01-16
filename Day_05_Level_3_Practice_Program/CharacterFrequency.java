// Importing Scanner class for user input
import java.util.Scanner;

// creating a class CharacterFrequency to find frequency of each character in a string
class CharacterFrequency
{
    // Method to find the frequency of characters in a string
    public static void findCharacterFrequency(String text)
    {
        // Array to store frequency of characters
        int[] frequency = new int[256]; // ASCII characters

        // Loop through the string and count frequency
        for (int i = 0; i < text.length(); i++)
        {
            frequency[text.charAt(i)]++;
        }

        // Display the frequency of each character
        System.out.println("Character frequencies:");
        for (int i = 0; i < 256; i++)
        {
            if (frequency[i] > 0)
            {
                System.out.println((char)i + " " + frequency[i]);
            }
        }
    }

    // Main method to take input and display character frequencies
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Taking user input for the string
        System.out.println("Enter a string");
        String text = input.nextLine();

        // Find and display the character frequencies
        findCharacterFrequency(text);
    }
}
