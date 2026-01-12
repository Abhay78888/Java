package JavaBasics;

import java.util.Scanner;
public class Sumofnnumber {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int sum =0;
        for (int i =0;i<=n;i++){
            sum = i +sum;

        }
        System.out.println(sum);
    }
}
