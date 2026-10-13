import java.util.*;
public class count{
    public static void countSort(int[] arr){
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            largest = Math.max(largest,arr[i]);
        };
        //for frquency store arr
        int[] freq = new int[largest + 1];
        for(int i = 0; i < n; i++){
            freq[arr[i]]++;
        };
        int j = 0;
        for(int i = 0; i < freq.length; i++){
            while(freq[i] > 0){
                arr[j] = i;
                j++;
                freq[i]--;
            }
        }
        for(int i = 0; i<n; i++){
            System.out.print(" " + arr[i]);
        }

    }
    public static void main(String[] arg){
        int[] arr = {1,4,1,3,2,3,4,7};
       countSort(arr);
    }
}