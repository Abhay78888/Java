package JavaBasics;

import java.util.Scanner;
public class occurence {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int n=input.nextInt();
        int n2=input.nextInt();
        int count=0;
        while (n>0){
            int m = n%10;
            if (m==n2){
                count++;
            }
            n= n/10;


        }
        System.out.println(count);




    }
}
