// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class to split a string and find their length using built in method and user defined method
class SplitStringAndLength
{
    // Method to find length of string using charAt() method
    public static int getLengthUsingCharAt(String text)
    {
        int count = 0;
        try
        {
            while (true)
            {
                text.charAt(count);
                count++;
            }
        }
        catch (Exception e)
        {
            return count;
        }
    }

    // Method to split text into words using charAt() method
    public static String[] splitTextIntoWords(String text)
    {
        int length = getLengthUsingCharAt(text);
        int spaceCount = 0;

        for (int i = 0; i < length; i++)
        {
            if (text.charAt(i) == ' ')
                spaceCount++;
        }

        String[] words = new String[spaceCount + 1];
        int startIndex = 0;
        int endIndex = 0;
        int wordIndex = 0;

        for (int i = 0; i <= length; i++)
        {
            if (i == length || text.charAt(i) == ' ')
            {
                endIndex = i;
                words[wordIndex] = text.substring(startIndex, endIndex);
                wordIndex++;
                startIndex = i + 1;
            }
        }

        return words;
    }

    // Method to return a 2D array of word and its corresponding length
    public static String[][] getWordsAndLengths(String[] words)
    {
        String[][] wordLengthArray = new String[words.length][2];

        for (int i = 0; i < words.length; i++)
        {
            wordLengthArray[i][0] = words[i];
            wordLengthArray[i][1] = String.valueOf(words[i].length());
        }

        return wordLengthArray;
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Taking user input for the text
        System.out.println("Enter a string ");
        String text = input.nextLine();

        // Splitting the text into words
        String[] words = splitTextIntoWords(text);

        // Getting the words and their lengths
        String[][] wordLengthArray = getWordsAndLengths(words);

        // Displaying the result
        System.out.println("Word and Lengths ");
        for (int i = 0; i < wordLengthArray.length; i++)
        {
            System.out.println(wordLengthArray[i][0] + " -> " + wordLengthArray[i][1]);
        }
    }
}
