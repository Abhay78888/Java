package Leetcode;

public class Leetcode1952 {
    public static void main(String[] args) {
        int n = 4;
        int count =0;
        for (int i = 1; i <n+1 ; i++) {
            if(n%i==0){
                count ++;
            }

        }
        if(count ==3){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
