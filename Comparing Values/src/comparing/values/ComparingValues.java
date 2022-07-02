package comparing.values;
import java.util.*;

/**
 *
 * @author Jheremy Morales
 */
public class ComparingValues {
    /**
     * @param input array which compares numbers using the selection sort, 
     * since C and java have similar syntax, translating it from language to
     * language was not difficult
     */
    static void sortingNum(int[] input){
        int n = input.length; 

        // traverse unsorted array 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (input[j] < input[min_idx]) 
                    min_idx = j; 

            // swap minimum element with compared element  
            int temp = input[min_idx]; 
            input[min_idx] = input[i]; 
            input[i] = temp; 
        } 
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] numInput = new int[4];

        System.out.print("Enter the first value: ");
        numInput[0] = cin.nextInt();

        System.out.print("\nEnter the second value: ");
        numInput[1] = cin.nextInt();

        System.out.print("\nEnter the third value: ");
        numInput[2] = cin.nextInt();

        System.out.print("\nEnter the fourth value: ");
        numInput[3] = cin.nextInt();

        System.out.print("The values entered: ");
        for(int i = 0; i < 4; i++){
            System.out.print(numInput[i] + ", ");
        }    
        sortingNum(numInput);
        System.out.print("have a minimum value " + numInput[0] + " and maximum value " + numInput[3] + "\n");
    }
    

    
}
