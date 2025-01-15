//Importing Scanner class to take user input
import java.util.Scanner;

// Creating class named YoungestTallestFriends to find the youngest and tallest friends
class YoungestTallestFriends 
{
    public static void main(String[] args) 
	{
        // Create a Scanner class object to take input from the user
        Scanner sc = new Scanner(System.in);

        // create three variables for age and height of 3 friends
        int amarAge, akbarAge, anthonyAge;
        double amarHeight, akbarHeight, anthonyHeight;

        // Display the message to the user to enter the age and height of Amar
        System.out.print("Enter Amar's age ");
        amarAge = sc.nextInt();
        System.out.print("Enter Amar's height in meters ");
        amarHeight = sc.nextDouble();

        // Display the message to the user to enter the age and height of Akbar
        System.out.print("Enter Akbar's age ");
        akbarAge = sc.nextInt();
        System.out.print("Enter Akbar's height in meters ");
        akbarHeight = sc.nextDouble();

        // Display the message to the user to enter the age and height of Anthony
        System.out.print("Enter Anthony's age ");
        anthonyAge = sc.nextInt();
        System.out.print("Enter Anthony's height in meters ");
        anthonyHeight = sc.nextDouble();

        // Finding the youngest friend 

        if (akbarAge < amarAge  &&  akbarAge < anthonyAge) 
		{
            // Display the youngest friend
            System.out.println("The youngest friend is Akbar" );
        }
        else if (amarAge < anthonyAge  && amarAge < akbarAge) 
		{
            // Display the youngest friend
            System.out.println("The youngest friend is Amar" );
        }
        else
		{
            // Display the youngest friend
            System.out.println("The youngest friend is Anthony" );
        }
		
		
        // Finding  the tallest friend

        if (akbarHeight > amarHeight  && akbarHeight > anthonyHeight) 
		{
            // Display the tallest friend
            System.out.println("The tallest friend is Akbar");
        }
        else if (amarHeight > akbarHeight  &&  amarHeight > anthonyHeight) 
		{
            // Display the tallest friend
            System.out.println("The tallest friend is Amar");
        }
        else
		{
           // Display the tallest friend
           System.out.println("The tallest friend is Anthony");
		}
    }
}
