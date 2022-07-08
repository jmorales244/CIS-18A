

package array.statistics;
import java.util.*;
/**
 *
 * @author Jheremy Morales
 */
public class ArrayStatistics {

    static void sortingDouble(double[] input){
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
            double temp = input[min_idx]; 
            input[min_idx] = input[i]; 
            input[i] = temp; 
        } 
    }
    public static double calculatePopulation(double numArray[])
    {
        double sum = 0.0, standardDeviation = 0.0;
        int length = numArray.length;

        for(double num : numArray) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: numArray) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }
        public static double calculateSample(double numArray[])
    {
        double sum = 0.0, standardDeviation = 0.0;
        int length = numArray.length;

        for(double num : numArray) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: numArray) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/(length-1));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        
        System.out.print("How many number of the type of double do you want to store in your array?: ");
        
        int arraySize = cin.nextInt();
        double average, populationSD, sampleSD;
        double total = 0;
        double[] array = new double[arraySize];
        
        for(int i = 0; i < arraySize; i++){
            System.out.print("Enter a value #" + (i+1) + ": ");
            array[i] = cin.nextDouble();
            total += array[i];
        }
        System.out.println("\nThe statistics for your user entered array is: ");
        System.out.println("-----------------------------------------------");
        
        sortingDouble(array);
        average = total / arraySize;
        populationSD = calculatePopulation(array);
        sampleSD = calculateSample(array);
        System.out.print("\n\t\t\tMinimum: " + String.format("%.3f", array[0]));
        System.out.print("\n\t\t\tMaximum: " + String.format("%.3f", array[arraySize - 1]));
        System.out.print("\n\t\t\tAverage: " + String.format("%.3f", average));
        System.out.print("\n\t\t\tStandard Deviation (population): " + String.format("%.3f", populationSD));
        System.out.print("\n\t\t\tStandard Deviation (sample): " + String.format("%.3f", sampleSD));
    }

}
