//String methods 
/*1.Length() = Use to count total charector in string
2 charAt(index) - find charector by the index 
3.concat("kumar") - add two string in given string
4.equals() = use to compare two string content
5.toUpperCase() = convert string into upperCase;
6.toLowerCase() = convert string into lowerCase;
7.subString(startingIndex,endIndex) = ek chhota sa part cut krta hai

*/

public class string{
    public static void main(String[] arg){
        String name = "Rohit";
        System.out.println(name.length());//5
        System.out.println(name.charAt(2));//h
        System.out.println(name.equals("Rohit"));//true
        System.out.println(name.concat(" Kumar "));//Rohit Kumar
        System.out.println(name.toUpperCase());//ROHIT
        System.out.println(name.toLowerCase());//rohit
        System.out.println(name.substring(1,5));//ohit
    }
}
