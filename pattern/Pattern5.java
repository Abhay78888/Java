package Pattern;

public class Pattern5 {
    public static void main(String[] args) {
        half(5);

    }

    public static void half(int n) {
        for (int row = 0; row <2*n ; row++) {
            int totalcol=row>n ? 2*n-row :row;


            for (int column = 0; column < totalcol ; column++) {


                System.out.print("* ");

            }
            System.out.println();

        }


    }
}
