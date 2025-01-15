//Creating a class KilometersToMilesConversion to convert kilometers distance into miles 
class KilometersToMilesConversion
{
  public static void main(String args[])
  {
    //create a variable kilometers and assign value 10.8
    double kilometers = 10.8;
	
	//create a variable miles to convert kilometers distance into miles
	double miles = kilometers * 1.6 ;
	
	//Displaying the result
	System.out.println("The distance " + kilometers + " km in miles is " + miles );
  }
}