//String function compare 
//.without new keyword string point/assign as old value 
//.with new keyword string assign new value so == not return true 

public class comp {
    public static void main(String[] arg){
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String ("Tony");

        if(s1 == s2){
           System.out.println("String is equal");
        }else{
            System.out.print("String is not equal");
        };
          if(s1.equals(s3)){
           System.out.println("String is equal");
        }else{
            System.out.println("String is not equal");
        }


    }
}