package Leetcode;

import java.util.Arrays;

public class Leetcode268 {
    public static void main(String[] args) {
        int [] arr={9,6,4,2,3,5,7,0,1};
        Arrays.sort(arr);
        for (int i = 0; i <arr.length-1 ; i++) {
            if (arr[i]+1!=arr[i+1]) {
                System.out.println(arr[i]+1);

            }
            else{
                System.out.println(arr[arr.length-1]+1);
            }


        }
    }
}
