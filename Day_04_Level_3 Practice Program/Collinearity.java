// creating a class Collinearity to check given point are collinear or not
class Collinearity 
{

    // Method to find the slope between two points
    public static double findSlope(double x1, double y1, double x2, double y2) 
	{
        return (y2 - y1) / (x2 - x1);
    }

    // Method to check if 3 points are collinear using the slope method
    public static boolean arePointsCollinear(double x1, double y1, double x2, double y2, double x3, double y3) 
	{
        double slopeAB = findSlope(x1, y1, x2, y2);
        double slopeBC = findSlope(x2, y2, x3, y3);
        double slopeAC = findSlope(x1, y1, x3, y3);

        // Check if all slopes are equal
        return (slopeAB == slopeBC && slopeAB == slopeAC);
    }

    // Method to check if 3 points are collinear using the area method
    public static boolean arePointsCollinearArea(double x1, double y1, double x2, double y2, double x3, double y3) 
	{
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0; // Area will be 0 for collinear points
    }

    // Main method to input 3 points and check for collinearity
    public static void main(String[] args) 
	{
        double x1 = 2, y1 = 4, x2 = 4, y2 = 6, x3 = 6, y3 = 8;
        
        // Check if points are collinear using slope method
        boolean collinearBySlope = arePointsCollinear(x1, y1, x2, y2, x3, y3);
        System.out.println("Points are collinear by slope method: " + collinearBySlope);
        
        // Check if points are collinear using area method
        boolean collinearByArea = arePointsCollinearArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Points are collinear by area method: " + collinearByArea);
    }
}
