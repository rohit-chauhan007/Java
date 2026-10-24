//palindrome = palindrome is string or sequence that reads the same forward and backward;
import java.util.*;
public class pal {
    public static boolean isPalindrome(String str){
        int n = str.length();
        for (int i = 0; i < n/2; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
   public static void main(String[] arg){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a name to check palindrome");
     String str = sc.nextLine();
     System.out.print(isPalindrome(str));
   }
}

