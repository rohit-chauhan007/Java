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
/*
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
*/
/*
Prefix sum
import java.util.*;
public class subArr{
    public static void prefixSum(int num[]){
        int maxSum = Integer.MAX_VALUE;
        int currSum = 0;
        //prefix array 
        int prefix[] = new int[num.length];
        prefix[0] = num[0];

        //calculate sum and store in prefix arr
        for (int i = 1; i<prefix.length;i++){
            prefix[i] = prefix[i-1] + prefix[i];//previus sum  + new sum;
        }
       for (int i = 0; i<num.length;i++){
        for(int j = i; j<num.length; j++){
            for(int k = i; k<=j;k++){
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(maxSum < currSum){
                        maxSum = currSum;
                    }  
            }

        }
          
       }
       System.out.print(maxSum);
      
    }
    public static void main(String[] arg){
        int num[] = {2,3,4};
        prefixSum(num);
    }
}
/
*/

//KEDANES ALGORITHEM
/*
import java.util.*;
public class subArr{
    public static void kadanes(int number[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0; i< number.length; i++){
             cs = cs + number[i];
             ms = Math.max(cs,ms);
            if(cs<0){
                cs = 0;
            }
        }
        System.out.print("Max sum = " + ms);
    }
    public static void main(String[] arg){
        int number[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(number);
    }
}
*/
