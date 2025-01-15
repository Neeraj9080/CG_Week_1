// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class to calculate the bonus for 10 employees based on their years of service and salary
class EmployeeBonus
{
    public static void main(String[] args)
    {
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Declare arrays for saving the salary and years of service for each of the 10 employees
        double[] salary = new double[10];
        int[] yearsOfService = new int[10];
        
        // Declare arrays for saving the new salary, bonus, and variables for total bonus and total salaries
        double[] newSalary = new double[10];
        double[] bonus = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Loop to take input from the user for salary and years of service
        for (int i = 0; i < 10; i++) 
        {
            System.out.println("Enter salary of employee " + (i + 1) + " ");
            salary[i] = input.nextDouble();
            
            // checking salary input is valid or not
            if (salary[i] <= 0) 
            {
                System.out.println("Invalid salary input. Please enter a valid salary");
                i--; // Decrement the counter to ask for the input again
                continue;
            }

            System.out.println("Enter years of service of employee " + (i + 1) + " ");
            yearsOfService[i] = input.nextInt();
            
            // checking years of service input is valid or not
            if (yearsOfService[i] < 0) 
            {
                System.out.println("Invalid years of service input. Please enter a valid number");
                i--; // Decrement the counter to ask for the input again
                continue;
            }
        }
        
        // Loop to calculate bonus and new salary for each employee
        for (int i = 0; i < 10; i++) 
        {
            // If years of service are greater than 5, bonus is 5%, otherwise it's 2%
            if (yearsOfService[i] > 5) 
            {
                bonus[i] = salary[i] * 0.05;
            } 
            else 
            {
                bonus[i] = salary[i] * 0.02;
            }

            // Calculate new salary
            newSalary[i] = salary[i] + bonus[i];

            // Update total values
            totalBonus = totalBonus + bonus[i];
            totalOldSalary = totalOldSalary + salary[i];
            totalNewSalary = totalNewSalary + newSalary[i];
        }

        // Display the total bonus payout and the total salaries
        System.out.println("Total Bonus Payout " + totalBonus);
        System.out.println("Total Old Salary " + totalOldSalary);
        System.out.println("Total New Salary " + totalNewSalary);
    }
}
