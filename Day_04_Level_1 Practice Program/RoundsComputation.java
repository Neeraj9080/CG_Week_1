//import Scanner class for the user input 
import java.util.Scanner;

//Creating a class RoundsComputation to calculate  how many rounds must the athlete complete
class RoundsComputation
{
   //create a method perimeterOfTriangleCalculation to calculate perimeter of Triangle
   double perimeterOfTriangleCalculation(int side1,int side2,int side3)
   {
       // create a variable perimeterOfTriangle to calculate a perimeter of Triangle
       int perimeterOfTriangle = side1 + side2 + side3 ;
	
	  // create a variable numbersOfRounds to calculate how many rounds must the athlete complete
	  double numbersOfRounds = 5.0/perimeterOfTriangle;
	  
	  return numbersOfRounds;
   }
  
  public static void main(String args[])
  {
    //create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	// create three variable to store side of triangle 
	 int side1, side2, side3;
	 
	//Displaying a message to take input
	 System.out.println("Enter the side1 of a triangle");
	 side1 = input.nextInt(); 
	 
	//Displaying a message to take input
	 System.out.println("Enter the side2 of a triangle");
	 side2 = input.nextInt();

    //Displaying a message to take input
	 System.out.println("Enter the side3 of a triangle");
	 side3 = input.nextInt();

    // create a object of class RoundsComputation
	RoundsComputation obj = new RoundsComputation();
	
	//Printing the result
	 System.out.println("The total number of rounds the athlete will run is " + (obj.perimeterOfTriangleCalculation(side1,side2,side3)) + " to complete 5 km");
	}
}
	
    	