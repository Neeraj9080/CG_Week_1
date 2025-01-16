// Importing Scanner class for user input
import java.util.Scanner;

// Importing Random class for random number
import java.util.Random;

// Creating a class to handle student scores, percentage, and grade calculation
class StudentScoreCard
{
    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateRandomScores(int numberOfStudents)
    {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3]; // 2D array for PCM scores

        for (int i = 0; i < numberOfStudents; i++)
        {
            // Generating random scores between 0 and 100 for each subject
            scores[i][0] = random.nextInt(101); // Physics score
            scores[i][1] = random.nextInt(101); // Chemistry score
            scores[i][2] = random.nextInt(101); // Math score
        }

        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateTotalAveragePercentage(int[][] scores)
    {
        double[][] results = new double[scores.length][4]; // 2D array for total, average, percentage

        for (int i = 0; i < scores.length; i++)
        {
            // Calculate total score
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            // Calculate average score
            double average = total / 3.0;
            // Calculate percentage (out of 300)
            double percentage = (total / 3.0);

            // Storing total, average, and percentage values
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
            results[i][3] = Math.round(percentage * 100.0) / 100.0; // Rounding to 2 decimals
        }

        return results;
    }

    // Method to calculate grade based on percentage
    public static String[][] calculateGrades(double[][] results)
    {
        String[][] grades = new String[results.length][1]; // 2D array for grades

        for (int i = 0; i < results.length; i++)
        {
            double percentage = results[i][3];

            // Assigning grade based on percentage
            if (percentage >= 80)
                grades[i][0] = "A";
				
            else if (percentage >= 70 && percentage <= 79)
                grades[i][0] = "B";
				
            else if (percentage >= 60 && percentage <= 69)
                grades[i][0] = "C";
				
            else if (percentage >= 50 && percentage <= 59)
                grades[i][0] = "D";
			
            else if (percentage >= 40 && percentage <= 49)
                grades[i][0] = "E";
				
            else
                grades[i][0] = "R";
        }

        return grades;
    }

    // Method to display the scorecard of all students with their scores, total, average, percentage, and grade in a tabular format
    public static void displayScorecard(int[][] scores, double[][] results, String[][] grades)
    {
        // Printing the header of the table
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "Student", "Physics", "Chemistry", "Math", "Total", "Percentage", "Grade");

        // Looping through all students and displaying their scores, total, percentage, and grade
        for (int i = 0; i < scores.length; i++)
        {
            System.out.printf("%-10s %-10d %-10d %-10d %-10.2f %-10.2f %-10s\n", 
                "Student " + (i + 1), 
                scores[i][0], scores[i][1], scores[i][2], 
                results[i][0], results[i][3], 
                grades[i][0]);
        }
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Taking user input for number of students
        System.out.println("Enter the number of students");
        int numberOfStudents = input.nextInt();

        // Generating random scores for the students
        int[][] scores = generateRandomScores(numberOfStudents);

        // Calculating total, average, and percentage for each student
        double[][] results = calculateTotalAveragePercentage(scores);

        // Calculating grade for each student
        String[][] grades = calculateGrades(results);

        // Displaying the final scorecard
        displayScorecard(scores, results, grades);
    }
}
