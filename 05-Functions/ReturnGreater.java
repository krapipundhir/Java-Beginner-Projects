// Program to Return Greater number from the two numbers given by the user as input.

import java.util.Scanner;

public class ReturnGreater {
    public static void printGreaterOne(int a, int b) {
        if (a > b) {
            System.out.print(a);

        } else if (b > a) {
            System.out.print(b);
        } else {
            System.out.print("Both are equal.");
        }
        return;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a : ");
        int a = sc.nextInt();

        System.out.print("Enter the number b : ");
        int b = sc.nextInt();

        printGreaterOne(a, b);

    }

}
