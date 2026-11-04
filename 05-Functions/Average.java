// Program to find the Average of Two Numbers given by the User as the input.

import java.util.*;

public class Average {
    public static void printAverage(int a, int b, int c) {

        int average = (a + b + c) / 3;

        System.out.println("This is the average of these numbers : " + average);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number a : ");
        int a = sc.nextInt();

        System.out.print("Enter the number b : ");
        int b = sc.nextInt();

        System.out.print("Enter the number c : ");
        int c = sc.nextInt();

        printAverage(a, b, c);

    }

}
