package Leetcode;

import java.util.Arrays;

public class Leetcode88 {
    public static void main(String[] args) {
        int [] arr={1,2,3,0,0,0};
        int [] arr1={2,5,6};
        int m = 3;
        int n = 3;
        for (int i = 0; i <n ; i++) {
            arr[m+i]=arr1[i];

        }
        System.out.println(arr);

        }
}
