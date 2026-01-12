package JavaBasics;

import java.util.Scanner;
public class evenoddsum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long N = input.nextLong();
        int odd =0;
        int even = 0;
        String num = String.valueOf(N);
        for (int i = 0; i <num.length() ; i++) {
            int digit = num.charAt(i) - '0';
            if(digit % 2==0){
                even = even + digit;



            }
            else{
                odd = odd;

            }
        }

        System.out.println(odd);
        System.out.println(even);

    }
}
