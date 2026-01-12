package JavaBasics;

import java.util.Scanner;
public class Functiond {
    public static void main(String[] args) {
        sum();

    }
    static void sum(){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int s = a+b;
        System.out.println(s);
    }
}
