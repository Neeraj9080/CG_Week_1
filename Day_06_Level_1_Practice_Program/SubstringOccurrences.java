//importing scanner class for user input
import java.util.Scanner;

// Creating a class to count occurrences of a substring in a string
class SubstringOccurrences 
{

    // Main method
    public static void main(String[] args) 
	{
        // Creating a Scanner class object for input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string and substring
        System.out.println("Enter a string ");
        String input = scanner.nextLine();

        System.out.println("Enter the substring ");
        String substring = scanner.nextLine();

        int count = 0;
        int index = 0;

        // Counting the number of times the substring appears
        while ((index = input.indexOf(substring, index)) != -1) 
		{
            count++;
            index = index + substring.length();
        }

        // Displaying the count of occurrences
        System.out.println("Substring occurs " + count + " times");
    }
}
