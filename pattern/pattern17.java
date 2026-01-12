package Pattern;

public class pattern17  {
    public static void main(String[] args) {
        pattern(4);
        System.out.println(" ");
        pattern1(4);

    }

    public static void pattern(int n) {

        n=n*2;

        for (int row = 0; row <=n ; row++) {
            for (int column = 0; column <=n ; column++) {
                int value=Math.min(Math.min(row,column),Math.min(n-row,n-column));
                System.out.print(value+" ");

            }
            System.out.println();

        }

    }
    public static void pattern1(int n) {
        int original=n;
        n=n*2;
        for (int row = 0; row <=n ; row++) {
            for (int column = 0; column <=n ; column++) {
                int value=original-Math.min(Math.min(row,column),Math.min(n-row,n-column));
                System.out.print(value+" ");

            }
            System.out.println();

        }

    }
}
