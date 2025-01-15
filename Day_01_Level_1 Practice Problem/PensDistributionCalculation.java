//Creating a clss PensDistributionCalculation to calculates how many pens distributed among students
class PensDistributionCalculation
{
  public static void main(String args[])
  {
    // create a variable totalPens to store total numbers of Pens
    int totalPens = 14;
	
    // create a variable totalStudents to store total numbers of students
	int totalStudents = 3;
	
    // create a variable penPerStudent to calculates how many pens distributed among each students
	int penPerStudent = totalPens / totalStudents ;
	
    // create a variable remainingPen to calculates how many pens are not distributed among students
	int remainingPen = totalPens % totalStudents ;
	
	//Displaying the result
	System.out.println("The Pen Per Student is " + penPerStudent + " and the remaining pen not distributed is " + remainingPen );
	}
}	