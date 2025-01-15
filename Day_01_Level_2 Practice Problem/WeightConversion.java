//import Scanner class for the user input 
import java.util.Scanner;

//Creating a class WeightConversion to convert pounds in kilograms
class WeightConversion
{
  public static void main(String args[])
  {
  //create an object of Scanner class named as input to take input from the user
  Scanner input = new Scanner(System.in);
  
  // create a variable weightInPounds to store weight of the person in pounds
  double weightInPounds;
  
  //Displaying a message to take input
  System.out.println("Enter the weight of the person in pounds ");
  weightInPounds = input.nextDouble();
  
  //Create a variable weightInkilograms to store weight of the person in kilograms
  double weightInkilograms = weightInPounds / 2.2 ;
  
  //Printing the result
  System.out.println("The weight of the person in pound is " + weightInPounds + " and in kg is " + weightInkilograms );
  }
}