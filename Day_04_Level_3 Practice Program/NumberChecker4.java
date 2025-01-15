import java.util.Scanner;

//creating a class NumberChecker4 to perform some operation on numbers
public class NumberChecker4 
{

    // Method to find the factors of a number and return them as an array
    // The factors are all numbers that divide the given number evenly (including 1 and the number itself)
    public static int[] findFactors(int number) 
	{
        int count = 0;
        
        // Count the number of factors
        for (int i = 1; i <= number; i++) 
		{
            if (number % i == 0) 
			{
                count++; // Increment count for each factor
            }
        }
        
        // Create an array to store the factors
        int[] factors = new int[count];
        int index = 0;
        
        // Store the factors in the array
        for (int i = 1; i <= number; i++) 
		{
            if (number % i == 0) 
			{
                factors[index] = i;
                index++;
            }
        }
        
        return factors; // Return the array of factors
    }

    // Method to find the greatest factor of a number using the factors array
    // The greatest factor is the largest number in the factors array (excluding the number itself)
    public static int greatestFactor(int number) 
	{
        int[] factors = findFactors(number);
        int maxFactor = factors[0];
        
        // Find the maximum factor (ignoring the number itself)
        for (int i = 1; i < factors.length - 1; i++) 
		{
            if (factors[i] > maxFactor) 
			{
                maxFactor = factors[i];
            }
        }
        
        return maxFactor; // Return the greatest factor
    }

    // Method to find the sum of the factors using the factors array
    // This method returns the sum of all the factors (including 1 and the number itself)
    public static int sumOfFactors(int number) 
	{
        int[] factors = findFactors(number);
        int sum = 0;
        
        // Sum all the factors
        for (int factor : factors) 
		{
            sum += factor;
        }
        
        return sum; // Return the sum of the factors
    }

    // Method to find the product of the factors using the factors array
    // This method returns the product of all the factors (including 1 and the number itself)
    public static int productOfFactors(int number) 
	{
        int[] factors = findFactors(number);
        int product = 1;
        
        // Multiply all the factors
        for (int factor : factors) 
		{
            product *= factor;
        }
        
        return product; // Return the product of the factors
    }

    // Method to find the product of the cubes of the factors using the factors array
    // This method returns the product of each factor raised to the power of 3
    public static double productOfCubeOfFactors(int number) 
	{
        int[] factors = findFactors(number);
        double product = 1;
        
        // Multiply the cube of each factor
        for (int factor : factors) 
		{
            product *= Math.pow(factor, 3);
        }
        
        return product; // Return the product of the cubes of the factors
    }

    // Method to check if a number is a perfect number
    // A perfect number is equal to the sum of its proper divisors (excluding the number itself)
    public static boolean isPerfectNumber(int number) 
	{
        int[] factors = findFactors(number);
        int sum = 0;
        
        // Sum all the factors except the number itself
        for (int i = 0; i < factors.length - 1; i++) 
		{
            sum += factors[i];
        }
        
        return sum == number; // If the sum is equal to the number, it's perfect
    }

    // Method to check if a number is an abundant number
    // An abundant number is a number whose proper divisors sum to a value greater than the number itself
    public static boolean isAbundantNumber(int number) 
	{
        int[] factors = findFactors(number);
        int sum = 0;
        
        // Sum all the factors except the number itself
        for (int i = 0; i < factors.length - 1; i++) 
		{
            sum += factors[i];
        }
        
        return sum > number; // If the sum is greater than the number, it's abundant
    }

    // Method to check if a number is a deficient number
    // A deficient number is a number whose proper divisors sum to a value less than the number itself
    public static boolean isDeficientNumber(int number) 
	{
        int[] factors = findFactors(number);
        int sum = 0;
        
        // Sum all the factors except the number itself
        for (int i = 0; i < factors.length - 1; i++) 
		{
            sum += factors[i];
        }
        
        return sum < number; // If the sum is less than the number, it's deficient
    }

    // Method to check if a number is a strong number
    // A strong number is a number where the sum of the factorial of its digits equals the number itself
    public static boolean isStrongNumber(int number) 
	{
        int temp = number;
        int sumOfFactorials = 0;
        
        // Calculate the sum of the factorial of the digits
        while (temp > 0) 
		{
            int digit = temp % 10;
            sumOfFactorials += factorial(digit);
            temp /= 10;
        }
        
        return sumOfFactorials == number; // If the sum of factorials equals the number, it's strong
    }

    // Method to calculate the factorial of a number
    public static int factorial(int num) 
	{
        int result = 1;
        for (int i = 1; i <= num; i++) 
		{
            result *= i;
        }
        return result;
    }

    // Main method to test the NumberChecker class methods
    public static void main(String[] args) 
	{
        // creating object of scanner class
	    Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number ");
        int number = input.nextInt();

        // Display factors of the number
        int[] factors = findFactors(number);
        System.out.print("Factors of " + number + " ");
        for (int factor : factors) 
		{
            System.out.print(factor + " ");
        }
        System.out.println();

        // Display greatest factor
        System.out.println("Greatest factor of " + number + " " + greatestFactor(number));

        // Display sum of factors
        System.out.println("Sum of factors of " + number + " " + sumOfFactors(number));

        // Display product of factors
        System.out.println("Product of factors of " + number + " " + productOfFactors(number));

        // Display product of cubes of factors
        System.out.println("Product of cubes of factors of " + number + " " + productOfCubeOfFactors(number));

        // Check if the number is perfect
        System.out.println("Is " + number + " a perfect number? " + isPerfectNumber(number));

        // Check if the number is abundant
        System.out.println("Is " + number + " an abundant number? " + isAbundantNumber(number));

        // Check if the number is deficient
        System.out.println("Is " + number + " a deficient number? " + isDeficientNumber(number));

        // Check if the number is strong
        System.out.println("Is " + number + " a strong number? " + isStrongNumber(number));
    }
}
