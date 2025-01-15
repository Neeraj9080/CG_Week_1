//import Scanner class for the user input 
import java.util.Scanner;

//Creating a class Calculator to calculate addition, subtraction, multiplication and division value of 2 numbers 
class Calculator
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
	 
	 //create a variable addition and performing addition operation
	 double addition = number1 + number2 ;
	 
	 //create a variable subtraction and performing subtraction operation
	 double subtraction = number1 - number2;
	 
	 //create a variable multiplication and performing multiplication operation
	 double multiplication = number1 * number2 ;
	 
	 //create a variable division and performing division operation
	 double division = number1 / number2;
	 
	 //Displaying the results
	 System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + " and " + division);
   }
}