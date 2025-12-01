package Leetcode;

import java.util.Arrays;

public class Leetcode3745 {
    public static void main(String[] args) {
        int [] arr={1,4,2,5};
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        int max2=arr[arr.length-2];
        int min=arr[0];
        System.out.println((max+max2)-min);

    }
}
