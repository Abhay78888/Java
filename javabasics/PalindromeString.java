package JavaBasics;

public class PalindromeString {
    public static void main(String[] args) {
        String str="abcdba";
        System.out.println(check(str));


    }
    public static boolean check(String str){
        str=str.toLowerCase();
        for(int i =0 ; i<str.length();i++){
            char start= str.charAt(i);
            char end = str.charAt(str.length()-i-1);
            if(start!=end){
                return false;
            }
        }
        return true;
    }
}
