//import Scanner class for the user input 
import java.util.Scanner;

//Creating a class WindChill to calculate the wind chill temperature
class WindChill
{
    // creating a method calculateWindChill of double type to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed)
    {
        // Using the given formula for wind chill temperature
        return (35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16));
    }
    
    public static void main(String args[])
    {
        // create an object of Scanner class named as input to take input from the user
        Scanner input = new Scanner(System.in);
        
        // create a variable temperature to store the temperature input by the user
        double temperature;
        
        // Displaying a message to take input for temperature
        System.out.println("Enter the temperature (in Fahrenheit): ");
        temperature = input.nextDouble();
        
        // create a variable windSpeed to store the wind speed input by the user
        double windSpeed;
        
        // Displaying a message to take input for wind speed
        System.out.println("Enter the wind speed (in miles per hour): ");
        windSpeed = input.nextDouble();
        
        // Calling the method to calculate wind chill
        double windChill = calculateWindChill(temperature, windSpeed);
        
        // Printing the result
        System.out.println("The wind chill temperature is: " + windChill);
    }
}
