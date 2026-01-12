package Array_Practice;

import java.util.Arrays;

public class Medianoftwosorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[] arr1={7,8,9,10,11,12};
        int [] arr2=new int[arr.length+arr1.length];
        for (int i = 0; i <arr.length ; i++) {
            arr2[i]=arr[i];

        }
        for (int i = 0; i <arr1.length ; i++) {
            arr2[i+arr.length]=arr1[i];

        }
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        double median;

        if(arr2.length % 2 != 0){
            median = arr2[arr.length/2];




        }
        else{
            median = (arr2[arr.length/2]+arr2[arr.length/2 -1])/2.0;



        }
        System.out.println(median);

    }
}
