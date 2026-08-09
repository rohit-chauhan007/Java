//if else
//else if
//switch
//ternary

// public class cond{
//     public static void main(String[] args){
//         int num = 4;
//         switch(num){
//             case 1: System.out.print("Monday");
//             break;
//             case 2 : System.out.print("Tuesday");
//             break;
//             case 4 : System.out.print("Wednesday");
//             break;
//             case 5 : System.out.print("Thursday");
//             break;
//             case 6:System.out.print("Friday");
//             break;
//             default:System.out.print("NO day");
//         }
//     }
// }
/*
public class cond {
  public static void main(String[] args){
     int num = 5;
     String check = (num % 2 == 0)? "even" : "odd";
     System.out.print(check);
  }
}
*/
// import java.util.*;
// public class cond {
//   public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a number to poss or neg");
//     int num = sc.nextInt();
//     if(num>0){
//         System.out.print("The given num is possitive");
//     }else{
//         System.out.print("Negative");
//     }
//   }
// }

/*Finish the following code so that it prints You have a fever if your temperature
is above 100 and otherwise prints You don't have a fever.
public class cond{
    public static void main(String[] arg){
        double temp = 103.9;
        if(temp > 100){
            System.out.print("You hava fever");
        }else{
            System.out.print("You dont have fever");
        }
    }
}

*/


import java.util.*;
public class cond{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year to find years is leap or not");
        int year = sc.nextInt();
        if(year % 4==0 && (year % 100 != 0 || year % 400 ==0 )){
            System.out.print("Leap year");
        }
        else{
            System.out.print("Not a leap year");
        }
    }
}