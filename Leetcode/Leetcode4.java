package Leetcode;

import java.util.Arrays;

public class Leetcode4 {
    public static void main(String[] args) {
        int [] arr1={1,2};
        int[] arr2={3,4};
        int m = arr1.length;
        int n =arr2.length;
        int k=0;
        int [] answer= new int [m+n];
        for (int i = 0; i < answer.length ; i++) {
            if(i<m){
                answer[i]=arr1[i];
            }
            else{
                answer[i]=arr2[k];
                k++;
            }

        }
        System.out.println(Arrays.toString(answer));
        Arrays.sort(answer);
        int a=answer.length;
        int start=0;
        int end = answer.length-1;
        int mid = start+(end-start)/2;

        if(a%2!=0){
            System.out.println(answer[mid]);

        }
        else{
            System.out.println(answer[mid]+answer[mid+1]);
        }

        System.out.println(Arrays.toString(answer));
    }
}
