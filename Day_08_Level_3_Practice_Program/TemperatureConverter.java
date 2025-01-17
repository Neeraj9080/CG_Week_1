// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class TemperatureConverter to perform temperature conversions
class TemperatureConverter 
{
    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit)
	{
	    return (fahrenheit - 32) * 5 / 9;
	}
	
	// Method to convert Celsius to Fahrenheit
	public static double celsiusToFahrenheit(double celsius)
	{
	    return (celsius * 9 / 5) + 32;
	}

    // Main method
    public static void main(String[] args) 
	{
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);

        // Displaying a message to the user to choose conversion type
        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("Enter your choice (1 or 2) ");
        int choice = input.nextInt();

        // Variable to store temperature
        double temperature;

        // Switch statement to perform the conversion based on user choice
        switch (choice) 
		{
            case 1: // Fahrenheit to Celsius conversion
                System.out.println("Enter temperature in Fahrenheit ");
                temperature = input.nextDouble();
                double celsius = fahrenheitToCelsius(temperature);
                System.out.println("Temperature in Celsius " + celsius);
                break;
                
            case 2: // Celsius to Fahrenheit conversion
                System.out.println("Enter temperature in Celsius ");
                temperature = input.nextDouble();
                double fahrenheit = celsiusToFahrenheit(temperature);
                System.out.println("Temperature in Fahrenheit " + fahrenheit);
                break;

            default:
                System.out.println("Invalid choice. Please choose 1 or 2");
                break;
        }
    }
}
