//linear search is an shorting algorithem that is check condtion one by one in given array

//find the index of given array 
//[2,1,10,3] target = 10;

/*
public class linear{
    public static  int linearSearch(int number[],int target ){
        for(int i = 0; i < number.length; i++){
            if(number[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] arg){
       int number[] = {2,3,5,10,12};
       int target = 1;
        int index = linearSearch(number,target);
        if(index == -1){
            System.out.print("Number is not found");
        }else{
            System.out.print("The num is in index = " + index);
        }
    }
}
*/
/*
//find the greatest num in given array
import java.util.*;
public class linear{
   public static int largestNum(int num[]){
    int largest = Integer.MIN_VALUE;
    for(int i = 0; i < num.length; i++){
        if(largest < num[i]){
            largest = num[i];
        }
    }
    return largest;
   }
   public static void main(String[] arg){
    int num[] = {3,43,5,6,7,454,54};
   
    System.out.print( largestNum(num));
   }
}
*/
//smallest number 
import java.util.*;
public class linear{
    public static int smallestNum(int num[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < num.length; i++){
            if(smallest>num[i]){
                smallest = num[i];
            }
        }
        return smallest;
    }
   public static void main(String[] arg){
        int num[] = {8,5,43,5,6,3};
        System.out.print(smallestNum(num));
   }
  
}