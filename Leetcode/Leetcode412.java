package Leetcode;

import java.util.Arrays;

public class Leetcode412 {
    public static void main(String[] args) {
        int n = 4;
        String [] ans= new String[n];
        for (int i = 1; i <=n ; i++) {
            if(i%3==0 && i%5==0){
                ans[i-1]="Fizzbuzz";
            }
            else if(i%3==0){
                ans[i-1]="Fizz";
            }
            else if(i%5==0){
                ans[i-1]="Buzz";
            }
            else{
                ans[i-1]=String.valueOf(i);
            }


        }
        System.out.println(Arrays.toString(ans));
    }
}
