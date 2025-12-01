package Leetcode;

public class Leetcode121 {
    public static void main(String[] args) {
        int [] arr={7,6,4,3,1};
        int min =arr[0];
        int maxprofit=0;
        for (int i = 1; i <arr.length ; i++) {
            int profit=arr[i]-min;
            if(profit>maxprofit){
                maxprofit=profit;

            }
            if(arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println(maxprofit);

    }
}
