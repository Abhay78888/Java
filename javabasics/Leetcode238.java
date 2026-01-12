package Array_Practice;

import java.util.Arrays;

public class Leetcode238 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int product = 1;
        int [] brr = new int [5];
        for (int i = 0; i < arr.length; i++) {

            product = product * arr[i];




        }
        for (int i = 0; i <arr.length ; i++) {
            brr[i]=product/arr[i];


        }
        System.out.println(Arrays.toString(brr));


    }
}
