// Importing Scanner class for user input
import java.util.Scanner;

// creating a class TrimLeadingAndTrailingSpaces to remove leading and trailing spaces from a string
class TrimLeadingAndTrailingSpaces
{
    // Method to trim leading and trailing spaces using charAt() method
    public static int[] trimSpaces(String text)
    {
        int start = 0;
        int end = text.length() - 1;

        // Finding the start index where space ends
        while (start <= end && text.charAt(start) == ' ')
            start++;

        // Finding the end index where space starts
        while (end >= start && text.charAt(end) == ' ')
            end--;

        return new int[]{start, end};
    }

    // Method to create substring
    public static String createSubstring(String text, int start, int end)
    {
        return text.substring(start, end + 1);
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Taking user input for the string
        System.out.println("Enter a string with spaces ");
        String text = input.nextLine();

        // Trimming spaces using charAt()
        int[] trimmedIndexes = trimSpaces(text);
        String trimmedText = createSubstring(text, trimmedIndexes[0], trimmedIndexes[1]);

        // Using built-in trim() method
        String trimmedTextBuiltIn = text.trim();

        // Displaying the comparison result
        System.out.println("Trimmed text (using charAt) " + trimmedText);
        System.out.println("Trimmed text (using built-in method) " + trimmedTextBuiltIn);
        System.out.println("Are both results same? " + trimmedText.equals(trimmedTextBuiltIn));
    }
}
