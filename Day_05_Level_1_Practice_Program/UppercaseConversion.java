// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class to demonstrate converting text to uppercase
class UppercaseConversion 
{

    // Method to convert string to uppercase using charAt()
    public static String convertToUpperCaseUsingCharAt(String text) 
	{
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) 
		{
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') 
			{
                result.append((char)(ch - 32)); // Convert lowercase to uppercase
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

        // Converting text to uppercase using charAt() method
        String uppercaseUsingCharAt = convertToUpperCaseUsingCharAt(text);

        // Converting text to uppercase using built-in toUpperCase() method
        String uppercaseUsingBuiltIn = text.toUpperCase();

        // Comparing the two strings and displaying the result
        if (uppercaseUsingCharAt.equals(uppercaseUsingBuiltIn)) 
		{
			System.out.println("String using charAt() " + uppercaseUsingCharAt);
			System.out.println("String using BuiltIn() " + uppercaseUsingBuiltIn);
            System.out.println("Both uppercase strings are equal");
        } 
		else 
		{
			System.out.println("String using charAt() " + uppercaseUsingCharAt);
			System.out.println("String using BuiltIn() " + uppercaseUsingBuiltIn);
            System.out.println("Uppercase strings are not equal");
        }
    }
}
