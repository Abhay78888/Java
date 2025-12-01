package Leetcode;

import java.util.Arrays;

public class Leetcode1929 {
    public static void main(String[] args) {
        int [] arr={1,2,1};
        int[] ans = new int[arr.length*2];
        for (int i =0;i<ans.length/2;i++){


            ans[i]=arr[i];
            ans [i+arr.length]=arr[i];

        }
        System.out.println(Arrays.toString(ans));

    }
}
