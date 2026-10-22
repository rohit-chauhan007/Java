//insertion sort - check the curr element with the prev. element of given arr and sift if the curr value is greater than prev..
//1) curr varible
//2) prev variable

public class  insert{
    public static void insertionSort(int[] arr){// {3,2,5,4,1};
        int n  = arr.length;//5
        for(int i = 1; i <n; i++){ //start with index one and end last index
            int curr = arr[i];// arr[1] = 2;
            int prev = i - 1; //1 - 1 = 0;
           //while loop
           while(prev >= 0 && arr[prev] > curr){ //true && arr[0] = 3 > 2 true = true
               arr[prev + 1] = arr[prev];//arr[1] = 2; 
               prev--;
           }
             arr[prev + 1] = curr; 
        }
        for (int i = 0 ; i < n ; i++){
            System.out.print(" " + arr[i]);
        }

    }
    public static void main(String[] arg){
        int[]  arr =  {3,2,5,4,1};
        insertionSort(arr);
    }
}