// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class DayOfWeek to calculate the day of the week for a given date
class DayOfWeek {
    public static void main(String[] args) 
	{
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);

        // Displaying a message to the user to enter the month, day, and year
        System.out.println("Enter month (1-12) ");
        int m = input.nextInt();
        System.out.println("Enter day (1-31) ");
        int d = input.nextInt();
        System.out.println("Enter year ");
        int y = input.nextInt();

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Print the day of the week 
        System.out.println("Day of the week: " + d0 + " (0=Sunday, 1=Monday, 2=Tuesday, 3=Wednesday, 4=Thursday, 5=Friday, 6=Saturday)");
    }
}
