
package pennies.pkgfor.pay;
import java.util.*;

/**
 *
 * @author jhere
 */
public class PenniesForPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("For how many days will pay double? : ");
        Scanner cin = new Scanner(System.in);
        int input = cin.nextInt();
        double penny = 0.01;
        System.out.print("Days\t Total Pay");
        System.out.print("\n--------------------------");
        System.out.print("\n1 \t$\t" + String.format("%.2f", doubleValue(penny, 1)));
        for(int i = 2; i < input; i++){
            System.out.print("\n" + (i) + "\t$\t" + String.format("%.2f", doubleValue(penny, (i + 1))));
           
            
        }
        
        
    }
    static double doubleValue(double x, int y){
        for(int i = 0; i < y; i++){
            x = x * 2;
        }
        return x;
    }
    
}
