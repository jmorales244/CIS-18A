import java.util.*;

public class bre {
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int minimum, maximum, counter = 0;
    int[] volume = new int[4];
    while(counter <= 3){
        System.out.println("Enter a value: ");
        volume[counter] = input.nextInt();
        if(volume[counter] < volume[counter]){
            minimum = volume[counter];
            if(volume[counter] < volume[counter]){
                minimum = volume[counter];
            }
        }
        counter += 1;
    }
    System.out.print("The min: " + minimum);

   }
}
