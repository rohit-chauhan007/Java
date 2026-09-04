//Binary sesarch is a  shorting algorithem perform on array
//it is always use on sorting array({1,2,4,5})/accending array decending order
/*
Steps
find mid of given array
mid = (s+l)/2 //start always = 0, last is == n-1

(2)condition
(i)ho skta h ki target > mid[i] to aise me half ke bad me search krenge
//tb start = last +1;
(!!)ho sakta h ki given target < mid[i] ho to half se pahle search karenge
tb start = last - 1;
(iii) ho skata h ki given target == mid[i] to ohi ans hoga or usko return kr denge

*/
public class bin{
    public static int binarySearch(int num[],int key){
         int st = 0;
         int end = num.length-1;
         while(st <= end){
            int mid = (st + end)/2;
            if(key == num[mid]){
                return mid;
            }else if(key > num[mid]){
                st = mid + 1;
            }else{
                end = mid - 1;
            }
         }
         return -1;
    }
    public static void main(String[] arg){
        int num[] = {1,2,4,5,7,8,9};
        int key = 8;
       int  index = binarySearch(num,key);
       if(index == -1){
        System.out.print("Element not found");
       }else{
        System.out.print("Element is on index " + index);
       }
    }
}