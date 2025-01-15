//import Scanner class for the user input 
import java.util.Scanner;

//Creating a class DoubleOpt to perform some double operations
class DoubleOpt
{
  public static void main(String args[])
  {
  //create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	 //creating three variable a,b and c to store value
	 double a,b,c;
	 
	 //Displaying a message to take input
	 System.out.println("Enter the value of a ");
	 a = input.nextDouble();
	 
	 //Displaying a message to take input
	 System.out.println("Enter the value of b ");
	 b = input.nextDouble();
	 
	 //Displaying a message to take input
	 System.out.println("Enter the value of c ");
	 c = input.nextDouble();
	 
	 // creating some variables to store the results of Int Operation
	 double result1 = a + b * c ;
	 double result2 = a * b + c ;
	 double result3 = c + a / b ;
	 double result4 = a % b + c ;
	 
	 //Displaying the result
	 System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + " and " + result4);
	}
}	