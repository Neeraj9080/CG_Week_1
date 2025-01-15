// Importing Scanner class for user input
import java.util.Scanner;

// Creating a class to store digits of a number in an array and find the largest and second-largest element
class LargestSecondLargest
{
    public static void main(String[] args)
    {
        // Create an object of Scanner class to take input from the user
        Scanner input = new Scanner(System.in);

        // Take the number input
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        // Create an initial array to store digits, size is set to maxDigit = 10
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;  // Index to reflect the array index

        // Loop to extract the digits of the number and store them in the array
        while (number > 0)
        {
            // Extract the last digit
            int digit = number % 10;

            // If the array size is full, increase the size by 10
            if (index == maxDigit)
            {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                
                // Copy current digits array to the temp array
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;  // Assign temp to digits to expand the array
            }

            // Store the extracted digit in the array
            digits[index++] = digit;

            // Remove the last digit from the number
            number /= 10;
        }

        // Now, find the largest and second-largest digit in the array
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Loop through the digits array to find the largest and second-largest
        for (int i = 0; i < index; i++)
        {
            if (digits[i] > largest)
            {
                secondLargest = largest;  // Update second largest to be the previous largest
                largest = digits[i];  // Update largest to current digit
            }
            else if (digits[i] > secondLargest && digits[i] < largest)
            {
                secondLargest = digits[i];  // Update second largest if current digit is less than largest but greater than second largest
            }
        }

        // Display the largest and second-largest digits
        System.out.println("The largest digit is: " + largest);
        System.out.println("The second largest digit is: " + secondLargest);
    }
}
