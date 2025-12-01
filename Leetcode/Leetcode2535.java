package Leetcode;

public class Leetcode2535 {
    public static void main(String[] args) {
        int [] arr={1,15,6,3};
        int sum=0;
        int sum1=0;
        for (int i = 0; i <arr.length ; i++) {
            sum=sum+arr[i];
            if(arr[i]<10){
                sum1=sum1+arr[i];
            }
            else{
                int n = arr[i];
                while (n>0){
                    int temp = n%10;
                    sum1=sum1+temp;
                    n=n/10;
                }
            }

        }
        System.out.println(sum-sum1);
    }
}
