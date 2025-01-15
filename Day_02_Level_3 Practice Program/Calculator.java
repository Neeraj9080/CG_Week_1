// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class Calculator to perform basic arithmetic operations
class Calculator 
{
    public static void main(String[] args) 
	{
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);

        // Displaying a message to the user to enter the first number, second number, and operator
        System.out.println("Enter the first number ");
        double first = input.nextDouble();
        System.out.println("Enter the second number ");
        double second = input.nextDouble();
        System.out.println("Enter the operator (+, -, *, /) ");
        char op = input.next().charAt(0);

        // Perform the operation based on the operator using a switch statement
        switch (op) 
		{
            case '+':
                System.out.println("Result " + (first + second));
                break;
            case '-':
                System.out.println("Result " + (first - second));
                break;
            case '*':
                System.out.println("Result " + (first * second));
                break;
            case '/':
                if (second != 0) 
				{
                    System.out.println("Result " + (first / second));
                } else 
				{
                    System.out.println("Error, Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
