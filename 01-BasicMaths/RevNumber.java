/*
 * Description:
 * This program reverses a given integer using arithmetic
 * operations. It repeatedly extracts the last digit of
 * the number and builds the reversed number by placing
 * each extracted digit in its correct position.
 *
 * Given Number:
 * 12345
 *
 * Output:
 * Reversed number: 54321
 */
import java.util.Scanner;

public class RevNumber {
    public static int reverseNumber(int num) {
        int rev = 0;
        while (num > 0) {

            rev = rev * 10 + num % 10;
            num = num / 10;

        }
        return rev;
    }

    public static void main(String args[]) {
        int num = 12345;
        int reversed = reverseNumber(num);
        System.out.println("Reversed number: " + reversed);
    }
}
