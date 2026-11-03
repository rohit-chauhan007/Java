//Substring is a methode is use to cut a small part in the string
//There are two Types
//1 substring(startIndex);
//2 substring(si,ei); ending index not include

// public class subs{
//     public static void main(String[] arg){
//        String s1 = "HelloWorld";
//        System.out.println(s1.substring(1));
//        System.out.print(s1.substring(3,6));

//     }
// }

public class subs{
    public static void SubString(String str,int si,int ei){
        String subString = "";
        for(int i = si; i < ei; i++){
            subString += str.charAt(i);
        }
        System.out.print("substring = " + subString);
    }
    public static void main(String[] arg){
        String str = "HelloWorld";
        SubString(str,0,4);
    }
}