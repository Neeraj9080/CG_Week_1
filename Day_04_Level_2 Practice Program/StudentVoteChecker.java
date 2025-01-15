//import Scanner class for user input
import java.util.Scanner;

//Creating a class StudentVoteChecker to check voting eligibility
class StudentVoteChecker
{
    // Method to check if a student can vote based on their age
    public static boolean canStudentVote(int age)
    {
        // Check if age is valid (not negative) and if the student is 18 or older
        if (age < 0) 
		{
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args)
    {
        // Create an object of Scanner class for user input
        Scanner input = new Scanner(System.in);
        
        // Create an array to store the age of 10 students
        int[] studentAges = new int[10];
        
        // Loop through the array to get user input for each student's age
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter age of student " + (i + 1) + " ");
            studentAges[i] = input.nextInt();
        }
        
        // Check if each student can vote and display the result
        for (int i = 0; i < 10; i++) 
		{
            boolean canVote = canStudentVote(studentAges[i]);
            if (canVote) 
			{
                System.out.println("Student " + (i + 1) + " can vote");
            } 
			else 
			{
                System.out.println("Student " + (i + 1) + " cannot vote");
            }
        }
    }
}
