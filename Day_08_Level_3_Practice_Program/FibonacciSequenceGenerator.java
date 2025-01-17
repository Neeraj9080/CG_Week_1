// Importing Scanner class for user input
import java.util.Scanner;

// creating class FibonacciSequenceGenerator to generate fibonacci series and calculate their sum
class FibonacciSequenceGenerator
{
  // Method generateFibonacciNumber to generate fibonacci series
  public static int[] generateFibonacciNumber(int number)
  {
       int[] fibonacci = new int[number];
	   fibonacci[0] = 0;
	   fibonacci[1] = 1;
	   
	   for(int i=2;i<number;i++)
	   {
	       fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
	   } 

     return fibonacci;	   
  }
  
  // Method calculateFibonacciSeriesSum to calculate fibonacci series sum
  public static int calculateFibonacciSeriesSum(int number)
  {
     int[] fibonacciSeries = generateFibonacciNumber(number);
     int sum = 0;
	 
     for(int i=0;i<number;i++)
	 {
	    sum = sum + fibonacciSeries[i];
	 }
	 
	 return sum;
  }
  
  // Main method
  public static void main(String[] args)
  {
       Scanner input = new Scanner(System.in);
	   
	   // Taking user input
	   System.out.println("Enter the term you want to generate Fibonacci series ");
	   int number = input.nextInt();
	   
	   // printing sum of fibonacci series
	   System.out.println("Sum of fibonacci series " +calculateFibonacciSeriesSum(number));
	   
	   // Displaying fibonacci series
	   int[] fibonacciSeries = generateFibonacciNumber(number);
	   System.out.println("Fibonacci Series is ");
       for(int i=0;i<number;i++)
       {
	       System.out.print(fibonacciSeries[i] + " ");
       }
  }
}