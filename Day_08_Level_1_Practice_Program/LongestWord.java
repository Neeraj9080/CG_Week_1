//importing scanner class for user input
import java.util.Scanner;

// Creating a class to find the longest word in a sentence
class LongestWord 
{

    // Main method
    public static void main(String[] args) {
        // Creating a Scanner class object for input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the sentence
        System.out.println("Enter a sentence ");
        String input = scanner.nextLine();

        String[] words = input.split(" ");
        String longestWord = words[0];

        // Iterating through each word to find the longest one
        for (String word : words) 
		{
            if (word.length() > longestWord.length()) 
			{
                longestWord = word;
            }
        }

        // Displaying the longest word
        System.out.println("Longest word " + longestWord);
    }
}
