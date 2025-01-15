//import Scanner class for the user input 
import java.util.Scanner;

//Creating a class IntOperation to perform some integer operation
class IntOperation
{
  public static void main(String args[])
  {
  //create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	 //creating three variable a,b and c to store value
	 int a,b,c;
	 
	 //Displaying a message to take input
	 System.out.println("Enter the value of a ");
	 a = input.nextInt();
	 
	 //Displaying a message to take input
	 System.out.println("Enter the value of b ");
	 b = input.nextInt();
	 
	 //Displaying a message to take input
	 System.out.println("Enter the value of c ");
	 c = input.nextInt();
	 
	 // creating some variables to store the results of Int Operation
	 int result1 = a + b * c ;
	 int result2 = a * b + c ;
	 int result3 = c + a / b ;
	 int result4 = a % b + c ;
	 
	 //Displaying the result
	 System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + " and " + result4);
	}
}	