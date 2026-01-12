package Search;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr={5,3,-7,4,8,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void sort(int [] arr) {
        int i =0;
        int mini=i;
        for (int j = i+1; j <arr.length ; j++) {
            if(arr[j]<arr[j+1]){
                mini=j;
            }

        }


    }

}
