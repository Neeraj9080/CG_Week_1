// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class SmallestLargestNumber to find smallest and largest number
class SmallestLargestNumber
{
	public static int[] findSmallestAndLargest(int number1, int number2, int number3)
	{
	  //create a array of integer type to store smallest and largest number
	  int[] array = new int[2];  
	
	 // finding smallest number among three number
	 if (number1 < number2 && number1 < number3) 
	 {
	     array[0] = number1 ;
	 } 
	 else if (number1 < number2 && number1 < number3)
	 {
	     array[0] = number2;
	 }
	 else 
	 {
	     array[0] = number3;
	 }
	 
	 // finding largest number among three number
	 if (number1 > number2 && number1 > number3) 
	 {
	     array[1] = number1 ;
	 } 
	 else if (number1 > number2 && number1 > number3)
	 {
	     array[1] = number2;
	 }
	 else 
	 {
	     array[1] = number3;
	 }
	 
	 return array;
	}
	
   public static void main(String args[])
   {
     // Create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	 // Create variables to store the three input numbers
	 int number1, number2, number3;
	 
	 // Displaying a message to take input for the first number
	 System.out.println("Enter first number ");
	 number1 = input.nextInt();
	 
	 // Displaying a message to take input for the second number
	 System.out.println("Enter second number ");
	 number2 = input.nextInt();
	 
	 // Displaying a message to take input for the third number
	 System.out.println("Enter third number ");
	 number3 = input.nextInt();
	 
	 int[] array = findSmallestAndLargest(number1,number2,number3);
	 
	 // Checking if the third number is the largest
	 System.out.println("Smallest Number is " + array[0] + " Largest Number is " + array[1] );
   }
}
