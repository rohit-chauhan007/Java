//Rapping rain water 
//condition
//(1)bars height can not be in acceding or deccending order
//(2)Bars should be min 3 for trap rain water
//1 st leftMax 
//2 right Max
/*
import java.util.*;
public class trw{
  public static int trapRainWater(int height[]){
    int[] leftMax = new int[height.length];
    int[] rightMax = new int[height.length];
    int waterLevel = 0;
     //left max 
     leftMax[0] = height[0];
     for (int i = 1; i < height.length; i++){
      leftMax[i] = Math.max(leftMax[i-1],height[i]);
     }
     //right max
     rightMax[height.length-1] = height[height.length-1];
     for (int i = height.length-2; i>=0; i--){
      rightMax[i] = Math.max(rightMax[i+1],height[i]);
     }

     int trapWater = 0;
     for (int i=0; i<height.length;i++){
        waterLevel = Math.min(leftMax[i],rightMax[i]);
        trapWater += waterLevel - height[i];
     }
     return trapWater;
  }
  public static void main(String[] arg){
    int[] height = {4,2,0,3,2,5};
     int trapWater =  trapRainWater(height);
    System.out.print(trapWater);
      }
}
*/
import java.util.*;
public class trw{
  public static int trapRainWater(int height[]){
    int n = height.length;
    int l = 0;
    int r = n-1;
    int lMax = 0;
    int rMax = 0;
    int ans = 0;
    while(l<r){
        lMax = Math.max(lMax,height[l]);
        rMax = Math.max(rMax,height[r]);

        if(lMax<rMax){
          ans += lMax - height[l];
          l++;
       }else{
        ans += rMax - height[r];
        r--;
       }
       
    }
    return ans;
  }
  public static void main(String[] arg){
    int[] height = {4,2,0,10};
    int trap = trapRainWater(height);
    System.out.print(trap);
  }
}