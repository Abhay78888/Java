package Leetcode;

import java.util.Arrays;

public class Leetcode1480 {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        int [] ans = new int[arr.length];
        int sum =0;
        for (int i =0;i<arr.length;i++){


            sum=sum + arr[i];
            ans[i]=sum;


        }
        System.out.println(Arrays.toString(ans));
    }
}
