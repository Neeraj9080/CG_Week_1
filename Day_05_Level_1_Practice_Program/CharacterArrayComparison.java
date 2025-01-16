// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class to compare charAt() and toCharArray() method
class CharacterArrayComparison 
{

    // Method to return characters using charAt()
    public static char[] getCharactersUsingCharAt(String str1) 
	{
        char[] chars = new char[str1.length()];
        for (int i = 0; i < str1.length(); i++) 
		{
            chars[i] = str1.charAt(i);
        }
        return chars;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) 
	{
        if (arr1.length != arr2.length) 
		return false;
		
        for (int i = 0; i < arr1.length; i++) 
		{
            if (arr1[i] != arr2[i]) 
			return false;
        }
        return true;
    }

    // Main method
    public static void main(String[] args) 
	{
        // Creating a Scanner class object for input
        Scanner input = new Scanner(System.in);

        // Taking user input for the string
        System.out.println("Enter the string ");
        String str1 = input.nextLine();

        // Getting characters using charAt() method
        char[] charArrayFromCharAt = getCharactersUsingCharAt(str1);

        // Getting characters using toCharArray() method
        char[] charArrayFromToCharArray = str1.toCharArray();

        // Comparing the two arrays and displaying the result
        if (compareCharArrays(charArrayFromCharAt, charArrayFromToCharArray)) 
		{
            System.out.println("Both character arrays are equal");
        } 
		else 
		{
            System.out.println("Character arrays are not equal");
        }
    }
}
