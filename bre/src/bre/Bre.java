package bre;

/**
 *
 * @author Jheremy Morales
 */
import java.util.*;

public class Bre {
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int minimum, maximum, counter = 0;
    int[] volume = new int[4];
    while(counter < 4){
        System.out.print("Enter a value: ");
        volume[counter] = input.nextInt();
        counter += 1;
    }
    for(int i = 0; i < 4; i++){
        if(volume[i] < volume[i++]){
            minimum = volume[i];
            if(volume[++i] < volume[i]){
                minimum = volume[i];
            }
        }
    }
    System.out.print("The minimum: " + minimum);
   }
}
