package Leetcode;

public class Leetcode728 {
    public static void main(String[] args) {
        int left =1;
        int right=22;
        for (int i = left; i <=right ; i++) {
            int num = i;
            boolean divisible = true;
            while(num>0){
                int digit=num%10;
                if(digit==0 || i%digit!=0){
                    divisible=false;
                    break;
                }
                num = num /10;

            }
            if(divisible==true){
                System.out.println(i);
            }



        }
    }

}
