//import Scanner class for the user input 
import java.util.Scanner;

// Creating a class SimpleInterest to calculate simple interest
class SimpleInterest
{
   // create a SimpleInterestCalculation method to simple interest
  double SimpleInterestCalculation(double principal, double rateOfInterest, double time)
  {
     //create a variable simpleInterest to calculate simple interest
     double simpleInterest = (principal*rateOfInterest*time)/100;  
	 
	 return simpleInterest;
  }


  public static void main(String args[])
  {
  //create an object of Scanner class named as input to take input from the user
  Scanner input = new Scanner(System.in);
  
  //create three variable principal,rateOfInterest,time for calculating simple interest
  double principal,rateOfInterest,time;
  
  //Displaying a message to take input
  System.out.println("Enter the principal amount ");
  principal = input.nextDouble();
  
  //Displaying a message to take input
  System.out.println("Enter the rate of interest ");
  rateOfInterest = input.nextDouble();
  
  //Displaying a message to take input
  System.out.println("Enter the time ");
  time = input.nextDouble();
  
  // creating object of simple interest class
  SimpleInterest obj = new SimpleInterest();
  
  //Printing the result
  System.out.println("The SimpleInterest Is " + (obj.SimpleInterestCalculation(principal,rateOfInterest,time)) + " for principal " + principal + " rate of interest " + rateOfInterest + " and Time " + time);
  }
}