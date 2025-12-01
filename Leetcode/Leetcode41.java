package Leetcode;

import java.util.Arrays;

public class Leetcode41 {
    public static void main(String[] args) {
        int[] arr={3,4,-1,1};
        Arrays.sort(arr);
        int smallest =1;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==smallest){
                smallest++;
            }
        }
        System.out.println(smallest);
        
    }
}
