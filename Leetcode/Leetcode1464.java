package Leetcode;

import java.util.Arrays;

public class Leetcode1464 {
    public static void main(String[] args) {
        int [] arr={1,5,4,5};
        Arrays.sort(arr);
        int n = arr.length;
        int ans=(arr[n-1]-1)*(arr[n-2]-1);
        System.out.println(ans);
    }
}
