package Pattern;

import java.sql.SQLOutput;



public class Pattern3 {
    public static void main(String[] args) {
        pattern(5);
        
    }

    public static void pattern(int n) {
        for (int row = 1; row <=n ; row++) {
            for (int  column = 1;  column <= n-row+1 ;  column++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
        
    }
}
