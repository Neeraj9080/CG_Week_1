//import Scanner class for the user input 
import java.util.Scanner;

//Creating a class TemperatureConversionInCelsius to convert temperature from fahrenheit to celsius
class TemperatureConversionInCelsius
{
  public static void main(String args[])
  {
  //create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	 //creating a variable fahrenheit to store temperature in fahrenheit
	 double fahrenheit;
	 
	 //Displaying a message to take input
	 System.out.println("Enter the temperature in fahrenheit ");
	 fahrenheit = input.nextDouble();
	 
	 // creating a variables celsiusResult to store the celsius
	 double celsiusResult = (fahrenheit - 32 ) * (5.0/9) ;
	 
	 //Displaying the result
	 System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius ");
	}
}	