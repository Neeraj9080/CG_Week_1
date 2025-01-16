//importing scanner class for user input
import java.util.Scanner;

// Creating a class to find length of string using built in method and user defined method
class FindStringLength
{
     // creating a method getLengthUsingCharAt to get length of string using charAt() method
     public static int getLengthUsingCharAt(String text)
	 {
	     int count = 0;
		 try{
		 
	         while(true)
		     {
			     text.charAt(count);
                 count++;				 
		     }
			}
		 catch(Exception e)
         {
		    return count;
         }		 
	 }

    // Main method
    public static void main(String[] args) 
	{
        // Creating a Scanner class object for input
        Scanner input = new Scanner(System.in);

        // Taking user input for the string
        System.out.println("Enter a string ");
        String text = input.next();
		
		// creating variable to store value
		int lengthUsingUserMethod = getLengthUsingCharAt(text);
		int lengthUsingBuiltInMethod = text.length();
		
		//Displaying the result
		System.out.println("Length using user defined method " + lengthUsingUserMethod);
		System.out.println("Length using built in method " + lengthUsingBuiltInMethod);
    }
}