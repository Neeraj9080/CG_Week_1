// Importing Scanner class for user input
import java.util.Scanner;

// creating a class ShortestAndLongestWord to find shortest and longest word in a string
class ShortestAndLongestWord
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

    // Method to find shortest and longest string based on length
    public static String[] findShortestAndLongestString(String[] words)
    {
        String shortest = words[0];
        String longest = words[0];

        for (String word : words)
        {
            if (word.length() < shortest.length())
                shortest = word;
				
            if (word.length() > longest.length())
                longest = word;
        }

        return new String[]{shortest, longest};
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Taking user input for the text
        System.out.println("Enter a string");
        String text = input.nextLine();

        // Splitting the text into words
        String[] words = splitTextIntoWords(text);

        // Finding the shortest and longest strings
        String[] shortestAndLongestArray = findShortestAndLongestString(words);

        // Displaying the result
        System.out.println("Shortest String is " + shortestAndLongestArray[0]);
        System.out.println("Longest String is " + shortestAndLongestArray[1]);
    }
}
