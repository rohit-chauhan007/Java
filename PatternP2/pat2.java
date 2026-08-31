//(1)Hollow Triangle
/*

 ****
 *  *
 *  *
 ****

 */
/*
public class Pat2{
    public static void hollow_triangle(int totRows,int totCols){
        for (int i = 1; i <= totRows; i++){
             for (int j = 1; j <= totCols; j++){
                if(i == 1 || i == totRows || j == 1 || j == totCols){
                    System.out.print("*");
                }else{
                     System.out.print(" ");
                }
             }
              System.out.println("");
        }
    }

    public static void main(String[] arg){
      hollow_triangle(4,6);
    }
}
*/

//Inverted & rotated half pyramid
/*
    * row = 1; space = 3; star =1;
   ** row = 2 space = 2; star = 2
  ***
*****
logic
space = n-1
*/
/*
public class Pat2{
    public static void inverted_hPyramid(int tRows){
        for (int i = 1; i <= tRows; i++){
            //space
            for(int j = 1; j <= tRows - i;j++){
                System.out.print(" ");
            }
            for (int j = 1 ; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args){
       inverted_hPyramid(10);
    }
}
*/

//inverted Pyramid with num
/*
1234 
123
12
1
*/
/*
public class Pat2{
    public static void invPyramid_num(int rows){
        
        for (int i = 1; i <= rows; i++){
          for (int j = 1; j <= rows-i+1; j++){
            System.out.print(j);
          }
          System.out.println("");
        }
    }
    public static void main(String[] args){
         invPyramid_num(4);
    }
}
*/

//Floyds triangle
/*1
2 3
4 5 6
7 8 9 10
11 12 23
*/
/*
public class Pat2{
    public static void floyds_triangle(int n){
        int num = 1;
        for(int i = 1;i <= n; i++){
            for(int j = 1; j<=i;j++){
                System.out.print( " " + num );
                num++;
            }
            System.out.println("");
        }

    }
    public static void main(String[] arg){
       floyds_triangle(5);
    }
}
*/
//0-1 triangle 
/*
 1
 0 1 
 1 0 1
 0 1 0 1
 1 0 1 0
 */
/*
public class Pat2{
    public static void zeroOne_triangle(int n){
        for(int i =  1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i+j)%2 == 0){
                    System.out.print(" 1 " );
                }else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println("");
           
        }
    }
    public static void main(String[] arg){
                zeroOne_triangle(5);
    }
}

*/
//Butterfly
/*

*            *
* *        * * 
* * *    * * *  
* * * * * * * *
* * * * * * * * 
* * *     * * *
* *         * *
*             *
*/
public class Pat2{
    public static void butterfly(int n){
        for(int i = 1; i <= n; i++){
            //star
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            //space
            for(int j = 1; j <= 2*(n-i); j++ ){
            System.out.print(" ");
            }
            //star 
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        //copy reverse 
        //star
       for(int i = n; i >= 1; i--){
            //star
            for(int j = i; j >= 1; j--){
                System.out.print("*");
            }
            //space
            for(int j = 1; j <= 2*(n-i); j++ ){
            System.out.print(" ");
            }
            //star 
            for(int j = i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] arg){
        butterfly(4);

    }
}