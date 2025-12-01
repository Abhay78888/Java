package Leetcode;

public class Leetcode258 {
    public static void main(String[] args) {
        int num = 38;
        int temp = num;

        while(num>=10){
            int sum =0;
            while(num>0){
                int rem=num%10;
                sum=sum+rem;
                num=num/10;

            }
            num=sum;

        }
        System.out.println(num);




    }


}
