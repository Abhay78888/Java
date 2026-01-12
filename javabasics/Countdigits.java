package JavaBasics;

import java.util.Scanner;
public class Countdigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int digit=input.nextInt();

        int total = check(N,digit);
        System.out.println(total);


    }

    public static int check(int N , int digit ){
        int total=0;
        while(N>0){
            int rem = N%10;
            if(rem == digit){
                total = total +1;

            }
            N = N /10;


        }
        return total;

    }

}
