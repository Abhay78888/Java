package Leetcode;

public class Leetcode2894 {
    public static void main(String[] args) {
        int n =5;
        int m =6;
        int count =0;
        int count1=0;
        for (int i = 1; i <=n ; i++) {
            if(i%3!=0){
                count=count+i;
            }
            else{
                count1=count1+i;
            }

        }
        System.out.println(count-count1);

    }
}
