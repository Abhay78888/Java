package Leetcode;

import java.util.Arrays;

public class Leetcode66 {
    public static void main(String[] args) {
        int [] arr = { 9,9,9};

        int n = arr.length;

        int digit = 0;
        for (int i = 0; i < n ; i++) {
            digit=digit*10+arr[i];

        }
        digit=digit+1;
        int [] brr = new int[n];
        int temp = digit;

        for (int i = n-1; i >=0 ; i--) {

            brr[i]=temp % 10;
            temp = temp/10;




        }
        if(temp>0){
            int[] ans = new int [n+1];
            ans[0]=temp;
            for (int i = 1; i <=n ; i++) {
                ans[i]=brr[i-1];

            }
            System.out.println(Arrays.toString(ans));


        }
        else{
            System.out.println(Arrays.toString(brr));
        }




    }

}
