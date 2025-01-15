//import Scanner class for user input
import java.util.Scanner;

//Creating a class NumberComparison to check if a number is positive/negative and compare first and last elements
class NumberComparison
{
    // Method to check if the number is positive or negative
    public static String isPositive(int number)
    {
        if (number >= 0) 
		{
            return "Positive";
        } 
		else 
		{
            return "Negative";
        }
    }

    // Method to check if the number is even or odd
    public static String isEvenOrOdd(int number)
    {
        if (number % 2 == 0) 
		{
            return "Even";
        } 
		else 
		{
            return "Odd";
        }
    }

    // Method to compare two numbers and return result
    public static int compare(int number1, int number2)
    {
        if (number1 > number2) 
		{
            return 1;
        } 
		else if (number1 < number2) 
		{
            return -1;
        } 
		else 
		{
            return 0;
        }
    }

    public static void main(String[] args)
    {
        // Create an object of Scanner class for user input
        Scanner input = new Scanner(System.in);
        
        // Create an array to store 5 numbers
        int[] numbers = new int[5];
        
        // Loop through the array to get user input for each number
        for (int i = 0; i < 5; i++) 
		{
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        
        // Check each number if positive/negative, even/odd and display the result
        for (int i = 0; i < 5; i++) 
		{
            System.out.println("Number " + numbers[i] + " is " + isPositive(numbers[i]) + " and " + isEvenOrOdd(numbers[i]));
        }
        
        // Compare first and last elements of the array
        int comparisonResult = compare(numbers[0], numbers[4]);
        
        if (comparisonResult > 0) 
		{
            System.out.println("First element is greater than last element");
        } 
		else if (comparisonResult < 0) 
		{
            System.out.println("First element is less than last element");
        } 
		else 
		{
            System.out.println("First and last elements are equal");
        }
    }
}
