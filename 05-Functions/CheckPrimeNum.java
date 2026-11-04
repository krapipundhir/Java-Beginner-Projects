// Program to Check The Num that is given by the User as a Input is a Prime num or Not.

import java.util.*;

public class CheckPrimeNum {
    public static void checkPrimeNum(int n) {
        if (n <= 1) {
            System.out.print("It's not a prime Number.");
            return;
        }
        int count = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
                break;

            }
        }
        if (count == 0) {

            System.out.print("It's a Prime Number.");

        } else {
            System.out.print("It's not a Prime Number.");
        }

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n : ");
        int n = sc.nextInt();
        checkPrimeNum(n);
        sc.close();

    }

}
