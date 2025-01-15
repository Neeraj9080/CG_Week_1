//import Scanner class for user input
import java.util.Scanner;

//Creating a class QuadraticEquationSolver to find the roots of a quadratic equation
class QuadraticEquationSolver
{
    // Method to find the roots of the quadratic equation ax^2 + bx + c = 0
    public static double[] findRoots(double a, double b, double c)
    {
        double delta = Math.pow(b, 2) - 4 * a * c; // Calculate discriminant (delta)
        
        // If delta is positive, find two roots
        if (delta > 0) 
		{
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[] {root1, root2};
        }
        // If delta is zero, find one root
        else if (delta == 0) 
		{
            double root = -b / (2 * a);
            return new double[] {root};
        }
        // If delta is negative, return an empty array (no real roots)
        else 
		{
            return new double[] {};
        }
    }

    public static void main(String[] args)
    {
        // Create an object of Scanner class for user input
        Scanner input = new Scanner(System.in);
        
        // Get user input for a, b, and c
        System.out.println("Enter the value of a ");
        double a = input.nextDouble();
        System.out.println("Enter the value of b ");
        double b = input.nextDouble();
        System.out.println("Enter the value of c ");
        double c = input.nextDouble();
        
        // Find and display the roots
        double[] roots = findRoots(a, b, c);
        
        if (roots.length == 0) 
		{
            System.out.println("The equation has no real roots");
        } 
		else 
		{
            System.out.println("The roots of the equation are ");
            for (double root : roots) 
			{
                System.out.println(root);
            }
        }
    }
}
