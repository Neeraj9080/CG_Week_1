import java.util.Arrays;
import java.util.Scanner;

//creating a class NumberChecker to perform some operation on numbers
class NumberChecker 
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

    // Method to check if the number is a Duck number
    public static boolean isDuckNumber(int number) 
	{
        int[] digits = storeDigits(number);
        // Check if any digit is non-zero
        for (int digit : digits) 
		{
            if (digit != 0)
                return true;
        }
        return false;
    }

    // Method to check if the number is an Armstrong number
    public static boolean isArmstrongNumber(int number) 
	{
        int[] digits = storeDigits(number);
        int sum = 0;
        int numDigits = digits.length;
        // Check if the sum of digits raised to the power of the number of digits equals the number
        for (int digit : digits) 
		{
            sum += Math.pow(digit, numDigits);
        }
        return sum == number;
    }

    // Method to find the largest and second largest digits in an array
    public static int[] findLargestAndSecondLargest(int[] digits) 
	{
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        // Loop through the array to find the largest and second largest digits
        for (int digit : digits) 
		{
            if (digit > largest) 
			{
                secondLargest = largest;
                largest = digit;
            } 
			else if (digit > secondLargest) 
			{
                secondLargest = digit;
            }
        }
        return new int[] {largest, secondLargest};
    }

    // Method to find the smallest and second smallest digits in an array
    public static int[] findSmallestAndSecondSmallest(int[] digits) 
	{
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        // Loop through the array to find the smallest and second smallest digits
        for (int digit : digits) 
		{
            if (digit < smallest) 
			{
                secondSmallest = smallest;
                smallest = digit;
            } 
			else if (digit < secondSmallest) 
			{
                secondSmallest = digit;
            }
        }
        return new int[] {smallest, secondSmallest};
    }

    // Main method to test NumberChecker methods
    public static void main(String[] args) 
	{
        // creating object of scanner class
	    Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number ");
        int number = input.nextInt();
		
        int[] digits = storeDigits(number);

        // Display the digits of the number
        System.out.println("Digits in the number: " + Arrays.toString(digits));

        // Check if the number is a Duck number and Armstrong number
        System.out.println("Is Duck number? " + isDuckNumber(number));
        System.out.println("Is Armstrong number? " + isArmstrongNumber(number));

        // Find and display largest and second largest digits
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
        System.out.println("Largest Digit: " + largestAndSecondLargest[0]);
        System.out.println("Second Largest Digit: " + largestAndSecondLargest[1]);

        // Find and display smallest and second smallest digits
        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Digit: " + smallestAndSecondSmallest[0]);
        System.out.println("Second Smallest Digit: " + smallestAndSecondSmallest[1]);
    }
}
