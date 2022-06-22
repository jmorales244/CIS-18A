/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package monthly.sales.tax;
import java.util.*;

/**
 *
 * @author jhere
 */
public class MonthlySalesTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double cTax = 0.0235;
        double sTax = 0.0875;
        System.out.print("\t*** Monthly Sales Tax *** ");
        System.out.print("\nMonth & Year: ");
        String date = cin.nextLine();
        System.out.println("-------------------------------");
        System.out.print("Total Collected:      $ ");
        double income = cin.nextDouble();
        double sales = income / 1.111;
        System.out.print("Sales:                $ ");
        System.out.print(String.format("%.2f",sales));
        double countyTax = sales * cTax;
        double stateTax = sales * sTax; 
        double totalTax = countyTax + stateTax; 
        System.out.print("\nCounty Sales Tax:     $ ");
        System.out.print(String.format("%.2f", countyTax));
        System.out.print("\nState Sales Tax:      $ ");
        System.out.print(String.format("%.2f", stateTax));
        System.out.print("\nTotal Sales Tax:      $ ");
        System.out.print(String.format("%.2f", totalTax));


    }
    
}
