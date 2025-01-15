import java.util.Arrays;
import java.util.Scanner;

//creating a class NumberChecker1 to perform some operation on numbers
class NumberChecker1 
{

    // Method to find the count of digits in a number
    public static int countDigits(int number) 
	{
        // Convert the number to a string and return the length as digit count
        return String.valueOf(number).length();
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) 
	{
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        // Extract digits from the number and store them in the array
        for (int i = digitCount - 1; i >= 0; i--) 
		{
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits of a number using the digits array
    public static int sumOfDigits(int number) 
	{
        int[] digits = storeDigits(number);
        int sum = 0;
        // Loop through the digits array and sum the digits
        for (int digit : digits) 
		{
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number using the digits array
    public static double sumOfSquaresOfDigits(int number) 
	{
        int[] digits = storeDigits(number);
        double sum = 0;
        // Loop through the digits array and add the square of each digit
        for (int digit : digits) 
		{
            sum += Math.pow(digit, 2); // Use Math.pow() to calculate the square of the digit
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    // A Harshad number is divisible by the sum of its digits
    public static boolean isHarshadNumber(int number) 
	{
        int sum = sumOfDigits(number);
        // Check if the number is divisible by the sum of its digits
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int number) 
	{
        int[] digits = storeDigits(number);
        int[][] frequency = new int[10][2]; // Array to store digit and its frequency
        // Initialize frequency array, where column 0 is the digit and column 1 is its frequency
        for (int i = 0; i < 10; i++) 
		{
            frequency[i][0] = i; // First column holds the digits (0-9)
        }

        // Count the frequency of each digit
        for (int digit : digits) 
		{
            frequency[digit][1]++; // Increment the frequency count for the corresponding digit
        }
        return frequency;
    }

    // Main method to test the NumberChecker class methods
    public static void main(String[] args) 
	{
        // creating object of scanner class
	    Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number ");
        int number = input.nextInt();
        
        // Display the digits of the number
        System.out.println("Digits in the number: " + Arrays.toString(storeDigits(number)));

        // Find and display the sum of the digits of the number
        System.out.println("Sum of digits: " + sumOfDigits(number));

        // Find and display the sum of the squares of the digits of the number
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(number));

        // Check if the number is a Harshad number and display the result
        System.out.println("Is Harshad number? " + isHarshadNumber(number));

        // Find and display the frequency of each digit in the number
        int[][] frequencies = digitFrequency(number);
        System.out.println("Digit frequencies ");
        for (int i = 0; i < 10; i++) 
		{
            if (frequencies[i][1] > 0) 
			{
                System.out.println("Digit " + frequencies[i][0] + ": " + frequencies[i][1]);
            }
        }
    }
}
