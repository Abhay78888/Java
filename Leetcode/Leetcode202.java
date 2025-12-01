package Leetcode;

public class Leetcode202 {
    public static void main(String[] args) {
        System.out.println(ishappy(19));



    }

    public static int sum(int n ) {
        int sum =0;
        while(n>0){
            int temp = n % 10 ;
            sum = sum + temp * temp;
            n = n /10;

        }
        return sum;


    }

    public static boolean ishappy(int n ) {
        while(n!=1 && n!=4){
            n = sum(n);

        }
        return n ==1;


    }

}
