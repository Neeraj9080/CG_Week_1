//import Scanner class for the user input 
import java.util.Scanner;

//Creating a class AreaOfTriangleCalculation to calculate area of triangle
class AreaOfTriangleCalculation
{
   public static void main(String args[])
   {
     //create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	 //creating two variable base and height to store base and height of triangle
	 double base,height;
	 
	 //Displaying a message to take input
	 System.out.println("Enter the base of the triangle in cm ");
	 base = input.nextInt();
	 
	 //Displaying a message to take input
	 System.out.println("Enter the height of the triangle in cm ");
	 height = input.nextInt();
	 
	 //create a variable areaofTriangleInCm to calculate Area of Triangle In Cm
	 double areaofTriangleInCm = (1.0/2)*base*height;
	 
	 //create a variable areaofTriangleInFeets to calculate Area of Triangle In Feet
	 double areaofTriangleInFeets = areaofTriangleInCm / (12*2.54);
	 
	 //create a variable areaofTriangleInInches to calculate Area of Triangle In Inches
	 double areaofTriangleInInches = areaofTriangleInCm / 2.54 ;
	 
	 //Displaying the result
	 System.out.println("Area of Triangle in cm is " + areaofTriangleInCm + " while in feet is " + areaofTriangleInFeets + " and in inches is " + areaofTriangleInInches);
	}
}	