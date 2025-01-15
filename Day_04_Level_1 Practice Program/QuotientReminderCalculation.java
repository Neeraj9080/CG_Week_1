//import Scanner class for the user input 
import java.util.Scanner;

//Creating a class QuotientReminderCalculation to calculate to find quotient and remainder of 2 numbers 
class QuotientReminderCalculation
{

    // creating a method findRemainderAndQuotient to calculate remainder and quotient  
	public static int[] findRemainderAndQuotient(int number1, int number2) 
    {
	    //creating a array of integer type
		int[] array = new int[2];
	
	    //calculating quotient of two number
	    array[0] = number1 / number2 ;
	 
	   //calculating reminder of two number
	   array[1] = number1 % number2 ;  
	   
	   return array;
    }	


  public static void main(String args[])
  {
     //create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	 //creating two variable number1 and number2 to store value
	 int number1,number2;
	 
	 //Displaying a message to take input
	 System.out.println("Enter the Number1 ");
	 number1 = input.nextInt();
	 
	 //Displaying a message to take input
	 System.out.println("Enter the Number2 ");
	 number2 = input.nextInt();
	 
	 //creating array of integer type to store quotient and array
	 int[] array = findRemainderAndQuotient(number1,number2);
	 
	 //Displaying the result
	 System.out.println("The Quotient is " + array[0] + " and Reminder is " + array[1] + " of two number " + number1 + " and " + number2);
	}
}	