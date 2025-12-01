package Leetcode;

import java.util.Arrays;

public class Leetcode238 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(product(arr)));

    }

    public static int[] product(int [] arr) {
        int n = arr .length;
        int [] right=new int [n];
        int [] left=new int[n];
        left[0]=1;
        for (int i = 1; i < n ; i++) {
            left[i]=left[i-1]*arr[i-1];


        }
        right[n-1]=1;
        for (int i = n-2; i>=0 ; i--) {
            right[i]=right[i+1]*arr[i+1];

        }
        for (int i = 0; i <n ; i++) {
            left[i]=left[i]*right[i];

        }
        return left;




    }

    public static class Leetcode1470 {
        public static void main(String[] args) {
            int [] arr={2,5,1,3,4,7};
            int n = arr.length;
            int[] arr1= new int[n];
            for(int i =0;i<n/2;i++){
                arr1[i*2]=arr[i];
                arr1[i*2+1]=arr[i+n/2];
            }
            System.out.println(Arrays.toString(arr1));

        }
    }
}
