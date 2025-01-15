//Importing Scanner class to take user input
import java.util.Scanner;

// Creating class named FactorsOfNumber to find the factors of a number
class FactorsOfNumber 
{
    public static void main(String[] args) 
	{
        // Create a Scanner class object to take input from the user
        Scanner sc = new Scanner(System.in);

        // create a variable to store the number entered by the user
        int number;

        // Displaying a message to the user
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        // Display the factors of the given number
        System.out.println("The factors of are: ");

        // Loop start from 1 goes to the number - 1
        for (int i = 1; i < number; i++) 
		{
            // Check if i is a factor of the given number
            if (number % i == 0) 
			{
			    // Print the factor
                System.out.println(i); 
            }
        }
    }
}
