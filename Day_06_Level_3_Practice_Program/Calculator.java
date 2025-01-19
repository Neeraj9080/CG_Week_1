// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class Calculator to perform basic arithmetic operations
class Calculator 
{
    // Method addition to perform addition operation 
    public static double addition(double number1, double number2)
	{
	    return (number1 + number2);
	}
	
	// Method subtraction to perform subtraction operation
	public static double subtraction(double number1, double number2)
	{
	    return (number1 - number2);
	}
	
	// Method multiplication to perform multiplication operation
	public static double multiplication(double number1, double number2)
	{
	    return (number1 * number2);
	}
	
	// Method division to perform division operation
	public static double division(double number1, double number2)
	{
        return (number1 / number2);
	}

    public static void main(String[] args) 
	{
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);

        // Displaying a message to the user to enter the first number, second number, and operator
        System.out.println("Enter the first number ");
        double number1 = input.nextDouble();
        System.out.println("Enter the second number ");
        double number2 = input.nextDouble();
        System.out.println("Enter the operator (+, -, *, /) ");
        char op = input.next().charAt(0);

        // Perform the operation based on the operator using a switch statement
        switch (op) 
		{
            case '+':
                System.out.println("Addition is " + addition(number1,number2) );
                break;
            case '-':
                System.out.println("Subtraction is " + subtraction(number1,number2));
                break;
            case '*':
                System.out.println("Multip is " + multiplication(number1,number2));
                break;
            case '/':
                if (number2 != 0) 
	            {
                    System.out.println("Result is " + division(number1,number2));
                } 
		        else 
		        {
                   System.out.println("Error, Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
