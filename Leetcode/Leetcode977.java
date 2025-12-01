package Leetcode;

import java.util.Arrays;

public class Leetcode977 {
    public static void main(String[] args) {
        int [] arr={};
        // int [] ans = new int [arr.length];
        for(int i =0;i<arr.length;i++){
            arr [i]=arr[i]*arr[i];
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}

