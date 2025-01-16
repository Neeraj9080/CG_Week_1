// Importing Scanner class for user input and Random class for random number
import java.util.Random;
import java.util.Scanner;

// creating a class VotingEligibility to check whether a student is can vote or not
class VotingEligibility
{
    // Method to generate random ages for students
    public static int[] generateStudentAges(int n)
    {
        Random rand = new Random();
        int[] ages = new int[n];
        
        for (int i = 0; i < n; i++)
        {
            ages[i] = rand.nextInt(18) + 10; // Random age between 10 and 27
        }
        return ages;
    }

    // Method to check voting eligibility based on age
    public static String[][] checkVotingEligibility(int[] ages)
    {
        String[][] eligibility = new String[ages.length][2];
        
        for (int i = 0; i < ages.length; i++)
        {
            eligibility[i][0] = String.valueOf(ages[i]);
			
            if(ages[i] >= 18)
			  eligibility[i][1] = "Can Vote" ;
			  
			else
              eligibility[i][1] = "Cannot Vote" ;			
        }

        return eligibility;
    }

    // Method to display the voting eligibility result
    public static void displayEligibility(String[][] eligibility)
    {
        System.out.println("Age | Voting Eligibility");
        for (String[] row : eligibility)
        {
            System.out.println(row[0] + " | " + row[1]);
        }
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Taking user input for number of students
        System.out.println("Enter the number of students ");
        int n = input.nextInt();

        // Generating student ages
        int[] ages = generateStudentAges(n);

        // Checking voting eligibility
        String[][] eligibility = checkVotingEligibility(ages);

        // Displaying the result
        displayEligibility(eligibility);
    }
}
