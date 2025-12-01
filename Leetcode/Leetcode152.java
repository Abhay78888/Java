package Leetcode;

public class Leetcode152 {
    public static void main(String[] args) {
        int [] arr={2,3,-2,4};
        int product=1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            product=product*arr[i];
            max=Math.max(product,max);
            if(product==0){
                product=1;

            }


        }
        product=1;
        for (int i = arr.length-1; i >=0 ; i--) {
            product=product*arr[i];
            max=Math.max(product,max);
            if(product==1)
                product=1;

        }
        System.out.println(max);
    }
}
