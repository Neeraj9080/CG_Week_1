//import Scanner class for the user input 
import java.util.Scanner;

//Creating a class KilometersToMilesComputation to convert kilometer distance into miles
class KilometersToMilesComputation
{
  public static void main(String args[])
  {
     //create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	 //Displaying a message for the user so they can input kilometer
	 System.out.println("Enter the KM");
	 
	 //create a variable km to take distance in kilometer as a input from the user   
	 double km = input.nextDouble();
	 
	 //create a variable miles to store miles distance   
	 double miles = km * 1.6;
	 
	 //Displaying the result
	 System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
   }
}   