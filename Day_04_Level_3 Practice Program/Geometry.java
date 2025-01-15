//importing Scanner class
import java.util.Scanner;

// creating a class Geometry to perform some geometery operation 
class Geometry 
{

    // Method to find the Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) 
	{
        // Formula for Euclidean distance: sqrt((x2 - x1)^2 + (y2 - y1)^2)
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find the equation of the line given two points
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) 
	{
        // Calculate the slope (m) using the formula: m = (y2 - y1) / (x2 - x1)
        double m = (y2 - y1) / (x2 - x1);
        
        // Calculate the y-intercept (b) using the formula: b = y1 - m * x1
        double b = y1 - m * x1;
        
        // Return an array with slope (m) and y-intercept (b)
        return new double[]{m, b};
    }

    // Main method to input points and display results
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        
        // Take inputs for two points (x1, y1) and (x2, y2)
        System.out.print("Enter x1, y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        
        System.out.print("Enter x2, y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        // Calculate Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);
        
        // Find equation of the line
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of the line: y = " + lineEquation[0] + "x + " + lineEquation[1]);

    }
}
