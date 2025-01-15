//Importing Scanner class to take user input
import java.util.Scanner;

// Creating class named MultiplesBelow100 to find all multiples of a number below 100
class MultiplesBelow100 
{
    public static void main(String[] args) 
	{
        // Create a Scanner class object to take input from the user
        Scanner sc = new Scanner(System.in);

        // create a variable to store the number entered by the user
        int number;

        // Display the message to the user
        System.out.print("Enter a number under 100 ");
        number = sc.nextInt();

        // Display the multiples of the number below 100
        System.out.println("The multiples are ");

        // Loop start from 100 and goes down to 1
        for (int i = 100; i >= 1; i--) 
		{
            // Check if i is a multiple of the given number
            if (i % number == 0) 
			{
                System.out.println(i); // Print the multiple
            }
        }
    }
}
