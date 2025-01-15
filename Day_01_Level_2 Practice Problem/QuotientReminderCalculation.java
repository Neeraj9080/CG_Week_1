//import Scanner class for the user input 
import java.util.Scanner;

//Creating a class Calculator to calculate addition, subtraction, multiplication and division value of 2 numbers 
class QuotientReminderCalculation
{
  public static void main(String args[])
  {
     //create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	 //creating two variable number1 and number2 to store value
	 double number1,number2;
	 
	 //Displaying a message to take input
	 System.out.println("Enter the Number1 ");
	 number1 = input.nextInt();
	 
	 //Displaying a message to take input
	 System.out.println("Enter the Number2 ");
	 number2 = input.nextInt();
	 
	 //create a variable quotient to store quotient of two number
	 double quotient = number1 / number2 ;
	 
	 //create a variable reminder to store reminder of two number
	 double reminder = number1 % number2 ;
	 
	 //Displaying the result
	 System.out.println("The Quotient is " + quotient+ " and Reminder is " + reminder + " of two number " + number1 + " and " + number2);
	}
}	