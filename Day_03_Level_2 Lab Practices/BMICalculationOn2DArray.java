// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class to calculate BMI for multiple persons using a multi-dimensional array
class BMICalculationOn2DArray
{
    public static void main(String[] args)
    {
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);

        // Take the number of persons as input
        System.out.println("Enter number of persons ");
        int number = input.nextInt();

        // Create a 2D array to store weight, height, and BMI for each person
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Loop to take input for weight and height of each person
        for (int i = 0; i < number; i++) 
        {
            // Take input for weight and height of the person
            System.out.println("Enter weight of person " + (i + 1) + " ");
            personData[i][0] = input.nextDouble();

            // Ensure weight is a positive value
            while (personData[i][0] <= 0) 
			{
                System.out.println("Please enter a valid positive weight for person " + (i + 1) + ": ");
                personData[i][0] = input.nextDouble();
            }

            System.out.println("Enter height of person " + (i + 1) + " ");
            personData[i][1] = input.nextDouble();

            // Ensure height is a positive value
            while (personData[i][1] <= 0) 
			{
                System.out.println("Please enter a valid positive height for person " + (i + 1) + " ");
                personData[i][1] = input.nextDouble();
            }

            // Calculate BMI for each person and store in personData array
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            // Determine weight status based on BMI
            if (personData[i][2] <= 18.4) 
            {
                weightStatus[i] = "Underweight";
            } 
            else if (personData[i][2] >= 18.5 && personData[i][2] <= 24.9) 
            {
                weightStatus[i] = "Normal";
            } 
            else if (personData[i][2] >= 25.0 && personData[i][2] <= 39.9) 
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
            System.out.println("Person " + (i + 1) + ": Height = " + personData[i][1] + ", Weight = " + personData[i][0] + 
                               ", BMI = " + personData[i][2] + ", Status = " + weightStatus[i]);
        }
    }
}
