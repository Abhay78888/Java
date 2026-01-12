package JavaBasics;

import java.util.Scanner;
public class Conditional1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int sum =0;
        int n = input.nextInt();

        while (n != 0) {
            sum += n;
            //System.out.print("Enter 0");
            n = input.nextInt();
        }
        System.out.println(sum);
    }
}
