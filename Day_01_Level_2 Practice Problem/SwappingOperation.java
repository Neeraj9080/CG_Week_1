//import Scanner class for the user input 
import java.util.Scanner;

//Creating a class SwappingOperation to perform swap operation
class SwappingOperation
{
  public static void main(String args[])
  {
    //create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	//Create a variable number1 and take user input
	int number1;
	
	//Displaying a message to take input
	 System.out.println("Enter the number1 ");
	 number1 = input.nextInt();
	 
	//Create a variable number2 and take user input
	int number2;
	
	//Displaying a message to take input
	 System.out.println("Enter the number2 ");
	 number2 = input.nextInt();
	 
	 //swapping the number
	 number1 = number1 + number2 ;
	 number2 = number1 - number2 ;
	 number1 = number1 - number2 ;
	 
	//Displaying the result
	 System.out.println("The swapped numbers are " + number1 + " and " + number2);
	}
} 
	 