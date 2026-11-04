// Progarm to Print Fibonacci Series of num given by the user.

import java.util.*;

public class FibonacciSeries {
    public static void printFibonnaciseries(int n) {
        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFibonnaciseries(n);
        sc.close();

    }
}