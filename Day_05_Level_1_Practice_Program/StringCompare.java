//Importing Scanner class for user input
import java.util.Scanner;

// Creating class name StringCompare to compare whether two strings equal or not
class StringCompare
{
  // checking both strings are equal or not using charAt() method
  public static boolean compareUsingCharAt(String str1, String str2)
  {
      if(str1.length() != str2.length() )
	  {
	     return false;
	  }
	  for(int i=0;i<str1.length();i++)
	  {
	      if(str1.charAt(i) != str2.charAt(i))
          {
             return false;
          }			 
	  }
	  return true;
  }
  
  // checking both strings are equal or not using equals() method
  public static boolean compareUsingEquals(String str1, String str2)
  {
      if(str1.length() != str2.length() )
	  {
	     return false;
	  }
	  if(str1.equals(str2))
	  return true;
	  
	  else
	  return false;
  }

  // creating main method
  public static void main(String[] args) 
  {
    //Create a Scanner class object 
    Scanner input = new Scanner(System.in);    
        
    // creating a two string variable str1 and str2 to store two strings
    System.out.println("Enter the string 1 ");
    String str1 = input.next();
	System.out.println("Enter the string 2 ");
    String str2 = input.next();
	
	// comparing result of both methods  
	if(compareUsingCharAt(str1,str2) && compareUsingEquals(str1,str2))
	{
	  System.out.println("Both strings are equals");
	}
    else
    {
      System.out.println("Both strings are not equals");
	}
    }
}	
	
    	