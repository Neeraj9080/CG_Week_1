//import Scanner class for the user input 
import java.util.Scanner;

// Create TravelComputation Class to compute the Distance and Travel Time
class TravelComputation {
   
   public static void main(String[] args) {
       
	  //create an object of Scanner class named as input to take input from the user
      Scanner input = new Scanner(System.in);
	   
      // Create a variable name to indicate the person traveling
      String name;
	  
	  //Displaying a message to take input
	  System.out.println("Enter the name of person travelling ");
	  name = input.nextLine();
      
      // Create a variable fromCity, viaCity and toCity to indicate the city
      // from city, via city and to city the person is travelling
      String fromCity, viaCity, toCity;
	  
	  //Displaying a message to take input
	  System.out.println("Enter the city from person is travelling ");
	  fromCity = input.nextLine();
	  
	  //Displaying a message to take input
	  System.out.println("Enter the city via person is travelling ");
	  viaCity = input.nextLine();
	  
	  //Displaying a message to take input
	  System.out.println("Enter the city to person is travelling ");
	  toCity = input.nextLine();

      // Create a variable distanceFromToVia to indicate the distance 
      // between the fromCity to viaCity
      double distanceFromToVia;
	  
	  //Displaying a message to take input
	  System.out.println("Enter the distance From To Via city person is travelling in miles");
	  distanceFromToVia = input.nextDouble();

      // Create a variable timeFromToVia to indicate the time taken to 
      // travel from fromCity to viaCity in minutes
      int timeFromToVia;
	  
	  //Displaying a message to take input
	  System.out.println("Enter the time From To Via city person is travelling");
	  timeFromToVia = input.nextInt();

      // Create a variable distanceViaToFinalCity to indicate the distance 
      // between the viaCity to toCity
      double distanceViaToFinalCity;
	  
	  //Displaying a message to take input
	  System.out.println("Enter the distance Via To Final city person is travelling in miles");
	  distanceViaToFinalCity = input.nextDouble();

      // Create a variable timeViaToFinalCity to indicate the time taken to
      // travel from viaCity to toCity in minutes
      int timeViaToFinalCity;
	  
	  //Displaying a message to take input
	  System.out.println("Enter the time Via To Final city person is travelling");
	  timeViaToFinalCity = input.nextInt();

      // Create a variable totalDistance to indicate the total distance
      // between the fromCity to toCity
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;

      // Create a variable totalTime to indicate the total time taken to
      // travel from fromCity to toCity in minutes
      int totalTime = timeFromToVia + timeViaToFinalCity;


      // Print the travel details
      System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
   }
}
