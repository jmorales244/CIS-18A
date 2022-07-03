package perfect.numbers;
import java.util.*;
/**
 *
 * @author Jheremy Morales
 */
public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        String str="";
        for (int i = 0; i < num; i++){
        str=isPerfect(i);
        if(str!=null)
        System.out.println(str);
        }
    }

private static String isPerfect(int n) {
String res = "";
int sum = 0;
for (int i = 1; i < n; i++) {
if (n % i == 0) {
res = res + " " + i;
sum += i;
}
}
if (sum == n) {
res = n + " is perfect.\n\tFactors:" + res;
return res;
}
return null;
}
}
