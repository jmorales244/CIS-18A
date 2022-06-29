package pennies.pkgfor.pay;
import java.util.*;

/**
 *
 * @author Jheremy Morales
 */
public class PenniesForPay {

    
    public static void main(String[] args) {
        System.out.print("For how many days will pay double? : ");
        Scanner cin = new Scanner(System.in);
        int input = cin.nextInt();
        double penny = 0.01;
        double total = 0.01;
        System.out.print("Days\t Total Pay");
        System.out.print("\n--------------------------");
        System.out.print("\n1 \t$\t" + String.format("%.2f", penny));
        for(int i = 1; i < input; i++){
            System.out.print("\n" + (i+1) + "\t$\t" + String.format("%.2f", doubleValue(penny, (i)))); 
            total += doubleValue(penny, (i));
        }
        System.out.print("\n--------------------------");
        System.out.print("\nTotal\t$\t" + String.format("%.2f", total) + "\n");
       
        
    }
    /**
     * @param x will be the base of what will be doubled with 
     * @param y will be the amount of times it will be doubled, essentially the exponent
     * @return the result that has been doubled 
     */
    static double doubleValue(double x, int y){
        for(int i = 0; i < y; i++){
            x *= 2;
        }
        return x;
    }
    
}
