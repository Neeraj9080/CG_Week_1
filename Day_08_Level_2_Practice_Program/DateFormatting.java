// Importing necessary classes for date formatting
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Creating a class DateFormatting to display date in different formats
class DateFormatting 
{
    public static void main(String[] args) 
	{
        // Getting the current date
        LocalDate currentDate = LocalDate.now();
        
        // Creating DateTimeFormatter objects with different formats
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        
        // Displaying the date in different formats
        System.out.println("Current date in dd/MM/yyyy format " + currentDate.format(format1));
        System.out.println("Current date in yyyy-MM-dd format " + currentDate.format(format2));
        System.out.println("Current date in EEE, MMM dd, yyyy format " + currentDate.format(format3));
    }
}
