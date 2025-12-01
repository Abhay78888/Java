package Leetcode;

public class Leetcode1281 {
    public static void main(String[] args) {
        int n = 234;
        int sum =0;
        int product =1;
        while(n>0){

            int temp = n % 10;
            product = product * temp;
            sum = sum + temp;
            n=n/10;

        }
        System.out.println(product);
        System.out.println(sum);

    }
}
