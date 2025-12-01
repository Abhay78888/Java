package Leetcode;

public class Leetcode389 {
    public static void main(String[] args) {
        String str = "abcd";
        String str1= "abcde";
        int xor = 0;
        for (int i = 0; i < str.length() ; i++) {
            xor = xor ^ str.charAt(i);

        }
        for (int i = 0; i <str1.length() ; i++) {
            xor = xor ^ str1.charAt(i);

        }

        System.out.println((char)xor);
        
    }
}
