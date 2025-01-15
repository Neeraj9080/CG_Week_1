//Importing Scanner class for user input
import java.util.Scanner;
// Creating class name CheckLeapYear to check whether a given year is leap year or not using logical operator
class CheckLeapYearUsingLogicalOperator
{
  public static void main(String[] args) 
  {
        //Create a Scanner class object 
        Scanner input = new Scanner(System.in);
        
        //create a variables year to take year as input
        int year;
        
        //Displaying a message to take input  
        System.out.println("Enter the year ");
		year =input.nextInt();
		
		//identifying a given year is leap year or not 		
		if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0))
		{
            System.out.println("Given year is a Leap Year");
		}
		
		else
		{
		   System.out.println("Given year is a not Leap Year");
		}	
   }
}