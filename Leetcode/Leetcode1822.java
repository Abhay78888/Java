package Leetcode;

public class Leetcode1822 {
    public static void main(String[] args) {
        int[] arr={-1,1,-1,1,-1};
        int product=1;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==0){
                System.out.println(0);;
            }
            else if(arr[i]>0){
                product=product*1;
            } else if (arr[i]<0) {
                product=product*(-1);

            }

        }
        System.out.println(product);


    }

}
