package Leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode350 {
    public static void main(String[] args) {
        int [] arr={4,9,5};
        int [] arr1={9,4,9,8,4};
        int k =0;
        int [] result=new int [Math.min(arr.length,arr1.length)];
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr1.length ; j++) {
                if(arr[i]==arr1[j]){
                    result[k]=arr[i];
                    k++;
                    arr1[j] = Integer.MIN_VALUE;
                    break;

                }

            }


        }
        System.out.println(Arrays.toString(result));

        


        


    }
}
