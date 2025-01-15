//Creating AverageMarkCalculation class to calculate average mark
class AverageMarkCalculation
{
  public static void main(String args[])
  {
    //create a variable mathsMark and assign value 94
    int mathsMark = 94;
	//create a variable physicsMark and assign value 95
	int physicsMark = 95;
	//create a variable chemistryMark and assign value 96
	int chemistryMark = 96;
	
	//create a variable mathsMark and assign value 94
	double averageMark = (1.0*(mathsMark + physicsMark + chemistryMark)) / 3;
	
	//Displaying the average marks
	System.out.println("Sam's average mark in PCM is " + averageMark );
   }
}