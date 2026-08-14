//Function is a reusable block of code we call when we need the block of code 
//Write one time use many time
/*
always use access modifier before the returnType
agr return void type nhi h to return use krna prta h
*/

/*syntax 
returnType name (){
body
return:statement;
}
*/

// 

//prameter function
// import java.util.*;
// public class fun{
//     public static void sayHello(String name){
//         System.out.print(" Hello  " + name);
        
//     }
//     public static void main(String[] args){
//          Scanner sc = new Scanner(System.in);
//          System.out.print("Enter your user name " );
//          String userName = sc.nextLine();
//         sayHello(userName);
//     }
// }

//Sum function with return
import java.util.*;
public class fun{
    public static int sum(int a , int b){
        int sum = a + b;
        System.out.print("Sum is =  " + sum);
        return sum;
    }
    public static void main(String[] args){
        // Scanner sc = new Scanner (System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        sum(6,6);
    }
}