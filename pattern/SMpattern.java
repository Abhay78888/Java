package Pattern;
import java.util.Scanner;

public class SMpattern {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n = input . nextInt();
        for (int i = 0; i < n/2; ++i) {
            System.out.print(" * ");
            for (int j = 0; j < n + 2; ++j) {
                System.out.print("  ");
                for (int k = 1; k <=j+1 ; ++k) {
                    System.out.print(" * ");


                }
                System.out.println();
                

            }

        }
    }

}

