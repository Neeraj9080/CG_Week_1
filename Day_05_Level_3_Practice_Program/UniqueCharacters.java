// Importing Scanner class for user input
import java.util.Scanner;

// creating a class to find unique characters in a string
class UniqueCharacters
{
    // Method to find the length of a string without using the length() method
    public static int findLength(String text)
    {
        int length = 0;
		 try{
		 
	         while(true)
		     {
			     text.charAt(length);
                 length++;				 
		     }
			}
		 catch(Exception e)
         {
		    return length;
         }		 
    }

    // Method to find unique characters in a string using charAt() method
    public static char[] findUniqueCharacters(String text)
    {
        int length = findLength(text);
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        // Loop to find unique characters
        for (int i = 0; i < length; i++)
        {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            // Check if the character has appeared before
            for (int j = 0; j < i; j++)
            {
                if (uniqueChars[j] == currentChar)
                {
                    isUnique = false;
                    break;
                }
            }

            // If unique, add to the result array
            if (isUnique)
            {
                uniqueChars[uniqueCount++] = currentChar;
            }
        }

        // Create new array to return only the unique characters
        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    // Main method to take input and display unique characters
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Taking user input for the string
        System.out.println("Enter a string");
        String text = input.nextLine();

        // Find unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Display the unique characters
        System.out.println("Unique characters ");
        for (char ch : uniqueChars)
        {
            System.out.print(ch + " ");
        }
    }
}

