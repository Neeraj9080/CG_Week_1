//import Scanner class for the user input 
import java.util.Scanner;

//Create a class IncomeCalculation to calculate income of a person
class IncomeCalculation
{
  public static void main(String args[])
  {
    //create an object of Scanner class named as input to take input from the user
     Scanner input = new Scanner(System.in);
	 
	 //Create a variable named salary and take user input.
	 int salary;
	 
	 //Displaying a message to take input
	 System.out.println("Enter the salary ");
	 salary = input.nextInt();
	 
	 //Create a variable bonus and take user input.
	 int bonus;
	 
	 //Displaying a message to take input
	 System.out.println("Enter the bonus ");
	 bonus = input.nextInt();
	 
	 // create a variable income to calculate income of a person
	 int income = salary + bonus ;
	 
	 //Displaying the result
	 System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + " .Hence Total Income is INR " + income);
	}
}