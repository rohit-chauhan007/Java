//loops -repeat jb tb condition true ho
//while
//do while
//for 
//keyword -
//1. break - to use break the loop 
//2. skipp the iteratio 
//do if ke sath condition check ke lie use hota h

//while -
/* 
public class loop{
    public static void main(String[] arg){
        int counter = 0;
        while(counter < 100){
            System.out.println("hello world" + counter);
            counter++;
        }
        
    }
}

*/
//print num 1 to 10
// public class loop {
//     public static void main(String[] arg){
//         int num = 0;
//         while(num <= 10){
//             System.out.println(num);
//             num++;
//         }
//     }
// }

//print num 1 to n
/*
import java.util.*;

public class loop{
    public static void main(String[] arg){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int num = 1;
        while (num <= n){
            System.out.println(num);
            num++;
        }

    }
}*/


// public class loop{
//     public static void main(String[] arg){
//         for (int i = 1; i <= 100; i = i+2){
//             System.out.println(i);
//         }
//     }
// }
//print odd 1 to 100

// public class loop{
//     public static void main(String[] arg){
//         for ( int i=1;i<=100;i++){
//             if ( i % 2 != 0 ){
//                 System.out.println(i);
//             }
//         }
//     }
// }

//multiply
// import java.util.*;
// public class loop{
//     public static void main(String[] arg){
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         for (int i = num; i<=num*10; i = num + i){
//               System.out.println("="+i);
//         } 
//     }
// }

// import java.util.*;
// public class loop{
//  public static void main(String[] arg){
//      Scanner sc = new Scanner(System.in);
//      int num = sc.nextInt();
//       for(int i = 10; i <= 1;i--){
//         System.out.println(i);
//      }
// }
// }
// public class loop{
//     public static void main(String[] arg){
//         int counter = 1;
//         do{
//             System.out.print("hello world");
//             counter++;
//         }while(counter <= 10);
//     }
// }

//braek 
// import java.util.*;
// public class loop{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         do{
//             System.out.print("Enter your num : ");
//             int n = sc.nextInt();
//             if(n%10==0){
//                 break;
//             }
//             System.out.print(n);
//         }while(true);
//     }
// }


// public class loop{
//     public static void main(String[] args){
//         for (int i = 1; i<=5;i++){
//             if( i == 3){
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }

//print n num sum
// public class loop{
//     public static void main(String[] args){
//         int n = 0;
//         for (int i=1;i <= 5;i++){
//            n = n + i;

           
//         }
//            System.out.println(n);
//     }
// }
//same in while loop

// import java.util.*;
// public class loop{
// public static void main(String[] arg){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter a number to calculate sum");
//     int n = sc.nextInt();
//     int sum = 0;

//     int i =1;
//     while( i<=n){
//         sum = sum+i;
//         i++;
//     }
//     System.out.print(sum);
// }
// }
//in do while

// public class loop{
//     public static void main(String[] arg){
//         int sum = 0;
//         int i = 1;
//         do{
//           sum +=i;  
//           i++;
//         }while(i<=4);
//         System.out.print(sum);
//     }
// }

//reverse a number

// public class loop{
//     public static void main(String[] arg){
//        for (int i = 5;i>=1;i--){
//         System.out.print(i);
//        }
//     }
// }
//even or odd sum
// import java.util.*;
// public class loop{
//     public static void main(String[] args){
//         int number;
//         int choice;
//         int evenSum = 0;
//         int oddSum = 0;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number");

//         number = sc.nextInt();
//       for (int i = 0; i <= number;i++){
//         if(number%2==0){
//             evenSum+=i;
//         }
//         else{
//             oddSum +=i;
//         }
//       }
//       System.out.print("Do want to continue ? Press 1 for yes and 0 for not");
//       choice = sc.nextInt();
//       if(choice == 1 && number%2==0){
//           System.out.print("The sum of even num = " + evenSum);
//       }
//           if(choice == 1 && number%2!=0){
//             System.out.print("The sum of even num = " + oddSum);
//           }
      
//     }

// }
// import java.util.*;
// public class loop {
//    public static void main(String[] arg){
//       Scanner sc = new Scanner(System.in);
//       int fact = 1;
//       System.out.print("Enter a number");
//       int num = sc.nextInt();
//       for(int i = 1; i <= num; i++){
//          fact *=i;
//       }
//       System.out.print("Factorial  of " + num +  " = " +  fact);
     

//    }
// }


//Multiplication table 
import java.util.*;
public class loop{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number of  table");
        int num = sc.nextInt();
        for (int i = 1; i<=10;i++){
             System.out.println(num +  " * " + i + " = " + i * num);
        }
    }
}