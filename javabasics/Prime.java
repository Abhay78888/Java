package JavaBasics;

import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner ( System.in);
        int n = input.nextInt();
        boolean check = isprime(n);
        System.out.println(check);

    }
    static boolean isprime(int n){
        if (n<2){
            return false;
        }
        int c=2;
        while (c*c<=n){
            if(n%c==0){
                return false;

            }
            c++;
        }
        return true;
    }
}
