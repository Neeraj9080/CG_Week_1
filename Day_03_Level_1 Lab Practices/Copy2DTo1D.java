// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class to work with multi-dimensional arrays and copy into a 1D array
class Copy2DTo1D
{
    public static void main(String[] args)
    {
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the number of rows and columns
        System.out.println("Enter the number of rows ");
        int rows = input.nextInt();
        System.out.println("Enter the number of columns ");
        int columns = input.nextInt();
        
        // Create a 2D array (matrix) with given rows and columns
        int[][] matrix = new int[rows][columns];
        
        // Prompt the user to enter the elements of the matrix
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < rows; i++) 
		{
            for (int j = 0; j < columns; j++) 
			{
                matrix[i][j] = input.nextInt();
            }
        }
        
        // Create a 1D array to store the elements of the 2D array
        int[] array = new int[rows * columns];
        
        // Index variable for the 1D array
        int index = 0;
        
        // Loop through the 2D array and copy elements to the 1D array
        for (int i = 0; i < rows; i++) 
		{
            for (int j = 0; j < columns; j++) 
			{
                array[index++] = matrix[i][j];
            }
        }
        
        // Display the 1D array
        System.out.println("The elements in the 1D array ");
        for (int i = 0; i < array.length; i++) 
		{
            System.out.print(array[i] + " ");
        }
    }
}
