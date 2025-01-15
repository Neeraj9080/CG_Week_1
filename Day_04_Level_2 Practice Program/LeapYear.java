//import Scanner class for user input
import java.util.Scanner;

//Creating a class LeapYear to check if the given year is a leap year
class LeapYear
{
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year)
    {
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) 
		{
            return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        // Create an object of Scanner class for user input
        Scanner input = new Scanner(System.in);
        
        // Get user input for the year
        System.out.println("Enter a year to check if it's a leap year ");
        int year = input.nextInt();
        
        // Check if the year is a leap year and display the result
        if (isLeapYear(year)) 
		{
            System.out.println("Given year is a Leap Year");
        } 
		else 
		{
            System.out.println("Given year is not a Leap Year");
        }
    }
}
