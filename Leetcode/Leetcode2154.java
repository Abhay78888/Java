package Leetcode;

import java.util.Arrays;

public class Leetcode2154 {
    public static void main(String[] args) {
       int [] arr={5,3,6,1,12};
       int original = 3;
        Arrays.sort(arr);
        int ans =0;
        for (int i = 0; i < arr.length ; i++) {
//            int temp = original;
            if(original == arr[i]){
                original = arr[i]*2;
            }
            ans = original;
        }
        System.out.println(ans);
    }
}
