package Leetcode;

public class Leetcode231 {
    public static void main(String[] args) {
        int n = 72;
        System.out.println(power(n));

    }

    public static boolean power(int n) {
        if(n<=0){
            return false;
        }
        while(n>1){
            if(n%2!=0){
                return false;
            }

            n=n/2;
        }
        return true;

    }
}
