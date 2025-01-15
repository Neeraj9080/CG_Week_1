// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class RocketCountdownUsingWhileLoop for rocket countdown using while loop
class RocketCountDownUsingWhileLoop
{
   public static void main(String args[])
   {
     // Create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	 // Create a variable to store the starting countdown number
	 int counter;
	 
	 // Displaying a message to take input for the countdown number
	 System.out.println("Enter the countdown starting number: ");
	 counter = input.nextInt();
	 
	 // Countdown using a while loop
	 while (counter >= 1) 
	 {
	     // Displaying the countdown number
	     System.out.println(counter);
		 
	     // Decrement the counter
	     counter--;
	 }
   }
}
