// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class VotingEligibility to check if a person can vote based on age or not
class VotingEligibility
{
   public static void main(String args[])
   {
     // Create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	 // Create a variable to store the person's age
	 int age;
	 
	 // Displaying a message to take input for the person's age
	 System.out.println("Enter the age: ");
	 age = input.nextInt();
	 
	 // Checking if the person is eligible to vote or not
	 if (age >= 18) 
	 {
	     // Displaying the result if eligible to vote
	     System.out.println("The person's age is " + age + " and can vote.");
	 } 
	 else 
	 {
	     // Displaying the result if not eligible to vote
	     System.out.println("The person's age is " + age + " and cannot vote.");
	 }
   }
}
