//importing scanner class for user input
import java.util.Scanner;

// Creating a class to find the most frequent character in a string
class MostFrequentCharacter 
{

    // Main method
    public static void main(String[] args) 
	{
        // Creating a Scanner class object for input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the string
        System.out.println("Enter a string	");
        String input = scanner.nextLine();

        int[] frequency = new int[256]; // ASCII characters

        // Counting the frequency of each character
        for (int i = 0; i < input.length(); i++) 
		{
            frequency[input.charAt(i)]++;
        }

        int maxFreq = 0;
        char mostFrequentChar = ' ';

        // Finding the character with the highest frequency
        for (int i = 0; i < input.length(); i++) 
		{
            if (frequency[input.charAt(i)] > maxFreq) 
			{
                maxFreq = frequency[input.charAt(i)];
                mostFrequentChar = input.charAt(i);
            }
        }

        // Displaying the most frequent character
        System.out.println("Most Frequent Character " + mostFrequentChar );
    }
}
