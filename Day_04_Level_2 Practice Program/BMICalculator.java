//import Scanner class for user input
import java.util.Scanner;

//Creating a class BMICalculator to calculate BMI for 10 team members
class BMICalculator
{
    // Method to calculate BMI based on weight (kg) and height (cm)
    public static double calculateBMI(double weight, double height)
    {
        height = height / 100; // Convert height from cm to meters
        return weight / (height * height);
    }

    // Method to determine the BMI status based on BMI value
    public static String determineStatus(double bmi)
    {
        if (bmi <= 18.4) 
		{
            return "Underweight";
        } 
		else if (bmi >= 18.5 && bmi <= 24.9) 
		{
            return "Normal weight";
        } 
		else if (bmi >= 25 && bmi <= 39.9) 
		{
            return "Overweight";
        } 
		else 
		{
            return "Obesity";
        }
    }

    public static void main(String[] args)
    {
        // Create an object of Scanner class for user input
        Scanner input = new Scanner(System.in);
        
        // Create a 2D array to store weight, height, and BMI for 10 people
        double[][] bmiData = new double[10][3];
        
        // Take input for weight and height of each person
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) of person " + (i + 1) + ": ");
            bmiData[i][0] = input.nextDouble();
            System.out.println("Enter height (cm) of person " + (i + 1) + ": ");
            bmiData[i][1] = input.nextDouble();
            
            // Calculate BMI and store it in the third column
            bmiData[i][2] = calculateBMI(bmiData[i][0], bmiData[i][1]);
        }
        
        // Display the BMI and status for each person
        for (int i = 0; i < 10; i++) 
		{
            System.out.println("Person " + (i + 1) + " Weight = " + bmiData[i][0] + " kg, Height = " + bmiData[i][1] + " cm, BMI = " + bmiData[i][2] + ", Status = " + determineStatus(bmiData[i][2]));
        }
    }
}
