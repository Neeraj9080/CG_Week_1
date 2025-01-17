//importing scanner class for user input
import java.util.Scanner;

// Creating a class to count vowels and consonants
class CountVowelsAndConsonants 
{

    // Main method
    public static void main(String[] args) 
	{
        // Creating a Scanner class object for input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.println("Enter a string ");
        String input = scanner.nextLine();

        int vowels = 0, consonants = 0;

        // Iterating through each character in the string
        for (int i = 0; i < input.length(); i++) 
		{
            char ch = Character.toLowerCase(input.charAt(i));

            // Checking if the character is a vowel or consonant
            if (ch >= 'a' && ch <= 'z') 
			{
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
				{
                    vowels++;
                } 
				
				else 
				{
                    consonants++;
                }
            }
        }

        // Displaying the count of vowels and consonants
        System.out.println("Vowels " + vowels);
        System.out.println("Consonants " + consonants);
    }
}
