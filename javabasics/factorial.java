package JavaBasics;

import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num = input.nextInt();
//        int newVar = 1;
//
//        for (int i=1;i<n;i++){
//            newVar = newVar * i;
        fact(num);



        }
        public static void fact(int n){
            int newVar=1;
            for (int i=1;i<n+1;i++){

                newVar = newVar * i;}
            System.out.println(newVar);;



        }




//        System.out.println(newVar);
    }

