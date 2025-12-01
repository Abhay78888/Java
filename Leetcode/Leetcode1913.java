package Leetcode;

import java.util.Arrays;

public class Leetcode1913 {
    public static void main(String[] args) {
        int [] arr={4,2,5,9,7,4,8};
        Arrays.sort(arr);
        int n = arr.length;
        int ans = (arr[n-1]*arr[n-2]) - (arr[0] * arr[1]);
        System.out.println(ans);
    }
}
