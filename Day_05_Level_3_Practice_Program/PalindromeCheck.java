// Importing Scanner class for user input
import java.util.Scanner;

// creating a class PalindromeCheck to check whether a string is palindrome
class PalindromeCheck
{
    // Method to check if a string is palindrome using recursion
    public static boolean isPalindromeRecursive(String text, int start, int end)
    {
        if (start >= end)
            return true;
			
        if (text.charAt(start) != text.charAt(end))
            return false;
			
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Method to check if a string is palindrome iteratively
    public static boolean isPalindromeIterative(String text)
    {
        int start = 0;
        int end = text.length() - 1;

        // Compare characters from both ends
        while (start < end)
        {
            if (text.charAt(start) != text.charAt(end))
                return false;
				
            start++;
            end--;
        }
        return true;
    }

    // Main method to take input and display palindrome check result
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Taking user input for the string
        System.out.println("Enter a string");
        String text = input.nextLine();

        // Checking if the string is a palindrome
        if (isPalindromeIterative(text))
            System.out.println("The string is a palindrome");
			
        else
            System.out.println("The string is not a palindrome");

        // Checking using recursive method
        if (isPalindromeRecursive(text, 0, text.length() - 1))
            System.out.println("The string is a palindrome using recursion");
			
        else
            System.out.println("The string is not a palindrome using recursion");
    }
}
