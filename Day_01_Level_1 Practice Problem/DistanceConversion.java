//import Scanner class for the user input 
import java.util.Scanner;

//Creating a class DistanceConversion  to convert feets in yards and miles
class DistanceConversion
{
   public static void main(String args[])
   {
     //create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	 //creating a variable distanceInFeet to store distance in Feet
	 double distanceInFeet;
	 
	 //Displaying a message to take input
	 System.out.println("Enter the distance in feet ");
	 distanceInFeet = input.nextDouble();
	 
	 //create a variable distanceInYard to calculate distance in Yards
	 double distanceInYard = distanceInFeet / 3;
	 
	 //create a variable distanceInMiles to calculate distance in Miles
	 double distanceInMiles = distanceInYard / 1760 ;
	 
	 //Displaying the result
	 System.out.println("Your Distance in feet is " + distanceInFeet + " while in Yards is " + distanceInYard + " and miles is " + distanceInMiles);
	}
}