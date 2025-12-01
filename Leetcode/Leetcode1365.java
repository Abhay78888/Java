package Leetcode;

import java.util.Arrays;

public class Leetcode1365 {
    public static void main(String[] args) {
        int[] arr={8,1,2,2,3};
        int [] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int n =0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]>arr[j]) {
                    n++;
                }
            ans[i]=n;


            }

        }
        System.out.println(Arrays.toString(ans));
    }
}
