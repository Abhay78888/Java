package Pattern;

public class Pattern4 {
    public static void main(String[] args) {
        pattern(5
        );

    }

    public static void pattern(int n) {
        for (int row = 1; row <=n ; row++) {
            for (int column = 1; column <=row ; column++) {
                System.out.print(column+" ");

            }
            System.out.println();

        }

    }
}
