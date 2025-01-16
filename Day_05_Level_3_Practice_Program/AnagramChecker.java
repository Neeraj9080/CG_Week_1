// Importing Scanner class for user input
import java.util.Scanner;

// creating a class AnagramChecker to check whether a two are anagrams or not
class AnagramChecker
{
    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String text1, String text2)
    {
        // Check if the lengths of the two strings are the same
        if (text1.length() != text2.length())
        {
            return false; // If lengths differ, they can't be anagrams
        }

        // Create frequency arrays to store the count of each character
        int[] frequency1 = new int[256]; // ASCII characters for text1
        int[] frequency2 = new int[256]; // ASCII characters for text2

        // Count the frequency of characters in both texts
        for (int i = 0; i < text1.length(); i++)
        {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        // Compare the frequency arrays for both texts
        for (int i = 0; i < 256; i++)
        {
            if (frequency1[i] != frequency2[i])
            {
                return false; // If frequencies don't match, they aren't anagrams
            }
        }

        // If all checks pass, the texts are anagrams
        return true;
    }

    // Main method to take user inputs and check if the texts are anagrams
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Taking user input for two strings
        System.out.println("Enter the first text");
        String text1 = input.nextLine();
        System.out.println("Enter the second text");
        String text2 = input.nextLine();

        // Check if the two strings are anagrams
        if (areAnagrams(text1, text2))
        {
            System.out.println("The texts are anagrams");
        }
        else
        {
            System.out.println("The texts are not anagrams");
        }
    }
}
