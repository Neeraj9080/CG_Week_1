//import Scanner class for the user input 
import java.util.Scanner;

//Creating a class HandshakesCalculation to calculate maximum number of handshakes are possible among student
class HandshakesCalculation
{
    // create a method handshakesComputation to calculate total number of handshakes
	int handshakesComputation(int numberOfStudents)
	{
		//create a variable numberOfHandshakes to calculate number of handshakes possible
	    int numberOfHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2 ;
		return numberOfHandshakes;
	}
	
  public static void main(String args[])
   {
     //create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	 //creating a variable numberOfStudents to store number of Students are present 
	 int numberOfStudents;
	 
	 //Displaying a message to take input
	 System.out.println("Enter the number of students ");
	 numberOfStudents = input.nextInt();
	 
	 //creating a object of HandshakesCalculation class
	 HandshakesCalculation obj = new HandshakesCalculation();
	 
	 //Displaying the result
	 System.out.println("The number of possible handshakes is " + (obj.handshakesComputation(numberOfStudents)));
	}
}	