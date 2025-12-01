package Leetcode;

public class Leetcode1832 {
    public static void main(String[] args) {
       // String str = new String("abcdefghijklmnopqrstuvwxyz");
        String str1 = new String("thequickbrownfoxjumpsoverthelazydog");
        str1=str1.toLowerCase();
        boolean[] arr=new boolean[26];
        for (int i = 0; i <str1.length() ; i++) {
            char ch = str1.charAt(i);
            if(ch>='a' && ch<='z'){
                arr[ch-'a']=true;
            }
        }
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==false){
                System.out.println("false");
            }


        }
        System.out.println(true);


    }

}
