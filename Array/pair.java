//pairs of an array 
//[2,3,4,5,6]
//(2,3)(2,4)(2,5)(2,6)
//(3,4)(3,5)(3,6)
//(4,5)(4,6)
//(5,6)

public class pair{
    public static void pairNum(int num[]){
        for (int i = 0; i < num.length; i++){
            int curr = num[i];
            for (int j = i+1; j < num.length; j++){
                System.out.print("(" + curr +   "," + num[j] + ")");
            }
              System.out.println("");
        }
      
    }
    public static void main(String[] arg){
        int num[] = {2,3,5,6,7,3,4,5,6};
        pairNum(num);
        
    }
}