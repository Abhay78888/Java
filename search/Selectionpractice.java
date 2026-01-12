package Search;

import java.util.Arrays;

public class Selectionpractice {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void selection (int [] arr){
        for (int i = 0; i <arr.length ; i++) {
            int last=arr.length-i-1;
            int start=0;
            int maxindex=maxelement(arr,start,last);
            swap(arr,maxindex,last);

        }

    }
    public static int maxelement(int [] arr , int start , int end){
        int max=start;
        for (int i = start; i <=end ; i++) {
            if(arr[max]<arr[i]){
                max=i;

            }

        }
        return max;
    }
    public static void swap(int [] arr,int first,int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

}
