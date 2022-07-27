/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monthday;

import java.util.*;

class MonthDays{
    private int month;
    private int year;

    public void MonthDays(int m ,int y) {
        this.setMonth(m);
        this.setYear(y);
    }
    
    public boolean isLeap(int y) {
        return(y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0));
    }
    
    public void setMonth(int m) {
        try{
            if(m<1 || m>12) {
                System.out.println("Month must be between 1 and 12. Program terminating.");
                return;
            }
            month = m;
        }catch(Exception e){
            System.out.println("Invalid input! Program terminating...");
            return;
        }
            
        
    }
    
    public void setYear(int y) {
        try{
            if(y < 0) {
                System.out.println("Year must be positive. Program terminating.");
                return;
            }
            year = y;
        } catch(Exception e){
            System.out.println("Invalid input! Program terminating...");
            return;
        }
    }
    
    public int getMonth() {
        return month;
    }
    
    public int getYear() {
        return year;
    }
    
    public int getNumberOfDays() {
        int DayOfMonth[] ={ -1,31,28,31,30,31,30,31,31,30,31,30,31 };
        if(isLeap(this.year))DayOfMonth[2]+=1;
        return DayOfMonth[this.month];
    }
    
}
/**
 *
 * @author Jheremy
 */
public class MonthDay{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int month;
        int year;
        
        System.out.print("Enter the month (1=January, 2=February, ..., 12=December): ");
        month = cin.nextInt();
        System.out.print("Enter the year: ");
        year = cin.nextInt();

        MonthDays m1 = new MonthDays();    
        
        m1.MonthDays(month, year);
        
        System.out.printf("%d/%d has %d days\n", m1.getMonth(), m1.getYear(), m1.getNumberOfDays());
        month=cin.nextInt();
        cin.close();
    }
    
}
