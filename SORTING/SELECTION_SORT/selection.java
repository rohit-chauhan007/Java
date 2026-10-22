//selection sort = find minimum and swap with right possition
public class selection {
    public static void selection_sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int minIndex = i;
            for(int j = i+1;j<n;j++){
                if(arr[minIndex] > arr[j]){
                   minIndex = j;
                }
            }
            //swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        };
        for(int i = 0; i < n;i++){
            System.out.print(" " + arr[i]);
        }
    }
    public static void main(String[] arg){
        int[] arr = {5,2,3,1,4};
    
        selection_sort(arr);

    }
}