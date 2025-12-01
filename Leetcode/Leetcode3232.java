package Leetcode;

public class Leetcode3232 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,14};
        int count =0;
        int count1=0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<=9){
                count = count + arr[i];



            }
            else if(arr[i]>9){
                count1=count1+arr[i];
            }

        }
        if(count==count1){
            System.out.println("false");
        }
        else {
            System.out.println("true");
        }

    }
}
