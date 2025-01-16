// Importing Scanner class for user input
import java.util.Scanner;

// creating a class CalendarDisplay to display the calendar
class DisplayCalendar
{
    // Method to get the name of the month
    public static String getMonthName(int month)
    {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1]; // Return the corresponding month name
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year)
    {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)); // Leap year logic
    }

    // Method to get the number of days in a given month
    public static int getNumberOfDays(int month, int year)
    {
        // Array containing the number of days in each month
        int[] days = {31, (isLeapYear(year) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return days[month - 1]; // Return the number of days for the given month
    }

    // Method to calculate the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year)
    {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + 31 * m0 / 12) % 7; // Return the day of the week for the 1st day
    }

    // Method to display the calendar for a given month and year
    public static void displayCalendar(int month, int year)
    {
        // Get the first day and number of days for the month
        int firstDay = getFirstDayOfMonth(month, year);
        int numberOfDays = getNumberOfDays(month, year);
        String monthName = getMonthName(month);

        // Display the month and year
        System.out.println("Calendar for " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print spaces for the first day of the month
        for (int i = 0; i < firstDay; i++)
        {
            System.out.print("    "); // Print spaces for alignment
        }

        // Print the days of the month
        for (int day = 1; day <= numberOfDays; day++)
        {
            System.out.printf("%3d ", day); // Print each day right-aligned in a field of width 3
            if ((firstDay + day) % 7 == 0)
            {
                System.out.println(); // Move to the next line after Saturday
            }
        }
        System.out.println();
    }

    // Main method to take user input and display the calendar
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Taking user input for month and year
        System.out.println("Enter the month (1-12)");
        int month = input.nextInt();
        System.out.println("Enter the year");
        int year = input.nextInt();

        // Display the calendar for the given month and year
        displayCalendar(month, year);
    }
}
