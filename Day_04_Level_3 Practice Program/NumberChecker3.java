import java.util.Scanner;

//creating a class NumberChecker3 to perform some operation on numbers
class NumberChecker3 
{

    // Method to check if a number is prime
    // A prime number is a number greater than 1 that has no divisors other than 1 and itself
    public static boolean isPrime(int number) 
	{
        if (number <= 1) 
		{
            return false; // Prime numbers are greater than 1
        }
        for (int i = 2; i <= Math.sqrt(number); i++) 
		{
            if (number % i == 0) 
			{
                return false; // If the number is divisible by any number other than 1 and itself, it's not prime
            }
        }
        return true; // If no divisors found, it's a prime number
    }

    // Method to check if a number is a neon number
    // A neon number is a number where the sum of digits of the square of the number is equal to the number itself
    public static boolean isNeon(int number) 
	{
        int square = number * number; // Find the square of the number
        int sumOfDigits = 0;
        // Sum the digits of the square
        while (square > 0) 
		{
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number; // If the sum of digits of the square is equal to the original number, it's a neon number
    }

    // Method to check if a number is a spy number
    // A spy number is a number where the sum of its digits is equal to the product of its digits
    public static boolean isSpyNumber(int number) 
	{
        int sum = 0;
        int product = 1;
        int temp = number;
        
        // Calculate sum and product of digits
        while (temp > 0) 
		{
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product; // If the sum and product of digits are equal, it's a spy number
    }

    // Method to check if a number is an automorphic number
    // An automorphic number is a number whose square ends with the number itself
    public static boolean isAutomorphic(int number) 
	{
        int square = number * number;
        // Check if the square ends with the original number
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    // Method to check if a number is a buzz number
    // A buzz number is a number that is either divisible by 7 or ends with 7
    public static boolean isBuzzNumber(int number) 
	{
        return number % 7 == 0 || String.valueOf(number).endsWith("7");
    }

    // Main method to test the NumberChecker class methods
    public static void main(String[] args) 
	{
        // creating object of scanner class
	    Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number ");
        int number = input.nextInt();

        // Check if the number is prime and display the result
        System.out.println("Is " + number + " prime? " + isPrime(number));

        // Check if the number is a neon number and display the result
        System.out.println("Is " + number + " neon? " + isNeon(number));

        // Check if the number is a spy number and display the result
        System.out.println("Is " + number + " spy number? " + isSpyNumber(number));

        // Check if the number is an automorphic number and display the result
        System.out.println("Is " + number + " automorphic? " + isAutomorphic(number));

        // Check if the number is a buzz number and display the result
        System.out.println("Is " + number + " buzz number? " + isBuzzNumber(number));
    }
}
