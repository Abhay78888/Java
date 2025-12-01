package Leetcode;

public class Leetcode1945 {
    public static void main(String[] args) {
        String str="iiii";
        int total =0;
        int k =2;
        for (int i = 0; i <str.length() ; i++) {
            total = total + ((int)str.charAt(i))-96;


        }
        k--;
        int ans =0;



        while(k!=0){
            int sum =0;

            int temp = total%10;
            sum = sum +temp;
            sum=sum/10;
            k--;
            ans = sum;













        }
        System.out.println(ans);
    }
}
