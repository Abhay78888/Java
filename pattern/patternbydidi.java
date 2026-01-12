package Pattern;

public class patternbydidi {
    public static void main(String[] args) {
        pattern(5);

    }

    public static void pattern(int n) {
        for (int row = 1; row <=n ; row++) {
            for (int column = 1; column <=n-row+1 ; column++) {
                System.out.print("*" + " ");

            }
            System.out.println();

        }
        for(int row=2;row<=n;row++){
            for (int column = 2; column <=row+1; column++) {

                System.out.print("*" + " ");

            }
            System.out.println();
        }

    }
}
