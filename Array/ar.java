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