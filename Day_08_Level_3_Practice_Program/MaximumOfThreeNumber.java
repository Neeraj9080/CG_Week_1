// Importing Scanner class for user input
import java.util.Scanner;

// creating a class MaximumOfThreeNumber to find maximum number among three number
class MaximumOfThreeNumber
{
	
	// creating a method findMaximumNumber to find maximum number
public static int findMaximumNumber(int number1, int number2, int number3)
{
     if(number1 > number2 && number1 > number3)
	 {
	    return number1;
	 }
	 else if(number2 > number1 && number2 > number3 )
	 {
	    return number2;
	 }
	 else
	 {
	    return number3;
	 }
}
	
    // Main method
    public static void main(String[] args)
	{
	    Scanner input = new Scanner(System.in);
		
		// Taking user input
		System.out.println("Enter the first number ");
		int number1 = input.nextInt();
		System.out.println("Enter the second number ");
		int number2 = input.nextInt();
		System.out.println("Enter the third number ");
		int number3 = input.nextInt();
		
		// Displaying the result
		System.out.println("Maximum Number among three number is " + findMaximumNumber(number1,number2,number3));
	}
	
}