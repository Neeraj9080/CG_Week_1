// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class SplitStringWordAndCompare to split string using built in method and user defined method
class SplitStringWordAndCompare
{
    // Method to find length of string using charAt() method
    public static int getLengthUsingCharAt(String text)
    {
        int count = 0;
        try
        {
            // Looping through the string until the end is reached
            while (true)
            {
                text.charAt(count);
                count++;
            }
        }
        catch (Exception e)
        {
            // Return the count when exception occurs (end of string)
            return count;
        }
    }

    // Method to split string into words using charAt() method
    public static String[] splitTextIntoWords(String text)
    {
        int length = getLengthUsingCharAt(text);
        int spaceCount = 0;
        
        // Counting number of spaces in the text
        for (int i = 0; i < length; i++)
        {
            if (text.charAt(i) == ' ')
                spaceCount++;
        }
        
        // Array to store the words
        String[] words = new String[spaceCount + 1];
        int startIndex = 0;
        int endIndex = 0;
        int wordIndex = 0;
        
        // Looping through the string to extract words
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

    // Method to compare two string arrays
    public static boolean compareArrays(String[] array1, String[] array2)
    {
        if (array1.length != array2.length)
            return false;
        
        for (int i = 0; i < array1.length; i++)
        {
            if (!array1[i].equals(array2[i]))
                return false;
        }
        return true;
    }

    // Main method
    public static void main(String[] args)
    {
        // Creating a Scanner class object for input
        Scanner input = new Scanner(System.in);

        // Taking user input for the text
        System.out.println("Enter a string");
        String text = input.nextLine();

        // Splitting the text using the user-defined method
        String[] wordsUsingUserMethod = splitTextIntoWords(text);

        // Splitting the text using the built-in split() method
        String[] wordsUsingBuiltInMethod = text.split(" ");

        // Displaying the comparison result
        if(compareArrays(wordsUsingUserMethod, wordsUsingBuiltInMethod))
        System.out.println("Both string arrays are equals ");
		
		else
		System.out.println("Both string arrays are not equals ");
    }
}
