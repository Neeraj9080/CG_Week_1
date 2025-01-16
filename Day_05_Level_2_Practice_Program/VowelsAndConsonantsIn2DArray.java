// Importing Scanner class for user input
import java.util.Scanner;

// creating a class VowelsAndConsonantsIn2DArray to find vowels and consonants
class VowelsAndConsonantsIn2DArray
{
    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char ch)
    {
        // Convert the character to lowercase if it is uppercase
        ch = Character.toLowerCase(ch);

        // Check if the character is an alphabet letter
        if (ch >= 'a' && ch <= 'z')
        {
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return "Vowel";
				
            else
                return "Consonant"; 
        }
        else
        {
            return "Not a Letter"; 
        }
    }

    // Method to find vowels and consonants in a string
    public static String[][] findVowelsAndConsonants(String text)
    {
        // Create a 2D array to store the characters and their types (Vowel/Consonant/Not a Letter)
        String[][] result = new String[text.length()][2];

        // Loop through each character in the text
        for (int i = 0; i < text.length(); i++)
        {
            char currentChar = text.charAt(i);
            String charType = checkCharacterType(currentChar); // Get the character type

            // Store the character and its type in the result array
            result[i][0] = String.valueOf(currentChar);
            result[i][1] = charType;
        }

        // Return the result array
        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayCharacterTypes(String[][] result)
    {
        // Display the header
        System.out.printf("%-10s %-15s\n", "Character", "Type");
        
        // Loop through the 2D array and display each character and its type
        for (int i = 0; i < result.length; i++)
        {
            System.out.printf("%-10s %-15s\n", result[i][0], result[i][1]);
        }
    }

    // Main method
    public static void main(String[] args)
    {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for the string
        System.out.println("Enter a string ");
        String text = input.nextLine();

        // Find the vowels and consonants and store the result
        String[][] result = findVowelsAndConsonants(text);

        // Display the result in a tabular format
        displayCharacterTypes(result);
    }
}
