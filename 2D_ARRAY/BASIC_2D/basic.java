//2D ARRAY = STORE DATA IN ROW AND COLUMN
//DECLEARATION
//DATA_TYPE ARRAY_NAME = {{},{}};
//MEMORY ALLOCATION
//int[][] arr = new int[rows][columns];

//access = arr[row][col];

// public class basic {
//     public static void main(String[] arg){
//         int[][] arr = {{2,4,5},{6,7,8}};
//         System.out.print(arr[1][1]);
//     }
// }
/*
import java.util.*;
public class basic {
    public static void main(String[] arg){
        int matrix[][] = new int[2][2];//2 row
        int row = matrix.length,col = matrix[0].length;
        Scanner sc = new Scanner(System.in);
       for(int i = 0; i < row; i++){
        for (int j = 0; j <col; j++){
            matrix[i][j] = sc.nextInt();
        }
       }


        for (int i = 0; i < row; i++){//0 1 2
            for(int j = 0; j < col; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }
      
        
    }
}
*/

public class basic {
    public static boolean Search(int matrix[][],int key){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.print(i + "th row " + j + "th col ");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] arg){
        int matrix[][] = {{1,2,3},{4,5,6}};
        int key = 6;
      boolean result =   Search(matrix,key);
        System.out.print(result);
    }
}
