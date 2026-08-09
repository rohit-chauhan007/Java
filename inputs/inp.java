//input ke liye pahle import java.util.* ki file import karni hogi
//uske baad Scanner variableName = new Scanner(System.in);
//next us value store String name = variableName.next();

// import java.util.*;
// public class inp {
//     public static void main(String[] arg){
//        Scanner name = new Scanner(System.in); 
//        String out = name.next();
//        System.out.print(out);
//     }
// }

//print sum of a b from input user
 
/*
 import java.util.*;
public class inp {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      
      int sum = a+b;
      System.out.print("sub of a and b = " + sum);
      
    }
}*/
/*area of circle 

import java.util.*;

public class inp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle");
        int rad = sc.nextInt();
        double area = 3.14*rad*rad;
        System.out.print(area);
    }
}
*/
//type promotion 
//1 float,char,short convert automaticlly in int bcs of type promotion

// public class inp{
//     public static void main (String[] arg){
//        char a  = 'a';
//        char b = 'b';
//        System.out.print((int)(a));
//     }
// }

/* average 

import java.util.*;
public class inp {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num a");
        int a = sc.nextInt();
        System.out.print("enter a number b");
        int b = sc.nextInt();
         System.out.print("enter a number c");
        int c = sc.nextInt();
        int average = (a+b+c)/3;
        System.out.print(average);

    }
}*/
//area of square
/*
import java.util.*;
public class inp{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  side of a squre");
        int  side = sc.nextInt();
        int  area = side * side;
        System.out.print(area);
    }
}
*/

//user enter 3 item cost item is pen pencil and an eraser
//give output to user as totalBill 
// add 18% gst

import java.util.*;
public class inp{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter a pencil price");
        float pencilPrice = sc.nextFloat();
         System.out.println ("Enter  price of a pen");
        float penPrice = sc.nextFloat();
         System.out.println ("Enter price of an eraser");
        float earaserPrice = sc.nextFloat();

        float totalBill = pencilPrice +  penPrice +  earaserPrice;
        float gst = (totalBill * 18)/100;
        System.out.print(gst);
        float finalBill = totalBill + gst;
        System.out.println("Your total bill = " + (int)(totalBill));
        System.out.println(" after the 18% gst final bill = " + (int)(finalBill));

    }
}
