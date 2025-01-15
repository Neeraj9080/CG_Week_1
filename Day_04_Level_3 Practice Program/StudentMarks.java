import java.util.Random;
import java.util.Scanner;

//creating a class StudentMarks to calculate students scores
class StudentMarks 
{

    // Method to generate random scores for Physics, Chemistry, and Maths for students
    public static int[][] generateScores(int numStudents) 
	{
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Maths
        
        // Generate random scores between 0 and 99 for each student
        for (int i = 0; i < numStudents; i++) 
		{
            scores[i][0] = rand.nextInt(100); // Physics
            scores[i][1] = rand.nextInt(100); // Chemistry
            scores[i][2] = rand.nextInt(100); // Maths
        }
        return scores;
    }

    // Method to calculate the total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) 
	{
        double[][] results = new double[scores.length][4]; // total, average, percentage

        for (int i = 0; i < scores.length; i++) 
		{
            int total = scores[i][0] + scores[i][1] + scores[i][2]; // Total marks
            double average = total / 3.0; // Average
            double percentage = (total / 300.0) * 100; // Percentage
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0; // Rounded to 2 decimal places
            results[i][2] = Math.round(percentage * 100.0) / 100.0; // Rounded to 2 decimal places
        }
        return results;
    }

    // Method to display the scorecard of all students in a tabular format
    public static void displayScoreCard(int[][] scores, double[][] results) 
	{
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) 
		{
            System.out.printf("%d\t%d\t\t%d\t\t%d\t%d\t%.2f\t%.2f%%\n", 
                i + 1, 
                scores[i][0], 
                scores[i][1], 
                scores[i][2], 
                (int) results[i][0], 
                results[i][1], 
                results[i][2]);
        }
    }

    // Main method to input number of students and display results
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        // Generate random scores for the students
        int[][] scores = generateScores(numStudents);
        
        // Calculate total, average, and percentage for each student
        double[][] results = calculateResults(scores);
        
        // Display the scorecard
        displayScoreCard(scores, results);

    }
}
