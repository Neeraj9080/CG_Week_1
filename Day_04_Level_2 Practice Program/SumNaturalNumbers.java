//import Scanner class for user input
import java.util.Scanner;

//Creating a class SumNaturalNumbers to calculate the sum using recursive and formula method
class SumNaturalNumbers
{
    // Recursive method to find the sum of first n natural numbers
    public static int sumRecursive(int n)
    {
        // Base condition
        if (n == 0) {
            return 0;
        } else {
            return n + sumRecursive(n - 1);
        }
    }

    // Method to find the sum of first n natural numbers using the formula
    public static int sumFormula(int n)
    {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args)
    {
        // Create an object of Scanner class for user input
        Scanner input = new Scanner(System.in);
        
        // Get user input for the number
        System.out.println("Enter a number to find the sum of first n natural numbers: ");
        int n = input.nextInt();
        
        // Check if n is a natural number or not
        if (n < 0) 
		{
            System.out.println("Please enter a valid natural number.");
            return;
        }
        
        // Calculate sum using both methods
        int sumRecursion = sumRecursive(n);
        int sumFormula = sumFormula(n);
        
        // Display the results
        System.out.println("Sum using recursion: " + sumRecursion);
        System.out.println("Sum using formula: " + sumFormula);
        
        // Compare both results
        if (sumRecursion == sumFormula) 
		{
            System.out.println("Both methods give the correct result");
        } 
		else 
		{
            System.out.println("There is an error in the calculations");
        }
    }
}
