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
// import java.util.*;
// public class fun{
//     public static int sum(int a , int b){
//         int sum = a + b;
//         System.out.print("Sum is =  " + sum);
//         return sum;
//     }
//     public static void main(String[] args){
//         // Scanner sc = new Scanner (System.in);
//         // int a = sc.nextInt();
//         // int b = sc.nextInt();
//         sum(6,6);
//     }
// }

//product of a and b
// import java.util.*;
// public class fun{
//     public static void mul(int a,int b){
//         int mul = a * b;
//         System.out.print("Product of a and b =  " + mul);
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a num a ");
//         int a = sc.nextInt();
//         System.out.print("Enter a num b ");
//         int b = sc.nextInt();
//         mul(a,b);
//     }

// }
//swap function


// import java.util.*;
// public class fun{
//     public static void swap(int a,int b){
//         int temp = a;
//         a = b;
//         b = temp;

//         System.out.print(a);
//         System.out.print(b);
//     }
//     public static void main(String[] args){
//         swap(6,8);
//     }
// }

//Factorial
//bionommial coefficient
/*
public class fun{
    public static int  factorial(int n){
        int f = 1;
        for  (int i = 1; i <= n; i++){
             f = (i*f);
        }
    
        return f;
    }
    public static int binCoeff(int n ,int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int nmr_fact = factorial(n-r);
        int binCoef= fact_n/(fact_r * nmr_fact);
        return binCoef;
    }
    
    public static void main(String[] arg){
      System.out.print(binCoeff(5,2));
    }
}
*/

//Function overloading = same function name bt diffrent parameter in one class
//its depend on only parameter
//example
//sum(int a ,int b);
//sum(int a,int b,int c);
//sum (bool a, bool b);
/*
import java.util.*;
public class fun{
    public static int sum(int a,int b){
        int sum = a + b;
        return sum;
    }
    public static int sum(int a, int b,int c){
        int sum = a + b + c;
        return sum;
    }
    public static int  sum(float  a,float b, float c){
        int  sum = (int) (a + b + c);
         return sum;
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  number a ");
        float  a = sc.nextFloat();
        System.out.print("Enter a number b ");
        float b = sc.nextFloat();
        System.out.print( "Sum of a and b  " + sum(a,b,5.5f));
    }
}
*/

  //check prime no 
  //prime no - 1 and self 
  /*
  public class fun{
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i = 2; i <= n-1; i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] arg){
         System.out.print(isPrime(6));
    }
  }
  */

  //optimize -every num gives repeated factor 
   /*
    public class fun{
        public static boolean isPrime(int n){
            boolean isPrime = true;
            if(n == 2){
                return true;
            };
            for(int i = 2; i <= Math.sqrt(n);i++){
                if(n % i == 0){
                    isPrime = false;
                    break;
                }
            }
            return isPrime;
        }
        //to check prime in range
        public static void inRange(int n){
            for(int i = 2; i <= n; i++){
              if(isPrime(i)){
                 System.out.println(i + "");
              }
            }
            System.out.println("");
           
        }
        public static void main(String[] arg){
            inRange(9);
        }
    }
    */
   
   //Binary to Decimal convertor
   /*
   public class fun {
    public static void BinToDec(int binNum){
        int realNum = binNum;
       int power = 0;
       int decVal = 0;
       while(binNum >  0){
         int lastD = binNum % 10;
         decVal = decVal + (int)(lastD * Math.pow(2,power));
         power++;
         binNum = binNum / 10;
       }
       System.out.print("Binary num " + realNum +  "  = " + decVal + "");
    }
    public static void main(String[] args){
       BinToDec(101);
    }
   }
   */