//Importing Scanner class for user input
import java.util.Scanner;

// Creating a class GradeCalculation to calculate grade, average marks and remark
class GradeCalculation
{
  public static void main(String[] args) 
  {
    // Creating a Scanner class object 
    Scanner input = new Scanner(System.in);
        
    // creating three variables to store marks of student in each subject
    int marksInPhysics, marksInChemistry, marksInMaths;
        
    //Displaying a message to take input  
	System.out.println("Enter physics marks ");
	marksInPhysics = input.nextInt();
	  
    //Displaying a message to take input  
	System.out.println("Enter chemistry marks ");
	marksInChemistry = input.nextInt();
	  
    //Displaying a message to take input  
	System.out.println("Enter maths marks ");
	marksInMaths = input.nextInt();
	
	//creating a variable averageMarks to calculate average marks
	double averageMarks = (marksInPhysics + marksInChemistry + marksInMaths) / 3;
	 
	//identifying grades and remarks of the students using if-else statements 
	if(averageMarks > 80)
	{
		System.out.println("Average Mark is " + averageMarks + ", Grade is A and Remarks is level 4, above agency-normalized standards");
	}
	else if(averageMarks >= 70 && averageMarks <= 79)
	{
		System.out.println("Average Mark is " + averageMarks + ", Grade is B and Remarks is level 3, at agency-normalized standards");
	}
	else if(averageMarks >= 60 && averageMarks <= 69)
	{
		System.out.println("Average Mark is " + averageMarks + ", Grade is C and Remarks is level 2,below,but approaching agency-normalized standards");
	}
	else if(averageMarks >= 50 && averageMarks <= 59)
	{
		System.out.println("Average Mark is " + averageMarks + ", Grade is D and Remarks is level 1, well below agency-normalized standards");
	}
	else if(averageMarks >= 40 && averageMarks <= 49)
	{
		System.out.println("Average Mark is " + averageMarks + ", Grade is E and Remarks is level 1, too below agency-normalized standards");
	}
	else
	{
		System.out.println("Average Mark is " + averageMarks + ", Grade is R and Remarks is Remedial standards");
	}
   }
}