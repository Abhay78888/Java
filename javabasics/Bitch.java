package Array_Practice;

import java.util.Arrays;

public class Bitch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int k =3;
        System.out.println(Arrays.toString(arr));

    }
    public static void ans(int [] arr , int k ){
        int n = arr.length;
        k=k%n;
        exchange(arr,0,n-1);
        exchange(arr,0,k-1);
        exchange(arr,k,n-1);

    }
    public static void exchange(int [] arr , int i , int j ){
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }
    }

}
