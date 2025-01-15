import java.util.Arrays;
import java.util.Scanner;

//creating a class NumberChecker2 to perform some operation on numbers
class NumberChecker2 
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

    // Method to reverse the digits array
    public static int[] reverseDigitsArray(int[] digits) 
	{
        int[] reversed = new int[digits.length];
        // Reverse the digits array by swapping elements
        for (int i = 0; i < digits.length; i++) 
		{
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] array1, int[] array2) 
	{
        return Arrays.equals(array1, array2); // Check if both arrays are equal
    }

    // Method to check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int number) 
	{
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseDigitsArray(digits);
        // A number is a palindrome if the digits are the same when reversed
        return compareArrays(digits, reversedDigits);
    }

    // Method to check if a number is a Duck number
    // A Duck number is a number that has at least one non-zero digit in it, and its first digit is not zero
    public static boolean isDuckNumber(int number) 
	{
        int[] digits = storeDigits(number);
        // Check if the first digit is not zero and if any digit other than the first is non-zero
        if (digits[0] != 0) 
		{
            for (int i = 1; i < digits.length; i++) 
			{
                if (digits[i] != 0) {
                    return true; // It's a Duck number if any non-zero digit exists after the first one
                }
            }
        }
        return false;
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

        // Check if the number is a palindrome and display the result
        System.out.println("Is palindrome? " + isPalindrome(number));

        // Check if the number is a Duck number and display the result
        System.out.println("Is Duck number? " + isDuckNumber(number));
    }
}
