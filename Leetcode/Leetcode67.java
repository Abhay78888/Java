package Leetcode;

public class Leetcode67 {
    public static void main(String[] args) {
        String str="11";
        String str1="1";
//      String result=converter(str,str1);
//      System.out.println(result);





    }
    public static String converter1(String str,String str1){
        String result="";
        int i =str.length()-1;
        int j = str1.length()-1;
        int carry =0;
        while(i>=0||j>=0||carry==1){
            int sum = carry;
            if(i>=0){
                sum = sum + str.charAt(i)-'0';
                i--;
            }

            if(j>=0){
                sum = sum + str1.charAt(j)-'0';
                j--;
            }
            result= (sum%2) + result;
            carry = sum /2;



        }
        return result;

    }




}
