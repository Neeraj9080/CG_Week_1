//importing scanner class for user input
import java.util.Scanner;

// Creating a class to replace a word in a sentence
class ReplaceWord 
{

    // Main method
    public static void main(String[] args) 
	{
        // Creating a Scanner class object for input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the sentence, word to replace, and new word
        System.out.println("Enter a sentence ");
        String input = scanner.nextLine();

        System.out.println("Enter the word to replace ");
        String wordToReplace = scanner.nextLine();

        System.out.println("Enter the new word ");
        String newWord = scanner.nextLine();

        // Replacing the word in the sentence
        String result = input.replaceAll(wordToReplace, newWord);

        // Displaying the modified sentence
        System.out.println("Modified sentence " + result);
    }
}
