//Creating AgeCalculation class to calculate the Current Age

class AgeCalculation
{
  public static void main(String args[])
  {
	// create a int variable birthYear and assign value 2000
    int birthYear = 2000;
	// create a int variable currentYear and assign value 2024
	int currentYear = 2024;
	
	// create a int variable currentAge to indicate the currentAge
	int currentAge = currentYear - birthYear;
	
	//Displaying the current age
	System.out.println("Harry's age in 2024 is " + currentAge );
   }
}
  