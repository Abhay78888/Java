package Leetcode;

import java.util.Arrays;

public class Leetcode1431 {
    public static void main(String[] args) {
        int[] arr={2,3,5,1,3};
        boolean[] ans=new boolean[arr.length];
        int n = 3;
        int max =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        for(int i =0 ; i<arr.length;i++){
            if(arr[i]+n>max){
                ans[i]=true;
            }
            else{
                ans[i]=false;
            }
        }
        System.out.println(Arrays.toString(ans));

    }
}
