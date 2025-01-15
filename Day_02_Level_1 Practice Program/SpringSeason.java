// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class SpringSeason to check if it is spring season based on month and day
class SpringSeason
{
   public static void main(String args[])
   {
     // Create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	 // Create variables for month and day
	 int month, day;
	 
	 // Displaying a message to take input for the month
	 System.out.println("Enter the month: ");
	 month = input.nextInt();
	 
	 // Displaying a message to take input for the day
	 System.out.println("Enter the day: ");
	 day = input.nextInt();
	 
	 // Checking if it is within the spring season range or not
	 if ((month == 3 && day >= 20) || (month == 4 || month == 5 || (month == 6 && day <= 20))) 
	 {
	     System.out.println("It's a Spring Season");
	 } 
	 else 
	 {
	     System.out.println("Not a Spring Season");
	 }
   }
}
