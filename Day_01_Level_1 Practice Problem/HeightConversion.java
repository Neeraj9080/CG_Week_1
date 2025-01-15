//import Scanner class for the user input 
import java.util.Scanner;

//Creating a class HeightConversion to convert centimeters into feets and inches
class HeightConversion
{
  public static void main(String args[])
  {
     //create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	 //Displaying a message to take input
	 System.out.println("Enter the Height in cm");
	 
	 //create a variable height to take height in cm as a input   
	 double height = input.nextDouble();
	 
	 //create a variable feets to store feets   
	 double feets =  height / (12*2.54);
	 
	 //create a variable inches to store inches   
	 double inches =  height / 2.54;
	 
	 //Displaying the result
	 System.out.println("Your Height in cm is " + height + " while in feet is " + feets + " and inches is " + inches);
   }
}   