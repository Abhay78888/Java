package JavaBasics;

import java.util.Scanner;


public class    Casecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input=sc.next().trim().charAt(0);
        if(input>='a' && input<='z'){
            System.out.println("lowercase");
        }
        else {
            System.out.println("Uppercase");
        }

    }
}
