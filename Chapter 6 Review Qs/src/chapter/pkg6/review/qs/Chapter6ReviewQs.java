/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chapter.pkg6.review.qs;
import java.security.SecureRandom;

/**
 *
 * @author Jheremy
 */
public class Chapter6ReviewQs {
    
    static void findMax(int input[][])
    {
        // Initializing max element as INT_MIN
        int maxElement = Integer.MIN_VALUE;
        int a =-1;
        int b = -1;
        // checking each element of matrix
        // if it is greater than maxElement,
        // update maxElement
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (input[i][j] > maxElement) {
                    maxElement = input[i][j];
                    a=i;
                    b=j;
                }
            }
        }
        System.out.println("Max element " + maxElement);
        System.out.print("Row: " + (a + 1) + " Column: " + (b + 1));       
    }
    
    public static void main(String[] args) {
        int[][] my_integers = new int [5][4];
        SecureRandom randomGenerator = new SecureRandom();
        
        //Placing random numbers to array
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                int rand = 0 + randomGenerator.nextInt(50);
                my_integers[i][j] = rand;
            }
            System.out.println();
        }
        //Outputting random generated numbers
        for(int i = 0; i < my_integers.length; i++){
            for(int j = 0; j < my_integers[0].length; j++){
                System.out.print(my_integers[i][j] + " ");
            }
            System.out.println();
        }
        
        findMax(my_integers);
            
        

    }
}
    

