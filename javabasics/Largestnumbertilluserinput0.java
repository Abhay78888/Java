package JavaBasics;

import java.util.Scanner;
public class Largestnumbertilluserinput0 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int a=0;
        while (n!=0){

            if(n>a){
                a=n;
                n=input.nextInt();
            }


        }
        System.out.println(a);

    }
}
