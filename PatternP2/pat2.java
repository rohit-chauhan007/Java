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
