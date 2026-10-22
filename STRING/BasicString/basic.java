//String - String is a data type that is use to store text value 
//example name,address,message etc;
//very important Java is immutable 
//immutable means jiski value change nhi hoti or change krne pr new string bnta hai
//there are two way to store value in string
//1. String variableName  = "value";
//2. String str =  new String ("Rohit");
// public class basic {
//     public static void main(String[] arg){
//         String str = " Rohit ";
//         String str2 = new String ("Kumar");
//         System.out.print(str);
//         System.out.print(str2);
//     }
// }

//input and output 
import java.util.*;
public class basic {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.print(name);
    }
}