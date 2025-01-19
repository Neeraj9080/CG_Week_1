//importing scanner class for user input
import java.util.Scanner;

// Creating a class to compare two strings lexicographically
class CompareStrings 
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

        int comparison = str1.compareTo(str2);

        // Comparing the two strings lexicographically
        if (comparison < 0) 
		{
            System.out.println( str1 + " comes before " + str2 + " in lexicographical order");
        } 
		else if (comparison > 0) 
		{
            System.out.println( str1 + " comes after " + str2 + " in lexicographical order");
        } 
		else 
		{
            System.out.println("Both strings are equal");
        }
    }
}
