//import Scanner class for the user input 
import java.util.Scanner;

//Creating a class PerimeterCalculation to calculate perimeter of square
class PerimeterCalculation
{
  public static void main(String args[])
   {
     //create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	 //creating a variable perimeterOfSquare to store perimeter of square
	 int perimeterOfSquare;
	 
	 //Displaying a message to take input
	 System.out.println("Enter the perimeter of the square ");
	 perimeterOfSquare = input.nextInt();
	 
	 //create a variable side to calculate side Of Square
	 int side = perimeterOfSquare / 4 ;
	 
	 //Displaying the result
	 System.out.println("The length of the side is " + side + " whose perimeter is " + perimeterOfSquare);
    }
}	