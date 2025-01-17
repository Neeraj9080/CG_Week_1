//importing scanner class for user input
import java.util.Scanner;

// Creating a class to check if a string is a palindrome or not
class PalindromeCheck 
{
     // Method to check string is palindrome or not
     public static boolean isPalindrome(String text)
	 {
	     String reversed = "";

        // Iterating through the string in reverse order
        for (int i = text.length() - 1; i >= 0; i--) 
		{
            reversed = reversed + text.charAt(i);
        }

        // Checking if the string is a palindrome
        if (text.equals(reversed))
		return true;
		
		else
		return false;
	 }

    // Main method
    public static void main(String[] args) 
	{
        // Creating a Scanner class object for input
        Scanner input = new Scanner(System.in);

        // Taking user input for the string
        System.out.println("Enter a string: ");
        String text = input.nextLine();
         
		// checking string is palindrome or not 
        if(isPalindrome(text))
		{
            System.out.println("The string is a palindrome");
        } 
		else 
		{
            System.out.println("The string is not a palindrome");
        }
    }
}
