import java.util.Random;

// Creating a class FootballTeam to perform height-related calculations
class FootballTeam 
{

    // Method to find the sum of heights in the array
    public static int findSum(int[] heights) 
	{
        int sum = 0;
        // Loop through the array and calculate the sum of heights
        for (int height : heights) 
		{
            sum = sum + height;
        }
        return sum;
    }

    // Method to find the mean height of the players
    public static double findMeanHeight(int[] heights) 
	{
        // Call findSum() to get the total sum of heights
        int sum = findSum(heights);
		
        // Calculate and return the mean height
        return (double) sum / heights.length;
    }

    // Method to find the shortest height in the array
    public static int findShortestHeight(int[] heights) 
	{
        int min = heights[0];
        // Loop through the array and find the minimum height
        for (int height : heights) 
		{
            if (height < min) 
			{
                min = height;
            }
        }
        return min;
    }

    // Method to find the tallest height in the array
    public static int findTallestHeight(int[] heights) 
	{
        int max = heights[0];
        // Loop through the array and find the maximum height
        for (int height : heights) 
		{
            if (height > max) 
			{
                max = height;
            }
        }
        return max;
    }

    // Main method to generate random heights and display results
    public static void main(String[] args) 
	{
        Random rand = new Random();
        int[] heights = new int[11]; // Array for 11 players' heights

        // Generate random heights between 150 cm and 250 cm for 11 players
        for (int i = 0; i < 11; i++) 
		{
            heights[i] = rand.nextInt(101) + 150; // Random height between 150 and 250
        }

        // Display shortest, tallest, and mean height of players
        System.out.println("Shortest Height: " + findShortestHeight(heights) + " cm");
        System.out.println("Tallest Height: " + findTallestHeight(heights) + " cm");
        System.out.println("Mean Height: " + findMeanHeight(heights) + " cm");
    }
}
