// Program to CaLculate the sum of two numbers giveen by the user as Input.

import java.util.*;

public class AddNumbers {
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a : ");
        int a = sc.nextInt();
        System.out.print("Enter the number b : ");
        int b = sc.nextInt();
        int sum = calculateSum(a, b);

        System.out.println("Sum of two numbers is : " + sum);

        sc.close();
    }

}