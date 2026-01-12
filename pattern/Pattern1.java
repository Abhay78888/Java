package Pattern;

public class Pattern1 {
    public static void main(String[] args) {
        pattern(4);

    }
    public static void pattern(int n){
        for (int row = 1; row <=n ; row++) {
            for (int column = 1; column <=n ; column++) {
                System.out.print("*");


            }
            System.out.println();

        }
    }
}
