//importing random class
import java.util.Random;

//creating a class EmployeeBonus to calculate bonuses of employee
class EmployeeBonus 
{

    // Method to generate random salary and years of service for 10 employees
    public static double[][] generateEmployeeData(int numEmployees) 
	{
        Random random = new Random();
        double[][] employeeData = new double[numEmployees][2]; // [][0] for salary, [][1] for years of service
        
        for (int i = 0; i < numEmployees; i++) 
		{
            double salary = 10000 + (random.nextDouble() * 90000); // Generate salary between 10,000 to 100,000
            double yearsOfService = 1 + (random.nextInt(20)); // Generate years of service between 1 and 20
            employeeData[i][0] = salary;
            employeeData[i][1] = yearsOfService;
        }
        
        return employeeData;
    }

    // Method to calculate the new salary and bonus based on the years of service
    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) 
	{
        double[][] updatedData = new double[employeeData.length][3]; // [][0] for old salary, [][1] for bonus, [][2] for new salary

        for (int i = 0; i < employeeData.length; i++) 
		{
            double salary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus;

            // Determine bonus based on years of service
            if (yearsOfService > 5) 
			{
                bonus = salary * 0.05; // 5% bonus for employees with more than 5 years of service
            } 
			else 
			{
                bonus = salary * 0.02; // 2% bonus for employees with 5 years or less of service
            }
            
            double newSalary = salary + bonus;

            updatedData[i][0] = salary; // Old salary
            updatedData[i][1] = bonus;  // Bonus amount
            updatedData[i][2] = newSalary; // New salary
        }
        
        return updatedData;
    }

    // Method to calculate the sum of the old salaries, new salaries, and total bonus
    public static void calculateSalariesAndBonuses(double[][] updatedData) 
	{
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
        
        // Calculate total salaries and bonuses
        for (int i = 0; i < updatedData.length; i++) 
		{
            totalOldSalary += updatedData[i][0];
            totalNewSalary += updatedData[i][2];
            totalBonus += updatedData[i][1];
        }

        // Display the results in tabular format
        System.out.println("Old Salary | Bonus | New Salary");
        for (int i = 0; i < updatedData.length; i++) 
		{
            System.out.printf("%.2f | %.2f | %.2f\n", updatedData[i][0], updatedData[i][1], updatedData[i][2]);
        }

        System.out.println("\nTotal Old Salary " + totalOldSalary);
        System.out.println("Total New Salary " + totalNewSalary);
        System.out.println("Total Bonus " + totalBonus);
    }

    // Main method to run the program
    public static void main(String[] args) 
	{
        int numEmployees = 10;
        
        // Generate employee data
        double[][] employeeData = generateEmployeeData(numEmployees);
        
        // Calculate bonus and new salary for each employee
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        
        // Calculate and display the total salaries and bonuses
        calculateSalariesAndBonuses(updatedData);
    }
}
