public class spiral{
    public static void spiralMatrix(int matrix[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        System.out.println(" endrOW = " + endRow);
        while(startRow <= endRow && startCol <= endCol){
            //top
         for(int j = startCol; j <= endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
         };
         //right
         
         for(int i = startRow+1; i <= endCol; i++){
           
            System.out.print(matrix[i][endCol] + " ");

         };
          //bottom
         
          for (int j = endCol-1; j>=startCol; j--){
            System.out.print(matrix[endRow][j] + " ");
          };
       //left
       for (int i = endRow-1; i > startRow; i--){
        System.out.print(matrix[i][startRow] + " ");
       }
         startRow++;
         startCol++;
         endRow--;
         endCol--;
         
        }
         
    }
    public static void main(String[] arg){
       int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
       spiralMatrix(matrix);
    }
}