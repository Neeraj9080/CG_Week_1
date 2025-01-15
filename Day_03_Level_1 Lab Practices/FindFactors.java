// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class to find factors of a number and store them in an array
class FindFactors
{
    public static void main(String[] args)
    {
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.println("Enter a number ");
        int number = input.nextInt();
        
        // Initialize the maxFactor to 10 and create an array to store factors
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        
        // Index variable to store factors in the array
        int index = 0;
        
        // Loop start from 1 to the number to find factors
        for (int i = 1; i <= number; i++) 
		{
            if (number % i == 0) 
			{
                // If i is a factor, store it in the factors array
                if (index == maxFactor) 
				{
                    // If the array is full, double the size of the array
                    maxFactor = maxFactor * 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }
        
        // Display the factors of the number
        System.out.println("Factors of " + number + " ");
        for (int i = 0; i < index; i++) 
		{
            System.out.print(factors[i] + " ");
        }
        System.out.println();
    }
}
