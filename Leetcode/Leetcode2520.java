package Leetcode;

public class Leetcode2520 {
    public static void main(String[] args) {
        int n = 121;
        int m = n;
        int count=0;
        while(n>0){
            int temp = n %10;
            if(m%temp==0){
                count++;
            }
            n=n/10;

        }
        System.out.println(count);
    }
}
