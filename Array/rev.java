//reverse an use swappingg method
public class rev{
    public static void reverseArray(int num[]){
        int firstInd = 0;
        int lastInd = num.length-1;
        while(firstInd < lastInd){
            int temp = num[firstInd];
            num[firstInd] = num[lastInd];
            num[lastInd] = temp;
            firstInd++;
            lastInd--;
          
        }
    }
    public static void main(String[] arg){
        int num[] = {2,3,4,5,6,7,8};
        reverseArray(num);
        for(int i = 0; i <num.length;i++){
            System.out.print(num[i]);
        }
    }
}