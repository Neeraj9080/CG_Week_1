//importing scanner class for user input
import java.util.Scanner;

// creating a class GCDandLCMCalculator to calculate GCD and LCM of two number
class GCDandLCMCalculator
{
     // Method calculateGCD to calculate GCD of two number
     public static int calculateGCD(int number1, int number2)
	 {
	     if(number2 == 0)
		 {
		     return number1;
		 }
		 else
		 {
		     return calculateGCD( number2, number1 % number2 );
		 } 
	 }
	 
	 // Method calculateLCM to calculate LCM of two number
	 public static int calculateLCM(int number1, int number2)
	 {
	     return ((number1*number2) / (calculateGCD(number1,number2)));
	 }
	 
	 // Main method
	 public static void main(String[] args)
	 {
	    Scanner input = new Scanner(System.in);
		
		// Taking user input
		System.out.println("Enter first number ");
		int number1 = input.nextInt();
		System.out.println("Enter second number ");
		int number2 = input.nextInt();
		
		// Displaying the result
		System.out.println("GCD of two numbers is " + calculateGCD(number1,number2));
		System.out.println("LCM of two numbers is " + calculateLCM(number1,number2));
	 }
}