package Leetcode;

import java.util.Arrays;

public class Leetcode414 {
    public static void main(String[] args) {
        int [] arr={3,2,1};
        Arrays.sort(arr);
        int n = arr.length;
        int unique=1;
        for (int i = n-2; i>=0 ; i--) {
            if(arr[i]!=arr[i+1]){
                unique++;
                if(unique==3){
                    System.out.println(arr[i]);
                }

            }

        }
        System.out.println(arr[n-1]);

    }
}
