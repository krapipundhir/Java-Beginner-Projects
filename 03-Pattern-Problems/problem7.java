// Printing the inverse pattern of right angled triangle from 1 2 3 4 5.

public class problem7 {
    public static void main(String args[]) {
        int m = 5;
        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= m - i + 1; j++) {

                System.out.print(j + " ");

            }
            System.out.println();

        }

    }

}
