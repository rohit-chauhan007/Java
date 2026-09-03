//linear search is an shorting algorithem that is check condtion one by one in given array

//find the index of given array 
//[2,1,10,3] target = 10;

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