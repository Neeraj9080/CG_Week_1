// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class EmployeeBonusCalculation to calculate bonus based on years of service
class EmployeeBonusCalculation
{
    public static void main(String args[])
    {
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);

        // Create a variables to store salary and years of service
        double salary;
        int yearsOfService;

        // Displaying a message to the user to enter the salary and years of service
        System.out.println("Enter the employee's salary: ");
        salary = input.nextDouble();

        System.out.println("Enter the employee's years of service: ");
        yearsOfService = input.nextInt();

        // Check if the employee is eligible for a bonus
        if (yearsOfService > 5)
        {
            // Calculate bonus (5% of salary)
            double bonus = salary * 0.05;

            // Display the bonus amount
            System.out.println("The bonus amount is " + bonus);
        }
        else
        {
            System.out.println("The employee is not eligible for a bonus");
        }
    }
}
