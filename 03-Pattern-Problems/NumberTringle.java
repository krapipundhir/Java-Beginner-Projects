// Printing the pattern of right angled triangle from 1 2 3 4 5 in the increasing order in every row and always starting nu. will be 1 in every line. 

public class NumberTringle {

    public static void main(String[] args) {
        int m = 5;

        for (int i = 1; i <= m; i++) {
            for (int y = 1; y <= i; y++) {
                System.out.print(y + " ");
            }
            System.out.println();

        }

    }

}
