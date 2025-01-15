//import Scanner class for user input
import java.util.Scanner;

//Creating a class Factors to calculate factors of a number and display results
class Factors
{
    // Method to find factors and store them in an array
    public static int[] findFactors(int number)
    {
        // Initializing a temporary array with the maximum possible number of factors
        int count = 0;
        
        // First loop to count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        
        // Initialize an array to store the factors
        int[] factors = new int[count];
        int index = 0;
        
        // Second loop to store factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        
        return factors;
    }

    // Method to find the sum of the factors
    public static int sumOfFactors(int[] factors)
    {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the sum of the squares of the factors
    public static double sumOfSquaresOfFactors(int[] factors)
    {
        double sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }

    // Method to find the product of the factors
    public static int productOfFactors(int[] factors)
    {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static void main(String[] args)
    {
        // Create an object of Scanner class for user input
        Scanner input = new Scanner(System.in);
        
        // Get user input for the number
        System.out.println("Enter a number to find its factors ");
        int number = input.nextInt();
        
        // Find the factors
        int[] factors = findFactors(number);
        
        // Display the factors
        System.out.println("The factors of " + number + " are ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        
        // Find and display the sum, sum of squares, and product of the factors
        System.out.println("Sum of factors " + sumOfFactors(factors));
        System.out.println("Sum of squares of factors " + sumOfSquaresOfFactors(factors));
        System.out.println("Product of factors " + productOfFactors(factors));
    }
}
