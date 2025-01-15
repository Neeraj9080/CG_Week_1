import java.util.Random;
import java.util.HashSet;

//creating a class OTPGenerator to generate and validate the OTPs
class OTPGenerator 
{

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() 
	{
        Random random = new Random();
        
        // Generate a random 6-digit OTP by multiplying Math.random() with 1000000 and casting it to an integer
        int otp = (int) (random.nextDouble() * 1000000);
        
        return otp;
    }

    // Method to check if all OTP numbers are unique
    public static boolean areOTPsUnique(int[] otps) 
	{
        HashSet<Integer> otpSet = new HashSet<>();
        
        // Add each OTP to the set and check for uniqueness
        for (int otp : otps) 
		{
            if (!otpSet.add(otp)) 
			{
                return false; // Return false if duplicate OTP is found
            }
        }
        
        return true; // Return true if all OTPs are unique
    }

    // Main method to generate 10 OTPs and ensure they are unique
    public static void main(String[] args) 
	{
        int[] otps = new int[10];
        
        // Generate 10 OTPs and store them in the array
        for (int i = 0; i < 10; i++) 
		{
            otps[i] = generateOTP();
            System.out.println("Generated OTP #" + (i + 1) + ": " + otps[i]);
        }
        
        // Check if the generated OTPs are unique
        boolean areUnique = areOTPsUnique(otps);
        
        if (areUnique) 
		{
            System.out.println("All OTPs are unique.");
        } 
		else 
		{
            System.out.println("Some OTPs are duplicate.");
        }
    }
}
