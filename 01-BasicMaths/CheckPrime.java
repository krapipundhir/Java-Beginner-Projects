/*
 * Description:
 * This program checks whether a given number is prime or not.
 * A prime number is a positive integer greater than 1 that
 * has exactly two factors: 1 and itself. The program tests
 * divisibility from 2 up to the square root of the number
 * for efficient prime number checking.
 *
 * Given Number:
 * 17
 *
 * Output:
 * 17 is a prime number.
 */
import java.util.Scanner;
public class CheckPrime {
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n)  /*We can write this Math.sqrt(n) like this >>    i*i<=n  */ ; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int n = 17;
        if(isPrime(n)){
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
