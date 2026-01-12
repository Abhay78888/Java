package Search;
import java.util.*;

public class Insertionsort {
    public static void main(String[] args) {
        int [] arr={5,3,4,1,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertion(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }

            }

        }
    }
    public static void swap(int[] arr,int start , int last){
        int temp = arr[start];
        arr[start]=arr[last];
        arr[last]=temp;
    }
}
