// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class to find the youngest and tallest friend among 3 friends
class YoungestAndTallest
{
    public static void main(String[] args)
    {
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Declare arrays to store the age and height of the 3 friends
        int[] age = new int[3];
        double[] height = new double[3];

        // Loop to take input for age and height of the 3 friends
        for (int i = 0; i < 3; i++) 
        {
            System.out.println("Enter age of friend " + (i + 1) + ": ");
            age[i] = input.nextInt();
            
            System.out.println("Enter height of friend " + (i + 1) + ": ");
            height[i] = input.nextDouble();
        }

        // Find the youngest and tallest
        int youngestIndex = 0, tallestIndex = 0;

        for (int i = 1; i < 3; i++) 
        {
            if (age[i] < age[youngestIndex]) 
            {
                youngestIndex = i;
            }
            if (height[i] > height[tallestIndex]) 
            {
                tallestIndex = i;
            }
        }

        // Display the youngest and tallest friend
        System.out.println("The youngest friend is: Friend " + (youngestIndex + 1) + " with age " + age[youngestIndex]);
        System.out.println("The tallest friend is: Friend " + (tallestIndex + 1) + " with height " + height[tallestIndex]);
    }
}

