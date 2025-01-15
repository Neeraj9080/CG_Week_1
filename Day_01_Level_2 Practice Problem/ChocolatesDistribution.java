//import Scanner class for the user input 
import java.util.Scanner;

//Creating a class ChocolatesDistribution to calculate how many chocolates are distributed among student
class ChocolatesDistribution
{
  public static void main(String args[])
  {
    //create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	//create a variable numberOfChocolates to store total number of chocolates 
	int numberOfChocolates;
	
	//Displaying a message to take input
	 System.out.println("Enter the number Of Chocolates");
	 numberOfChocolates = input.nextInt();
	
	//create a variable numberOfStudents to store total number of students 
	int numberOfStudents;
	
	//Displaying a message to take input
	 System.out.println("Enter the number Of Students");
	 numberOfStudents = input.nextInt();
	 
	//create a variable distributedChocolates to calculate how many chocolates each students gets
    int distributedChocolates = numberOfChocolates / (numberOfStudents);
	
    //create a variable remainingChocolates to calculate how many chocolates are remaining
    int remainingChocolates = numberOfChocolates % (numberOfStudents);
	
    //Printing the result
	 System.out.println("The number of chocolates each child gets is " + distributedChocolates + " and the number of remaining chocolates are " + remainingChocolates );
	}
}	
	
	