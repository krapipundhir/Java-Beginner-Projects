/**
 * Program: Print Prime Numbers from 2 to N
 *
 * Description:
 * This program prints all prime numbers from 2 up to a given number N.
 * It checks each number for divisibility up to its square root to
 * efficiently determine whether the number is prime.
 *
 * Algorithm:
 * 1. Iterate through numbers from 2 to N.
 * 2. For each number, check divisibility from 2 to √N.
 * 3. If no divisor is found, the number is prime.
 * 4. Print the prime number.
 *
 * Time Complexity: O(N√N)
 * Space Complexity: O(1)
 *
 * Author: Krapi Pundhir
 */
public class PrintAllPrime {
    public static void printPrime(int n) {
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {

                if (i % j == 0) {
                    count++;
                    break;
                }

            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String args[]) {
        int n = 100;
        printPrime(n);
    }
}
