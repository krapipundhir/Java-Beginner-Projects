// Print a Solid Rhombus.

public class Rhombus {

    public static void main(String args[]) {
        int m = 4;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= m; j++) {

                System.out.print("* ");
            }
            System.out.println();

        }

    }

}
