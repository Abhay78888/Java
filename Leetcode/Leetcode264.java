package Leetcode;

import java.util.Arrays;

public class Leetcode264 {
    public static void main(String[] args) {
        int n = 10;

        int [] arr=new int[n];
        arr[0]=1;
        int count =1;
        int i =2;
        while(count<n){
            if(ugly(i)){
                arr[count]=i;
                count++;

            }
            i++;
        }
        System.out.println(Arrays.toString(arr));










    }

    public static boolean ugly(int n) {
        if(n<=0){
            return false;
        }
        while(n%2==0){
            n=n/2;
        }
        while(n%3==0){
            n=n/3;
        }
        while(n%5==0){
            n=n/5;
        }
        return n==1;

    }
}
