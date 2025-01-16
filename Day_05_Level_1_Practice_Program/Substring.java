// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class to demonstrate substring creation and comparison
class Substring
{

    // Method to create a substring using charAt() method
    public static String createSubstringUsingCharAt(String text, int start, int end) 
	{
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(text.charAt(i));
        }
        return substring.toString();
    }

    // Main method
    public static void main(String[] args) 
	{
        // Creating a Scanner class object for input
        Scanner input = new Scanner(System.in);

        // Taking user input for the string and indexes
        System.out.println("Enter the string ");
        String text = input.next();
        System.out.println("Enter the start index ");
        int start = input.nextInt();
        System.out.println("Enter the end index ");
        int end = input.nextInt();

        // Creating substring using charAt() method
        String substringUsingCharAt = createSubstringUsingCharAt(text, start, end);

        // Creating substring using substring() method
        String substringUsingSubstring = text.substring(start, end);

        // Comparing the two substrings and displaying the result
        if (substringUsingCharAt.equals(substringUsingSubstring)) 
		{
			System.out.println("Substring using charAt() method " + substringUsingCharAt);
			System.out.println("Substring using substring() method " + substringUsingSubstring);
            System.out.println("Both substrings are equal");
        } 
		else 
		{
			System.out.println("Substring using charAt() method " + substringUsingCharAt);
			System.out.println("Substring using substring() method " + substringUsingSubstring);
            System.out.println("Substrings are not equal");
        }
    }
}
