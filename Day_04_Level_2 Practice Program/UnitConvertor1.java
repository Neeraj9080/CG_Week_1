//Creating a UnitConvertor1 class to perform unit conversions
class UnitConvertor1
{
    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km)
    {
        // Conversion factor from kilometers to miles
        double km2miles = 0.621371;
        return km * km2miles; // Return the converted value
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles)
    {
        // Conversion factor from miles to kilometers
        double miles2km = 1.60934;
        return miles * miles2km; // Return the converted value
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters)
    {
        // Conversion factor from meters to feet
        double meters2feet = 3.28084;
        return meters * meters2feet; // Return the converted value
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet)
    {
        // Conversion factor from feet to meters
        double feet2meters = 0.3048;
        return feet * feet2meters; // Return the converted value
    }

    // Main method to test the conversion methods
    public static void main(String[] args)
    {
        // Testing the conversion methods
        double km = 11; // Example value for kilometers
        double miles = convertKmToMiles(km); // Convert kilometers to miles
        System.out.println(km + " kilometers is equal to " + miles + " miles.");
        
        double milesInput = 6.21; // Example value for miles
        double kmConverted = convertMilesToKm(milesInput); // Convert miles to kilometers
        System.out.println(milesInput + " miles is equal to " + kmConverted + " kilometers.");
        
        double meters = 98; // Example value for meters
        double feet = convertMetersToFeet(meters); // Convert meters to feet
        System.out.println(meters + " meters is equal to " + feet + " feet.");
        
        double feetInput = 123; // Example value for feet
        double metersConverted = convertFeetToMeters(feetInput); // Convert feet to meters
        System.out.println(feetInput + " feet is equal to " + metersConverted + " meters.");
    }
}
