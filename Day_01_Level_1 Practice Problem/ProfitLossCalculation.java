// Creating a class ProfitLossCalculation to calculate profit and loss
class ProfitLossCalculation
{
  public static void main(String[] args)
  {
    // create a variable costPrice to assign Cost Price
    int costPrice = 129;
	
    // create a variable sellingPrice to assign Selling Price
	int sellingPrice = 191;
	
    // create a variable Profit to calculate Profit
    double profit = sellingPrice - costPrice ;
	
    // create a variable profitPercentage to calculate Profit Percentage
	double profitPercentage = ((1.0*profit)/costPrice)*100 ;
	
	//Displaying the result
	System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage );
   }
}