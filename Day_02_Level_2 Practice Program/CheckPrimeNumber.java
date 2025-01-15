// Importing Scanner class to take user input
import java.util.Scanner;

// Creating class named PrimeNumberCheck to check if the number is prime
class CheckPrimeNumber
{
    public static void main(String[] args) 
	{
        //Create a Scanner class object to take input from the user
        Scanner sc = new Scanner(System.in);

        //Declare a variable to store the number entered by the user
        int number;

        //Displaying a message to the user
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        //create a variable isPrime to check if the number is prime
        boolean isPrime = true;

        //Check if the number is greater than 1 (Prime numbers are greater than 1)
        if (number <= 1) 
		{
            isPrime = false;
        } 
		
		else 
		{
            // Loop start from numbers from 2 and goes to the square root of the givennumber
            for (int i = 2; i <= Math.sqrt(number); i++) 
			{
                //If the given number is divisible by any other number then it is not prime number
                if (number % i == 0) 
				{
                    isPrime = false;
                    break;
                }
            }
        }

        // Displaying whether the given number is prime or not
        if (isPrime) 
		{
            System.out.println("Given number is a Prime Number");
        } 
		
		else 
		{
            System.out.println("Given number is not a Prime Number");
        }
    }
}
