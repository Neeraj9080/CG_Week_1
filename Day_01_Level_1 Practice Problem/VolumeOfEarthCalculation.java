// Creating a class VolumeOfEarthCalculation to calculate volume of the Earth
class VolumeOfEarthCalculation
{
  public static void main(String args[])
  {
    // Create a variable radius to store radius of earth
    int radius = 6378;
	
    // Create a variable volumeOfEarthInKm to calculate volume of earth in Km
	double volumeOfEarthInKm = (4.0/3)*3.14* (radius*radius*radius);
	
    // Create a variable volumeOfEarthInMiles to calculate volume of earth in Miles
	double volumeOfEarthInMiles = volumeOfEarthInKm * 1.6;
	
	//Display the result
	System.out.println(" The volume of earth in cubic kilometers is " + volumeOfEarthInKm + " and cubic miles is " + volumeOfEarthInMiles);
	}
}