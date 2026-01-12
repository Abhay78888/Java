package Array_Practice;

import java.util.Arrays;

public class Arrayshufflling {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int [] arr1 = new int[6];

        int n=arr.length;
        for (int i =0 ; i<n/2 ; i++){
            arr1[2*i]=arr[i];
            arr1[(2*i+1)]=arr[i+n/2];

        }
        System.out.println(Arrays.toString(arr1));
    }
}
