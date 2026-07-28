// Inverted Half Pyramid rotaed by 180 degree.

public class problem4 {
    public static void main(String args[]) {
        int m = 4;
        // Outer loop for rows.
        for (int j = 1; j <= m; j++) {
            // Inner loop for spaces.
            for (int i = 1; i <= m - j; i++) {
                System.out.print(" ");
            }
            // Loop for Stars.
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
