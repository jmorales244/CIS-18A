
import java.util.*;

/**
 *
 * @author Jheremy Morales
 */
public class LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initializing class & input 
        Scanner cin = new Scanner(System.in);
        MonthDays leap = new MonthDays();
        String restart;
        System.out.print("\n\t***Leap Year***");
        while(true){
            System.out.print("\nPlease enter a month (1 = January, 2 = February, ..., 12 = December): ");
            int month = cin.nextInt();
            if(month < 1 || month > 12 ) //Could use a while loop to persist correct value
            {
                System.out.print("Month is invalid, must be between 1 & 12! Program terminating...\n");
                break;
            }
            System.out.print("Please enter a year: ");
            int year = cin.nextInt();
            leap.MonthDays(month, year);
            
            System.out.print("Would you like to restart? (Y/N) >");
            if(cin.nextLine().equals("N") || cin.nextLine().equals("n")){
                break;
            }
        }
        
    }

}
