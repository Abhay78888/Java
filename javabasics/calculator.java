package JavaBasics;

import java.util.Scanner;

public class calculator {
        public static void main(String[] args) {
            Scanner input=new Scanner (System.in);
                while(true) {

                    char op = input.next().trim().charAt(0);
                    if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                        System.out.println("enter the numbers");
                        int n1 = input.nextInt();
                        int n2 = input.nextInt();
                        int ans = 0;

                        if (op == '+') {
                            ans = n1 + n2;

                        }
                        if (op == '-') {
                            ans = n1 - n2;
                        }
                        if (op == '*') {
                            ans = n1 * n2;
                        }
                        if (op == '/') {
                            if (n2 != 0) {
                                ans = n1 / n2;
                            }


                        }
                    }


                }}}
