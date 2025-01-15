//import Scanner class for user input
import java.util.Random;

//Creating a class RandomNumberGenerator to generate random 4-digit numbers and find average, min, and max
class RandomNumberGenerator
{
    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size)
    {
        Random random = new Random();
        int[] numbers = new int[size];
        
        for (int i = 0; i < size; i++) 
		{
            numbers[i] = random.nextInt(9000) + 1000; // Generate 4-digit number
        }
        return numbers;
    }

    // Method to find average, min, and max values of the array
    public static double[] findAverageMinMax(int[] numbers)
    {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        
        for (int number : numbers) 
		{
            sum = sum + number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }
        
        double average = sum / numbers.length;
        return new double[] {average, min, max};
    }

    public static void main(String[] args)
    {
        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);
        
        // Find and display the average, min, and max values
        double[] results = findAverageMinMax(randomNumbers);
        System.out.println("Average " + results[0]);
        System.out.println("Minimum " + results[1]);
        System.out.println("Maximum " + results[2]);
    }
}
