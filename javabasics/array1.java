package JavaBasics;

import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr= new int[5];
        for (int i=0 ; i<arr.length ; i++){
            arr[i]=input.nextInt();
        }
        for (int i=0 ; i<(arr.length)/2 ; i=i+1){
            System.out.print(arr[i] + " ");
        }



    }
}
