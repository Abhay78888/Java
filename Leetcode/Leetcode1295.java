package Leetcode;

public class Leetcode1295 {
    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};
       int ans =0;
        for(int i =0;i<arr.length;i++){
            int count =0;
            int n=arr[i];
            while(n>0){
                n=n/10;
                count++;

            }
            if(count%2==0){
                ans++;

            }
        }
        System.out.println(ans);



    }




}
