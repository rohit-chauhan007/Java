// public class subArr{
//     public static void subArray(int num[]){
//         for (int i = 0; i <num.length; i++){
//             int start = i;
//             for(int j = i; j < num.length; j++){
//                 int end = j;
//                 for (int k = start; k <= end; k++){
//                     System.out.print(num[k] + "");
//                 }
//                 System.out.println("");
//             }
//             System.out.println("");
//         }
//     }
//     public static void main(String[] arg){
//         int num[] = {2,3,4,6,5};
//         subArray(num);
//     }
// }

//max subArray sum 
import java.util.*;
public class subArr{
    public static void sumSub(int num[]){
        int curr = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i <num.length; i++){
            for(int j = i; j < num.length; j++){
                curr = 0;
                for(int k = i; k <= j; k++){
                    curr+=num[k];
                    if(maxSum < curr){
                        maxSum = curr;
                    }  
                }
                System.out.print("Sum of " + (i+1) + " sub Array = " + curr);
                System.out.println("");   
            }
        }
        System.out.print("Max sum of sub array = " + maxSum);
    }
    public static void main(String[] arg){
        int num[] = {2,3,4};
        sumSub(num);
       
    }
}