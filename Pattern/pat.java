//outer loop control the row of line 
//inner loop control the column line

//basic pattern 
/*
print 
* 
**
***
****
// */
// public class pat{
//    public static void main(String[] arg){
//     int exicute = 0;
//         for (int line = 1; line<=5;line++){
//             // System.out.print("outer loop");
//             for (int star =1; star<=line;star++){
//                 // System.out.print("inner loop");
             
//                 exicute++;
//                 System.out.print("*");
//             }
//             System.out.println("");
               
//         }
//         System.out.print("Exicution" + (exicute-1));
//    }
// }

//reverse

// public class pat{
//     public static void main(String[] arg){
//         for (int line = 4; line >= 1; line--){
//             for(int star = 1; star <= line;star++){
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }

//     }
// }
  
  //reverse star pattern with formula
  // n-i+1
 
 /*public class pat{
    public static void main(String[] arg){
         int n = 10;
         for(int line = 1; line <= n; line++){
            for (int star=1;star<=n-line+1; star++){
                 System.out.print("*");
            }
             System.out.println("");
            
         }
        
    }
 }
 */


/*half pyramid 
1
12
123
1234
*/

// public class pat{
//      public static void  main(String[] arg){
//           for(int i = 1; i <= 4; i++){
//                for (int j=1;j<=i;j++){
//                     System.out.print(j);
//                }
//                System.out.println("");
//           }
//      }
// }

/*inverted half pyramid*/
// public  class pat{
    
//      public static void main(String[] arg){
//            int n=4;
//         for (int i = 1; i <=n;i++){
//           for (int j=1; j <= n-i+1; j++){
//                System.out.print(j);
//           }
//           System.out.println("");
//         }
//      }
// }

//charector print

public class pat {
  public static void main(String[] arg){
          char ch = 'A';
       for (int i = 1; i <= 4; i++){
          for(char j = 1; j <=i;j++){
            System.out.print(ch);
            ch++;
          }
          System.out.println("");
       }
  }
}
