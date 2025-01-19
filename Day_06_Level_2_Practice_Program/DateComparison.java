// Importing necessary classes for working with dates
import java.time.LocalDate;
import java.util.Scanner;

// Creating a class DateComparison to compare two dates
class DateComparison 
{
    // Method to take date input from the user
    public static LocalDate getUserInput() 
	{
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);

        // Asking user to input a date in yyyy-MM-dd format
        System.out.print("Enter a date (yyyy-MM-dd) ");
        String dateStr = input.nextLine();
        
        // Returning the entered date as a LocalDate object
        return LocalDate.parse(dateStr);
    }

    public static void main(String[] args) 
	{
        // Get two dates as input from the user
        LocalDate date1 = getUserInput();
        LocalDate date2 = getUserInput();
        
        // Compare the dates using isBefore(), isAfter(), and isEqual() methods
        if (date1.isBefore(date2)) 
		{
            System.out.println("The first date is before the second date");
        } 
		else if (date1.isAfter(date2)) 
		{
            System.out.println("The first date is after the second date");
        } 
		else if (date1.isEqual(date2)) 
		{
            System.out.println("The two dates are the same");
        }
		
    }
}
