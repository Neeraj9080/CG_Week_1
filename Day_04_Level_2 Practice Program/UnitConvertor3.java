//Creating a UnitConvertor3 class to perform unit conversions
class UnitConvertor3
{
    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit)
    {
        // Conversion factor from Fahrenheit to Celsius
        double fahrenheit2celsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheit2celsius; // Return the converted value
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius)
    {
        // Conversion factor from Celsius to Fahrenheit
        double celsius2fahrenheit = (celsius * 9 / 5) + 32;
        return celsius2fahrenheit; // Return the converted value
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds)
    {
        // Conversion factor from pounds to kilograms
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms; // Return the converted value
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms)
    {
        // Conversion factor from kilograms to pounds
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds; // Return the converted value
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons)
    {
        // Conversion factor from gallons to liters
        double gallons2liters = 3.78541;
        return gallons * gallons2liters; // Return the converted value
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters)
    {
        // Conversion factor from liters to gallons
        double liters2gallons = 0.264172;
        return liters * liters2gallons; // Return the converted value
    }

    // Main method to test the conversion methods
    public static void main(String[] args)
    {
        // Testing the conversion methods
        
        // Convert Fahrenheit to Celsius
        double fahrenheit = 94.1; // Example value for Fahrenheit
        double celsius = convertFahrenheitToCelsius(fahrenheit); // Convert Fahrenheit to Celsius
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C.");
        
        // Convert Celsius to Fahrenheit
        double celsiusInput = 46; // Example value for Celsius
        double fahrenheitConverted = convertCelsiusToFahrenheit(celsiusInput); // Convert Celsius to Fahrenheit
        System.out.println(celsiusInput + "°C is equal to " + fahrenheitConverted + "°F.");
        
        // Convert pounds to kilograms
        double pounds = 135; // Example value for pounds
        double kilograms = convertPoundsToKilograms(pounds); // Convert pounds to kilograms
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms.");
        
        // Convert kilograms to pounds
        double kilogramsInput = 59; // Example value for kilograms
        double poundsConverted = convertKilogramsToPounds(kilogramsInput); // Convert kilograms to pounds
        System.out.println(kilogramsInput + " kilograms is equal to " + poundsConverted + " pounds.");
        
        // Convert gallons to liters
        double gallons = 7; // Example value for gallons
        double liters = convertGallonsToLiters(gallons); // Convert gallons to liters
        System.out.println(gallons + " gallons is equal to " + liters + " liters.");
        
        // Convert liters to gallons
        double litersInput = 23; // Example value for liters
        double gallonsConverted = convertLitersToGallons(litersInput); // Convert liters to gallons
        System.out.println(litersInput + " liters is equal to " + gallonsConverted + " gallons.");
    }
}
