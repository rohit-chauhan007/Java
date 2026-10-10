//bubble sort =  loop + compare + swap(if bigger);

public class bubble{
    public static void bubble_sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++ ){
            for (int j = 0; j < n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0 ; i < n;i++){
            System.out.print(" " + arr[i]);
        }
    }
    public static void main(String[] arg){
        int[] arr = {5,2,4,1,3};
        bubble_sort(arr);
    }
}