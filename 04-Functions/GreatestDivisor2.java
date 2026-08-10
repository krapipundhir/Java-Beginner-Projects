// Progarm to Find GCD from two nnumber given by user METHOD 2.

import java.util.Scanner;

public class GreatestDivisor2 {
    public static void commonGreatestDivisor(int a, int b) {

        while (b != 0) {
            int remiander = a % b;
            a = b;
            b = remiander;

        }

        System.out.println("GCD is: " + a);
        return;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int First = sc.nextInt();
        System.out.print("Enter Second number: ");
        int Second = sc.nextInt();

        commonGreatestDivisor(First, Second);
        sc.close();
        return;
    }

}
