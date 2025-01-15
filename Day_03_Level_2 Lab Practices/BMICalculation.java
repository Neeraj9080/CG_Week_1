// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class to calculate BMI for multiple persons
class BMICalculation
{
    public static void main(String[] args)
    {
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Take the number of persons as input
        System.out.println("Enter number of persons: ");
        int number = input.nextInt();

        // Declare arrays to store weight, height, BMI, and weight status
        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] weightStatus = new String[number];

        // Loop to take input for weight and height of each person
        for (int i = 0; i < number; i++) 
        {
            System.out.println("Enter weight of person " + (i + 1) + " ");
            weight[i] = input.nextDouble();
            
            System.out.println("Enter height of person " + (i + 1) + " ");
            height[i] = input.nextDouble();

            // Calculate BMI for each person
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Determine weight status based on BMI
            if (bmi[i] <= 18.4) 
            {
                weightStatus[i] = "Underweight";
            } 
            else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) 
            {
                weightStatus[i] = "Normal";
            } 
            else if (bmi[i] >= 25.0 && bmi[i] <= 39.9) 
            {
                weightStatus[i] = "Overweight";
            } 
            else 
            {
                weightStatus[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and weight status of each person
        for (int i = 0; i < number; i++) 
        {
            System.out.println("Person " + (i + 1) + ": Height = " + height[i] + ", Weight = " + weight[i] + 
                               ", BMI = " + bmi[i] + ", Status = " + weightStatus[i]);
        }
    }
}
