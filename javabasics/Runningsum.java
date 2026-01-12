package Array_Practice;

import java.util.Arrays;

public class Runningsum {
    public static void main(String[] args) {
        int sum =0;

        int[] arr = {1,2,3,4,5};
        int [] result = new int[arr.length];
        for (int i =0 ; i<5  ; i++){
            sum=sum +arr[i];
            result[i]=sum;

        }
        System.out.println(Arrays.toString(result));

    }
}
