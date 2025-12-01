package Leetcode;

import java.util.Arrays;

public class leetcode189 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7};
        int k =3;
        rotated(arr,k);
        System.out.println(Arrays.toString(arr));



        /*for (int i = 1; i <=k ; i++) {
            int item = arr[n-1];
            for (int j = n-2; j>=0 ; j--) {
                arr[j+1]=arr[j];

            }
            arr[0]=item;


        }
        System.out.println(Arrays.toString(arr));*/


    }

    public static void rotated(int[] arr,int k) {
        int n = arr.length;
        k=k%n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);




    }

    public static void reverse(int[] arr , int i , int j ) {
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }

    }


    public static class Leetocode1832 {
        public static void main(String[] args) {
            String s="abcdefghijklmnopqrstuvwxyz";
            String p = "thequickbrownfoxjumpsoverthelazydog";


                }

            }

    public static class Leetcode1512 {
        public static void main(String[] args) {
            int [] arr={1,1,1,1};
            int n=0;
            for(int i =0;i < arr.length;i++){
                for(int j =1;j<arr.length;j++){
                    if(arr[i]==arr[j] && i<j){
                        n=n+1;

                    }
                }
            }
            System.out.println(n);
        }
    }
}
