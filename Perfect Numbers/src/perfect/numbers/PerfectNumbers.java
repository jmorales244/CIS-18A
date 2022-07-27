package perfect.numbers;
import java.util.*;
/**
 * @author Jheremy Morales
 */
public class PerfectNumbers {
    static Scanner cin = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the largest number to try to display:");
        int user = cin.nextInt();
        String strAnswer = "";
        for (int i = 1; i < user; i++){ //Will continue to loop each number that is less than the user's input
            strAnswer=isPerfect(i);
            if(strAnswer != null) //If the string does not equal to null, then print out the factors
                System.out.println(strAnswer);
        }
        
    }
        
    public static String isPerfect(int num) {
        String answer = "";
        int sum = 0;
        for(int i = 1; i < num; i++){
            if (num % i == 0){ //if the remainder of the number in each loop is equal to 0, add it as a factor 
                answer = answer + " " + i;
                sum += i; // The sum makes sure that the factors equal to number that is perfect
            }
        }
        if(sum == num){ //if they add up to each other, then it is perfect
            answer = num + " is perfect.\n\tis:" + answer;
            return answer;
        }
        else //anything else will be nullified 
            return null;
  }
}

