// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class VotingAgeVerification to check if a person can vote or not
class VotingAgeVerification
{
  public static void main(String[] args)
  {
    // Create an object of Scanner class to take input from the user
       Scanner input = new Scanner(System.in);
	   
	// Create a variable named arraySize and assign value 10
	   int arraySize = 10;  

    // Declare a array named studentAge to store the age of the students
       int[] studentAge	= new int[arraySize];
	   
	// loop start from 0 and goes to 9   
	   for(int i=0;i<10;i++)
	   {
         // Prompt to user to enter a age of the students
         System.out.println("Enter the age of the students"+(i+1));
         studentAge[i] = input.nextInt();
		 
		 // checking student can vote or not
		 if (studentAge[i] >= 18 )
		 {
		     System.out.println("The student with the age " + studentAge[i] + " can vote ");
		 }
		 else
		 {
		     System.out.println("The student with the age " + studentAge[i] + " cannot vote ");
		 }
		}
	}	
}   
	   