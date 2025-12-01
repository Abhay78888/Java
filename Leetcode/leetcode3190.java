package Leetcode;

public class leetcode3190 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int count = 0;
        for (int i = 0; i <arr.length ; i++) {
            if((arr[i]+1)%3==0 || (arr[i]-1)% 3==0){
                count ++;
            }


        }
        System.out.println(count);
    }
}
