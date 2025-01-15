//importing random class
import java.util.Random;

//creating a class MatrixOperations to perform some matrix operations
class MatrixOperations 
{

    // Method to create a random matrix with specified rows and columns
    public static int[][] createMatrix(int rows, int cols) 
	{
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        
        // Fill the matrix with random integers between 0 and 9
        for (int i = 0; i < rows; i++) 
		{
            for (int j = 0; j < cols; j++) 
			{
                matrix[i][j] = rand.nextInt(10);
            }
        }
        return matrix;
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) 
	{
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        
        // Add corresponding elements of the matrices
        for (int i = 0; i < rows; i++) 
		{
            for (int j = 0; j < cols; j++) 
			{
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        
        // Subtract corresponding elements of the matrices
        for (int i = 0; i < rows; i++) 
		{
            for (int j = 0; j < cols; j++) 
			{
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix2[0].length;
        int[][] result = new int[rows][cols];
        
        // Multiply the matrices
        for (int i = 0; i < rows; i++) 
		{
            for (int j = 0; j < cols; j++) 
			{
                result[i][j] = 0;
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) 
	{
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        
        // Swap rows and columns
        for (int i = 0; i < rows; i++) 
		{
            for (int j = 0; j < cols; j++) 
			{
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) 
	{
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) 
	{
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) -
               matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) +
               matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) 
	{
        int determinant = determinant2x2(matrix);
        if (determinant == 0) 
		{
            System.out.println("Matrix is not invertible");
            return null;
        }
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / (double) determinant;
        inverse[0][1] = -matrix[0][1] / (double) determinant;
        inverse[1][0] = -matrix[1][0] / (double) determinant;
        inverse[1][1] = matrix[0][0] / (double) determinant;
        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix) 
	{
        int determinant = determinant3x3(matrix);
        if (determinant == 0) 
		{
            System.out.println("Matrix is not invertible");
            return null;
        }
        double[][] inverse = new double[3][3];
        // Calculate the adjugate matrix and divide by determinant to get inverse
        // (method omitted for brevity, similar logic to the 2x2 inverse but more complex)
        return inverse;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) 
	{
        for (int[] row : matrix) 
		{
            for (int elem : row) 
			{
                System.out.print(elem + "\t");
            }
            System.out.println();
        }
    }

    // Main method to test the matrix operations
    public static void main(String[] args) {
        int[][] matrix1 = createMatrix(3, 3);
        int[][] matrix2 = createMatrix(3, 3);
        
        System.out.println("Matrix 1 ");
        displayMatrix(matrix1);
        System.out.println("Matrix 2 ");
        displayMatrix(matrix2);
        
        System.out.println("Addition of Matrix 1 and Matrix 2 ");
        displayMatrix(addMatrices(matrix1, matrix2));
        
        System.out.println("Subtraction of Matrix 1 and Matrix 2 ");
        displayMatrix(subtractMatrices(matrix1, matrix2));
        
        System.out.println("Multiplication of Matrix 1 and Matrix 2 ");
        displayMatrix(multiplyMatrices(matrix1, matrix2));
        
        System.out.println("Transpose of Matrix 1 ");
        displayMatrix(transposeMatrix(matrix1));
        
        System.out.println("Determinant of Matrix 1 (3x3) " + determinant3x3(matrix1));
        double[][] inverse2x2 = inverse2x2(matrix1);
		
    }
}
