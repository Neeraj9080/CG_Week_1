// Importing Scanner class for user input
import java.util.Scanner;

// creating a class VowelsAndConsonants to find vowels and consonants
class VowelsAndConsonants
{
    // Method to check if a character is vowel or consonant
    public static String checkCharacterType(char c)
    {
        c = Character.toLowerCase(c);

        if (c >= 'a' && c <= 'z')
        {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
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
    public static int[] findVowelsAndConsonants(String text)
    {
        int vowelsCount = 0;
        int consonantsCount = 0;

        for (int i = 0; i < text.length(); i++)
        {
            char currentChar = text.charAt(i);
            String charType = checkCharacterType(currentChar);
			
            if (charType.equals("Vowel"))
                vowelsCount++;
				
            else if (charType.equals("Consonant"))
                consonantsCount++;
        }

        return new int[]{vowelsCount, consonantsCount};
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Taking user input for the string
        System.out.println("Enter a string ");
        String text = input.nextLine();

        // Finding vowels and consonants
        int[] result = findVowelsAndConsonants(text);

        // Displaying the result
        System.out.println("Vowels is " + result[0]);
        System.out.println("Consonants is " + result[1]);
    }
}
