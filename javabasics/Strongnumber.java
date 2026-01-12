package JavaBasics;

import java.util.Scanner;
public class Strongnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n = input . nextInt();
        int sum =0;

        int temp = n;



        while(temp>0){
            int rem=temp%10;
            int fact=1;
            for (int i = 1; i <= rem; i++) {
               fact= fact*i;

            }
            sum = sum+ fact;
            temp = temp/10;

        }
        if(n==sum){
            System.out.println("strong number");

        }
        else{
            System.out.println("not armstrong");
        }

    }
}
