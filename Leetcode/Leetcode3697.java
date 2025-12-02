package Leetcode;
import java.util.ArrayList;

public class Leetcode3697 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(20);
        int n = 102;
        int m = 1;

        while(n>0){
            int digit = n % 10;
            if(digit!=0){
                numbers.add(m*digit);

            }
            m=m*10;
            n=n/10;


        }
        System.out.println(numbers);

    }
}
