//Creating a class FeeCalculation to calculate fee of the university
class FeeCalculation
{
  public static void main(String args[])
  {
    //Create a variable named fee and assign 125000 to it
    int fee = 125000;
	
	//Create a variable named discountPercent and assign 10 to it
	int discountPercent  = 10;
	
	//Create a variable named discount to calculate discount
	double discount = fee * (10.0/100);
	
	//Create a variable named discountedPrice to calculate discounted price that student will pay for the course
	double discountedPrice = fee - discount;
	
	//Displaying the result
	System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedPrice);
   }
}
	
	
	