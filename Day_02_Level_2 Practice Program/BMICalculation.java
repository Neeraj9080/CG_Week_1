//Importing Scanner class to take user input
import java.util.Scanner;

//Creating a class BMICalculation to calculate BMI
class BMICalculation {
    public static void main(String[] args) 
	{
        // Create a Scanner class object to take input from the user
        Scanner sc = new Scanner(System.in);

        // create two variables to store weight and height
        double weight, height;

        // Displaying the message to the user
        System.out.print("Enter weight in kg ");
        weight = sc.nextDouble();

        // Displaying the message to the user
        System.out.print("Enter height in cm ");
        height = sc.nextDouble();

        // Converting height from cm to meters
        height = height / 100;

        // create a variable bmi to calculate BMI 
        double bmi = weight / (height * height);
		String weightStatus = "";

        if (bmi < 18.4) 
		{
            weightStatus = "Underweight";
        } 
		else if (bmi >= 18.5 && bmi <= 24.9) 
		{
            weightStatus = "Normal weight";
        } 
		else if (bmi >= 25 && bmi <= 39.9) 
		{
            weightStatus = "Overweight";
        } 
		else 
		{
            weightStatus = "Obese";
        }

        // Displaying weight status
        System.out.println("Weight status " + weightStatus);
    }
}
