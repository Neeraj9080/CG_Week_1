//import Scanner class for the user input 
import java.util.Scanner;

//Creating a class PriceCalculation to calculate total Purchase Price from unitPrice and quantity
class PriceCalculation
{
   public static void main(String args[])
   {
     //create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	 //creating two variable unitPrice to store quantity and price of one product and quantity
	 double unitPrice,quantity;
	 
	 //Displaying a message to take input
	 System.out.println("Enter the unitPrice ");
	 unitPrice = input.nextDouble();
	 
	 //Displaying a message to take input
	 System.out.println("Enter the quantity ");
	 quantity = input.nextDouble();
	 
	 //create a variable totalPurchasePrice to calculate total Purchase Price 
	 double totalPurchasePrice = unitPrice * quantity ;
	 
	 //Displaying the result
	 System.out.println("The total purchase price is INR " + totalPurchasePrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
	}
}	