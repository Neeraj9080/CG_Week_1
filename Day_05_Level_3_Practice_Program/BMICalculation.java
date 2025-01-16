// Importing Scanner class for user input
import java.util.Scanner;

// creating a class BMICalculation to calculate body mass index of any person
class BMICalculation
{
    // Method to compute BMI and its status
    public static String[] computeBMI(double weight, double height)
    {
        // Convert height from cm to meters
        double heightInMeters = height / 100;

        // Calculate BMI using the formula: BMI = weight / (height^2)
        double bmi = weight / (heightInMeters * heightInMeters);

        // Determine the BMI status
        String status;
        if (bmi <= 18.4)
            status = "Underweight";
			
        else if (bmi >= 18.5 && bmi <= 24.9)
            status = "Normal weight";
			
        else if (bmi >= 25 && bmi <= 39.9)
            status = "Overweight";
			
        else
            status = "Obese";

        return new String[]{String.format("%.2f", bmi), status};
    }

    // Method to collect data and display BMI and status
    public static void calculateAndDisplayBMI(double[][] data)
    {
        // 2D array to store height, weight, BMI, and status
        String[][] result = new String[10][4];

        // Loop through each person
        for (int i = 0; i < 10; i++)
        {
            double weight = data[i][0]; // weight in kg
            double height = data[i][1]; // height in cm

            // Get BMI and status
            String[] bmiResult = computeBMI(weight, height);

            // Store results in 2D array
            result[i][0] = String.format("%.2f", height);
            result[i][1] = String.format("%.2f", weight);
            result[i][2] = bmiResult[0];
            result[i][3] = bmiResult[1];
        }

        // Display the results in tabular format
        System.out.printf("%-10s%-10s%-10s%-10s\n", "Height", "Weight", "BMI", "Status");
        for (int i = 0; i < 10; i++)
        {
            System.out.printf("%-10s%-10s%-10s%-10s\n", result[i][0], result[i][1], result[i][2], result[i][3]);
        }
    }

    // Main method to take inputs and execute BMI calculations
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double[][] data = new double[10][2];

        // Taking user input for 10 people's weight and height
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Enter weight (kg) and height (cm) for person " + (i + 1) + ":");
            data[i][0] = input.nextDouble(); // weight
            data[i][1] = input.nextDouble(); // height
        }

        // Calling the method to calculate and display BMI and status
        calculateAndDisplayBMI(data);
    }
}
