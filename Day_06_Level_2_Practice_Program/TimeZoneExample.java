// Importing necessary classes for handling time zones and date-time
import java.time.ZonedDateTime;
import java.time.ZoneId;

// Creating a class TimeZoneExample to display current time in different time zones
class TimeZoneExample 
{
    public static void main(String[] args) 
	{
        // Displaying the current time in GMT (Greenwich Mean Time)
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("Current time in GMT " + gmtTime);

        // Displaying the current time in IST (Indian Standard Time)
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current time in IST " + istTime);

        // Displaying the current time in PST (Pacific Standard Time)
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Current time in PST " + pstTime);
    }
}
