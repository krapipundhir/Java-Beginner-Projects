import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

/*
 * Program Name : DateTimeDemo
 *
 * Description :
 * Demonstrates Java Date and Time API.
 */

public class DateTimeClasses {

    public static void main(String[] args) {

        // Current date
        System.out.println("Current Date:");
        System.out.println(LocalDate.now());

        // Current time
        System.out.println("\nCurrent Time:");
        System.out.println(LocalTime.now());

        // Current date and time
        System.out.println("\nCurrent DateTime:");
        System.out.println(LocalDateTime.now());

    }
}