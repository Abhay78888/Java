package Leetcode;

public class Leetcode198 {
    public static void main(String[] args) {
        int [] arr={2,7,9,3,1};
        int sum =0;

        for (int i = 0; i <arr.length ; i=i+2) {
            sum = sum + arr[i];





        }
        if(arr.length==2){
            if(arr[0]>arr[1]){
                System.out.println(arr[0]);
            }
            else {
                System.out.println(arr[1]);
            }

        }
        else if (arr.length==1){
            System.out.println(arr[0]);
        }
    }
}
