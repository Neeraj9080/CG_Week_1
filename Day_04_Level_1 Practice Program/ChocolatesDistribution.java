//import Scanner class for the user input 
import java.util.Scanner;

//Creating a class ChocolatesDistribution to calculate how many chocolates are distributed among student
class ChocolatesDistribution
{
  // creating a method findNumberOfChocolates of integer array type
  public static int[] findNumberOfChocolates(int numberOfChocolates, int numberOfStudents)
  {
       int array[] = new int[2];	   
  
      //calculating how many chocolates each students gets
      array[0] = numberOfChocolates / (numberOfStudents);
	
     //calculating how many chocolates are remaining
     array[1] = numberOfChocolates % (numberOfStudents);
	 
	 return array;
  }
  
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
	 
	// creating an array of integer type   
	int[] array = findNumberOfChocolates(numberOfChocolates,numberOfStudents);
	
    //Printing the result
	 System.out.println("The number of chocolates each child gets is " + array[0] + " and the number of remaining chocolates are " + array[1] );
	}
}	
	
	