package JavaBasics;

import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        int r=input.nextInt();
        double area=(3.14*r*r);
        System.out.println(area);

    }
}
