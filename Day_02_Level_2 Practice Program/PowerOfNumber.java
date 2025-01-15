// Importing Scanner class to take user input
import java.util.Scanner;

// Creating a class named PowerOfNumber to find the power of a number
class PowerOfNumber 
{
    public static void main(String[] args) 
	{
        // Create a Scanner class object to take input from the user
        Scanner sc = new Scanner(System.in);

        // create a variables to store the number and the power entered by the user
        int number, power;

        // Displaying the message to the user
        System.out.print("Enter the number: ");
        number = sc.nextInt();
        System.out.print("Enter the power: ");
        power = sc.nextInt();

        // create a variable result to store the result of the power calculation
        int result = 1;

        // Loop start from 1 goes to the power value 
        for (int i = 1; i <= power; i++) 
		{
            result = result * number;
        }

        // Displaying the result
        System.out.println("Power of given number "+ result);
    }
}
