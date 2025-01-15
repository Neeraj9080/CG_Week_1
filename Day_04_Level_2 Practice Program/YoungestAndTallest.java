//import Scanner class for user input
import java.util.Scanner;

//Creating a class YoungestAndTallest to find the youngest and tallest friends
class YoungestAndTallest
{
    // Method to find the youngest friend
    public static String findYoungest(int[] ages)
    {
        int youngestAge = ages[0];
        String youngestFriend = "Amar";
        
        if (ages[1] < youngestAge) 
		{
            youngestAge = ages[1];
            youngestFriend = "Akbar";
        }
        
        if (ages[2] < youngestAge) 
		{
            youngestAge = ages[2];
            youngestFriend = "Anthony";
        }
        
        return youngestFriend;
    }

    // Method to find the tallest friend
    public static String findTallest(double[] heights)
    {
        double tallestHeight = heights[0];
        String tallestFriend = "Amar";
        
        if (heights[1] > tallestHeight) 
		{
            tallestHeight = heights[1];
            tallestFriend = "Akbar";
        }
        
        if (heights[2] > tallestHeight) 
		{
            tallestHeight = heights[2];
            tallestFriend = "Anthony";
        }
        
        return tallestFriend;
    }

    public static void main(String[] args)
    {
        // Create an object of Scanner class for user input
        Scanner input = new Scanner(System.in);
        
        // Create arrays to store the ages and heights of 3 friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        // Take user input for the ages and heights
        for (int i = 0; i < 3; i++) 
		{
            System.out.println("Enter age of friend " + (i + 1) + ": ");
            ages[i] = input.nextInt();
			
            System.out.println("Enter height of friend " + (i + 1) + " (in cm): ");
            heights[i] = input.nextDouble();
        }
        
        // Find and display the youngest and tallest friends
        System.out.println("The youngest friend is: " + findYoungest(ages));
        System.out.println("The tallest friend is: " + findTallest(heights));
    }
}
