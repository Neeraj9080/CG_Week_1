//import Scanner class for the user input 
import java.util.Scanner;

//Creating a class TrigonometricFunctions to calculate various trigonometric functions
class TrigonometricFunctions
{
    // creating a method calculateTrigonometricFunctions of double array type to calculate sin, cos, tan
    public static double[] calculateTrigonometricFunctions(double angle)
    {
        // converting angle from degrees to radians
        double radians = Math.toRadians(angle);
        
        // calculating sine, cosine, and tangent of the angle
        double[] results = new double[3];
        results[0] = Math.sin(radians);   // sine
        results[1] = Math.cos(radians);   // cosine
        results[2] = Math.tan(radians);   // tangent
        
        return results;
    }
    
    public static void main(String args[])
    {
        // create an object of Scanner class named as input to take input from the user
        Scanner input = new Scanner(System.in);
        
        // create a variable angle to store the angle input by the user
        double angle;
        
        // Displaying a message to take input for angle
        System.out.println("Enter the angle in degrees: ");
        angle = input.nextDouble();
        
        // Calling the method to calculate trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);
        
        // Printing the results for sine, cosine, and tangent
        System.out.println("The sine of " + angle + "° is " + results[0]);
        System.out.println("The cosine of " + angle + "° is " + results[1]);
        System.out.println("The tangent of " + angle + "° is " + results[2]);
    }
}
