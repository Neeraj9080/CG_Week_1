// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class to calculate the percentage and grade of students
class StudentGradesOn2DArray
{
    public static void main(String[] args)
    {
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);
        
        // Asking for the number of students
        System.out.println("Enter the number of students ");
        int numStudents = input.nextInt();
        
        // Declare a 2D array to store marks of students in physics, chemistry, and maths
        int[][] marks = new int[numStudents][3]; // 3 subjects for each student
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];
        String[] remarks = new String[numStudents];

        // Loop to take input for marks in physics, chemistry, and maths for each student
        for (int i = 0; i < numStudents; i++) 
        {
            // Input for Physics marks with validation for negative values
            do 
			{
                System.out.println("Enter Physics marks for Student " + (i + 1) + " ");
                marks[i][0] = input.nextInt();
				
                if (marks[i][0] < 0) 
				{
                    System.out.println("Marks cannot be negative. Please enter valid marks");
                }
            } while (marks[i][0] < 0);

            // Input for Chemistry marks with validation for negative values
            do 
			{
                System.out.println("Enter Chemistry marks for Student " + (i + 1) + " ");
                marks[i][1] = input.nextInt();
				
                if (marks[i][1] < 0) 
				{
                    System.out.println("Marks cannot be negative. Please enter valid marks");
                }
            } while (marks[i][1] < 0);

            // Input for Maths marks with validation for negative values
            do 
			{
                System.out.println("Enter Maths marks for Student " + (i + 1) + " ");
                marks[i][2] = input.nextInt();
				
                if (marks[i][2] < 0) 
				{
                    System.out.println("Marks cannot be negative. Please enter valid marks.");
                }
            } while (marks[i][2] < 0);
			
            // Calculate the percentage for each student
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;
            
            // Assign grades and remarks based on percentage
            if (percentages[i] >= 80) 
			{
                grades[i] = 'A';
                remarks[i] = "Level 4, above agency-normalized standards";
            } 
			else if (percentages[i] >= 70 && percentages[i] <= 79 ) 
			{
                grades[i] = 'B';
                remarks[i] = "Level 3, at agency-normalized standards";
            } 
			else if (percentages[i] >= 60 && percentages[i] <= 69) 
			{
                grades[i] = 'C';
                remarks[i] = "Level 2, below, but approaching agency-normalized standards";
            } 
			else if (percentages[i] >= 50 && percentages[i] <= 59) 
			{
                grades[i] = 'D';
                remarks[i] = "Level 1, well below agency-normalized standards";
            } 
			else if (percentages[i] >= 40 && percentages[i] <= 49) 
			{
                grades[i] = 'E';
                remarks[i] = "Level 1, too below agency-normalized standards";
            }
			else 
			{
                grades[i] = 'R';
                remarks[i] = "Remedial standards";
            }
        }

        // Display the percentages, grades, and remarks of each student
        System.out.println("\nResults of Students ");
        for (int i = 0; i < numStudents; i++) 
        {
            System.out.println("Student " + (i + 1) + " ");
            System.out.println("Percentage: " + percentages[i] + "%");
            System.out.println("Grade " + grades[i]);
            System.out.println("Remarks " + remarks[i]);
        }
    }
}
