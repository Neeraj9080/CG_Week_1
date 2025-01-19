//importing scanner class for user input
import java.util.Scanner;
//importing Arrays class
import java.util.Arrays;

// Creating a class to check if two strings are anagrams
class AnagramCheck 
{

    // Main method
    public static void main(String[] args) 
	{
        // Creating a Scanner class object for input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for two strings
        System.out.println("Enter first string ");
        String str1 = scanner.nextLine();

        System.out.println("Enter second string ");
        String str2 = scanner.nextLine();

        // sorting the characters of both strings
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Checking if both strings are anagrams
        if (Arrays.equals(arr1, arr2)) 
		{
            System.out.println("The strings are anagrams");
        } 
		else 
		{
            System.out.println("The strings are not anagrams");
        }
    }
}
