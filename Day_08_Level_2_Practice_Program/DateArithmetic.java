// Importing necessary classes for working with dates
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

// Creating a class DateArithmetic to perform date arithmetic operations
class DateArithmetic 
{
    // Main method
    public static void main(String[] args) 
	{
	    // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);

        // Asking user to input a date in yyyy-MM-dd format
        System.out.print("Enter a date (yyyy-MM-dd) ");
        String dateStr = input.nextLine();
        
        // storing the entered date as a LocalDate object 
        LocalDate date = LocalDate.parse(dateStr);
        
        // Add 7 days, 1 month, and 2 years to the date
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2);
        
        // Subtract 3 weeks from the resulting date
        newDate = newDate.minusWeeks(3);
        
        // Display the result
        System.out.println("New date after arithmetic " + newDate);
		       
        // Closing the scanner to prevent memory leaks
        input.close();
    }
}
