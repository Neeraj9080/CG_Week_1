// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class to demonstrate converting text to lowercase
class LowercaseConversion 
{

    // Method to convert string to lowercase using charAt()
    public static String convertToLowerCaseUsingCharAt(String text) 
	{
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) 
		{
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') 
			{
                result.append((char)(ch + 32)); // Convert uppercase to lowercase
            } 
			else 
			{
                result.append(ch);
            }
        }
        return result.toString();
    }

    // Main method
    public static void main(String[] args) 
	{
        // Creating a Scanner class object for input
        Scanner input = new Scanner(System.in);

        // Taking user input for the string
        System.out.println("Enter the string ");
        String text = input.nextLine();

        // Converting text to lowercase using charAt() method
        String lowercaseUsingCharAt = convertToLowerCaseUsingCharAt(text);

        // Converting text to lowercase using built-in toLowerCase() method
        String lowercaseUsingBuiltIn = text.toLowerCase();

        // Comparing the two strings and displaying the result
        if (lowercaseUsingCharAt.equals(lowercaseUsingBuiltIn)) 
		{
			System.out.println("String using charAt() " + lowercaseUsingCharAt);
			System.out.println("String using BuiltIn() " + lowercaseUsingBuiltIn);
            System.out.println("Both lowercase strings are equal");
        } 
		else 
		{
			System.out.println("String using charAt() " + lowercaseUsingCharAt);
			System.out.println("String using BuiltIn() " + lowercaseUsingBuiltIn);
            System.out.println("Lowercase strings are not equal");
        }
    }
}
