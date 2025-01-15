//importing scanner class
import java.util.Scanner;

//creating a class CalendarDisplay to display a calendar
class CalendarDisplay 
{

    // Method to get the name of the month
    public static String getMonthName(int month) 
	{
        // Array to store the names of the months
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1]; // Return the name of the month
    }

    // Method to get the number of days in the month
    public static int getDaysInMonth(int month, int year) 
	{
        // Array to store the number of days for each month (index 0 = January, index 1 = February, etc.)
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // For February, check if it is a leap year
        if (month == 2) 
		{
            if (isLeapYear(year)) 
			{
                return 29; // Return 29 days if it's a leap year
            } 
			else 
			{
                return 28; // Return 28 days if it's not a leap year
            }
        }
        
        return daysInMonth[month - 1]; // Return the number of days for the given month
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) 
	{
        // Leap year logic: divisible by 4, but not by 100, unless divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) 
	{
        // Implementing the Gregorian calendar algorithm to calculate the first day of the month
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        return d0; // Return the first day of the month (0 = Sunday, 1 = Monday, etc.)
    }

    // Method to display the calendar for the given month and year
    public static void displayCalendar(int month, int year) 
	{
        // Get the name of the month and the number of days in the month
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDayOfMonth = getFirstDayOfMonth(month, year);
        
        // Print the header of the calendar
        System.out.println("\nCalendar for " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        // Print leading spaces for the first day of the month
        for (int i = 0; i < firstDayOfMonth; i++) 
		{
            System.out.print("    "); // Print 4 spaces for each day before the first of the month
        }
        
        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) 
		{
            System.out.printf("%3d ", day); // Print each day, right-justified to width 3
            if ((firstDayOfMonth + day) % 7 == 0) 
			{
                System.out.println(); // Move to the next line after Saturday
            }
        }
        System.out.println(); // Print a newline at the end of the calendar
    }

    // Main method to take month and year input from the user and display the calendar
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        
        // Take month and year as input from the user
        System.out.print("Enter the month (1-12) ");
        int month = scanner.nextInt();
        
        System.out.print("Enter the year ");
        int year = scanner.nextInt();
        
        // Display the calendar for the given month and year
        displayCalendar(month, year);
        
    }
}
