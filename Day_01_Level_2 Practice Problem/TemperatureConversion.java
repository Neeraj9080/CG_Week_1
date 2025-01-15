//import Scanner class for the user input 
import java.util.Scanner;

//Creating a class TemperatureConversion to convert temperature from celsius to farenheit
class TemperatureConversion
{
  public static void main(String args[])
  {
  //create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	 //creating a variable celsius to store temperature in celsius
	 double celsius;
	 
	 //Displaying a message to take input
	 System.out.println("Enter the temperature in celsius ");
	 celsius = input.nextDouble();
	 
	 // creating a variables farenheitResult to store the farenheit
	 double farenheitResult = (celsius * (9.0/5)) + 32 ;
	 
	 //Displaying the result
	 System.out.println(" The " + celsius + " celsius is " + farenheitResult + " fahrenheit ");
	}
}	