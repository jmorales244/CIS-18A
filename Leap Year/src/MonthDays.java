
/**
 *
 * @author jhere
 */
import java.util.*;

public class MonthDays {
    public static void MonthDays(int month, int year){
        Scanner cin = new Scanner(System.in);
        int[] normalYear  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] leapYear = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        //if the year is evenly divisible and cannot be evenly divisible by 100 
        //  or when the year can be evenly divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            //then
            System.out.printf("%n%d is a leap year.%n", year);
            System.out.printf("The month has %d days%n", leapYear[month - 1]);
        }
        //Anything else cannot be a leap year
        else {
            System.out.printf("%n%d is not a leap year.%n", year);
            System.out.printf("The month has %d days%n", normalYear[month - 1]);
        }
    }
    
}
