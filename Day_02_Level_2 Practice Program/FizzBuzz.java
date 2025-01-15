// Importing Scanner class to take user input
import java.util.Scanner;

// Creating a class named FizzBuzz to implement the FizzBuzz logic using a for loop
class FizzBuzz
{
    public static void main(String[] args) 
	{
        // Create a Scanner class object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Declare a variable to store the number entered by the user
        int number;

        // Displaying a message to the user
        System.out.print("Enter a number: ");
        number = sc.nextInt();

        // Loop start from numbers 0 and goes to given number
        for(int i = 0 ; i <= number ; i++) 
		{
		    // If it is divisible by 3 then print "Fizz"
		    if (i % 3 == 0) 
			{
                System.out.println("Fizz");
            } 
			// If it is divisible by 5 then print "Buzz"
			else if (i % 5 == 0) 
			{
                System.out.println("Buzz");
            } 
            //if it is divisible by both 3 and 5 then print "FizzBuzz"
            else if (i % 3 == 0 && i % 5 == 0) 
			{
                System.out.println("FizzBuzz");
            } 
			else 
			{
                // If it is not divisible by 3,5 or both, then print the number itself
                System.out.println(i);
            }
        }
    }
}
