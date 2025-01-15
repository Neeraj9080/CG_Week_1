//import Scanner class for the user input 
import java.util.Scanner;

//Creating a class FeeCalculation to calculate fee of the university
class UniversityFeeCalculation
{
  public static void main(String args[])
  {
  
    //create an object of Scanner class named as input to take input from the user
    Scanner input = new Scanner(System.in);
	 
	//Displaying a message for the user so they can input fees
	System.out.println("Enter the fees");
	 
    //Create a variable named fee to store fees in it
    int fee = input.nextInt();
	
	//Displaying a message for the user so they can input Discount Percent
	System.out.println("Enter the Discount Percent ");
	
	//Create a variable named discountPercent to store discount Percent in it
	double discountPercent  = input.nextDouble();
	
	//Create a variable named discount to calculate discount
	double discount = fee * (discountPercent/100.0);
	
	//Create a variable named discountedPrice to calculate discounted price that student will pay for the course
	double discountedPrice = fee - discount;
	
	//Displaying the result
	System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedPrice);
   }
}
	
	
	