//Creating a UnitConvertor2 class to perform unit conversions
class UnitConvertor2
{
    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards)
    {
        // Conversion factor from yards to feet
        double yards2feet = 3;
        return yards * yards2feet; // Return the converted value
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet)
    {
        // Conversion factor from feet to yards
        double feet2yards = 0.333333;
        return feet * feet2yards; // Return the converted value
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters)
    {
        // Conversion factor from meters to inches
        double meters2inches = 39.3701;
        return meters * meters2inches; // Return the converted value
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches)
    {
        // Conversion factor from inches to meters
        double inches2meters = 0.0254;
        return inches * inches2meters; // Return the converted value
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches)
    {
        // Conversion factor from inches to centimeters
        double inches2cm = 2.54;
        return inches * inches2cm; // Return the converted value
    }

    // Main method to test the conversion methods
    public static void main(String[] args)
    {
        // Testing the conversion methods

        // Convert yards to feet
        double yards = 9; // Example value for yards
        double feet = convertYardsToFeet(yards); // Convert yards to feet
        System.out.println(yards + " yards is equal to " + feet + " feet.");
        
        // Convert feet to yards
        double feetInput = 13; // Example value for feet
        double yardsConverted = convertFeetToYards(feetInput); // Convert feet to yards
        System.out.println(feetInput + " feet is equal to " + yardsConverted + " yards.");
        
        // Convert meters to inches
        double meters = 19; // Example value for meters
        double inches = convertMetersToInches(meters); // Convert meters to inches
        System.out.println(meters + " meters is equal to " + inches + " inches.");
        
        // Convert inches to meters
        double inchesInput = 150; // Example value for inches
        double metersConverted = convertInchesToMeters(inchesInput); // Convert inches to meters
        System.out.println(inchesInput + " inches is equal to " + metersConverted + " meters.");
        
        // Convert inches to centimeters
        double inchesValue = 31; // Example value for inches
        double cmConverted = convertInchesToCentimeters(inchesValue); // Convert inches to centimeters
        System.out.println(inchesValue + " inches is equal to " + cmConverted + " centimeters.");
    }
}
