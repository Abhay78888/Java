package Pattern;

public class Pattern28 {
    public static void main(String[] args) {
        pattern(5);

    }

    public static void pattern(int n) {
        for (int row = 0; row< 2 * n  ; row++) {
            int totalc=row > n ? 2 * n - row : row;
            int total=n-totalc;
            for (int spaces = 0; spaces < total; spaces++) {
                System.out.print(" ");

            }
            for (int column = 0; column <totalc ; column++) {
                System.out.print("* ");


            }
            System.out.println();

        }

    }
}
