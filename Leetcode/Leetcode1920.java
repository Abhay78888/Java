package Leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode1920 {
    public static void main(String[] args) {
        int [] arr={0,2,1,5,3,4};
        int [] answer = new int [arr.length];
        for (int i = 0; i <answer.length ; i++) {
            answer[i]=arr[arr[i]];

        }
        System.out.println(Arrays.toString(answer));
    }
}
