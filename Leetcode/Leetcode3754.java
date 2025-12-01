package Leetcode;

public class Leetcode3754 {
    public static void main(String[] args) {
        int n = 10203004;
        int sum = 0;
        int n1=0;
        while(n>0){
            int temp = n %10;
            if(temp!=0){
                sum = sum + temp;
                n1=n1*10+temp;

            }
            n = n /10;
        }
        String strNumber = String.valueOf(n1); // Convert int to string
        StringBuilder sb = new StringBuilder(strNumber);
        String reversedStr = sb.reverse().toString(); // Reverse the string

        int reversedInt = Integer.parseInt(reversedStr);
        System.out.println(reversedInt*sum);

    }
}
