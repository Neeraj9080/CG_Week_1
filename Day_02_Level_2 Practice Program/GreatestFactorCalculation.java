// Importing Scanner class to take user input
import java.util.Scanner;

// Creating a class named GreatestFactorCalculation to find the greatest factor of a number besides itself
class GreatestFactorCalculation
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

        // create a variable greatestFactor to store the greatest factor and it is initialize by 1
        int greatestFactor = 1;

        // Loop start from number-1 and goes to 1
        for (int i = number - 1; i >= 1; i--) 
		{
            // Check if i is a factor of the given number or not
            if (number % i == 0) 
			{
                greatestFactor = i;
                break; 
            }
        }

        // Displaying the result
        System.out.println("The greatest factor is "+ greatestFactor);
    }
}
