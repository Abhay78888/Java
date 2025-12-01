package Leetcode;

import java.util.Arrays;

public class Leetcode628 {
    public static void main(String[] args) {
        int [] arr={1,2,3};
        Arrays.sort(arr);
        int n = arr.length;
        int ans = arr[n-1] * arr[n-2]*arr[n-3];
        int ans1=arr[0]*arr[1]*arr[n-1];
        System.out.println(Math.max(ans,ans1));




    }
}
