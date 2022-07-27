import java.util.*;
public class bre
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);   
		int rows, cols;
		float sumCol;  
		float[][] my_float=new float[3][5];
		for (float[] row: my_float){
            Arrays.fill(row, 0.0f);
		}
        // 		Calculates number of rows and columns present in given matrix  
        rows = my_float.length;  
        cols = my_float[0].length;  
        float[] sums=new float[cols];
        for(int i = 0; i < cols; i++){  
            sumCol = 0;  
            for(int j = 0; j < rows; j++){  
                sumCol = sumCol + my_float[j][i];  
            }  
            sums[i]=sumCol;  
        }
        
        for (int i = 0; i < my_float.length; i++) { //this equals to the row in our matrix.
            for (int j = 0; j < my_float[i].length; j++) { //this equals to the column in each row.
                System.out.print(my_float[i][j] + " ");
            }
            System.out.println(); //change line on console as row comes to end in the matrix.
        }
      
        for (int i = 0; i < my_float.length; i++) { //this equals to the row in our matrix.
            for (int j = 0; j < my_float[i].length; j++) { //this equals to the column in each row.
                my_float[i][j] =sc.nextFloat();
        }
        
      }
      
      
        for (int i = 0; i < my_float.length; i++) { //this equals to the row in our matrix.
            for (int j = 0; j < my_float[i].length; j++) { //this equals to the column in each row.
                System.out.print(my_float[i][j] + " ");
        }
            System.out.println(); //change line on console as row comes to end in the matrix.
        }
	}
}