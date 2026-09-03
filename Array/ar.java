//Array - An array is a data structure use to store a fixed number of element of same data type in contiguos memory location;
//Each element indexing is start with 0
//Creating An Array
//(1)Declare and Create
/*
eg- dataType[] arrayName = new dataType[size];
adding value in array 
arrayName[index] = value;
startin index value is = 0

public class ar{
   public static void main(String[] args){
    int[] marks = new int[3];
marks[0] = 10;
marks[2] =2;
System.out.print(marks[0]);
   }
}
*/
//(2)Direct initialization 
//dataType arrayName = {value,value};
//all sum
/*
public class ar{
    public static void main(String[] args){
       
        int[] marks = {2,3,4,4};
        int sum = 0;
        for (int i = 0; i<=marks.length-1;i++){
             sum = sum+marks[i];
        
        }
           System.out.println(" sum " + " = " + sum);
         


    }
}
*/

//Array as function argument
//Array should be pass by refrence and pass by refrence value can change in main function 
//Array refrence main function se upr me 
/*
public class ar{
    public static void updateArr(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] arg){
        int marks[] = {99,199,129,99};
        updateArr(marks);
        for (int i = 0; i<marks.length; i++){
                        System.out.println(marks[i]);
        }
        
    }
}
*/

//first algorithem - linear search
//finding the value one by one the given value/key
/*
public class ar{
    public static int linearSearch(int marks[],int key){
        for (int i = 0; i < marks.length; i++){
            if(marks[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] arg){
        int marks[] = {2,3,4,5,6,123,34,5};
        int key = 12;
        
        int index = linearSearch(marks,key);
        if(index == -1){
            System.out.print("Not found");
        }
        else{
            System.out.print("Key is on index = " + index);
        }
    }
}
*/

//Find the largest number in given array
import java.util.*;
public class ar{
    public static int largestNum(int number[]){//argument function -send value to the parameter
        int largest = Integer.MIN_VALUE;//-INFINIT
        int smallest = Integer.MAX_VALUE;//INFINITY
        for(int i = 0; i <number.length; i++){
            if(largest < number[i]){
                largest = number[i];
            }
            if(smallest > number[i]){
                smallest = number[i];
            } 
        }
        System.out.println("Smallest num in the given array = " + smallest);
        return largest;
    }
    public static void main(String[] arg){
        int number[] = {2,4,5,6,7,2,10,3};
       
        System.out.print("Largest num is = " + largestNum(number));//parameter function
    }
}