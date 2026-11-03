
/*
 * Description:
 * This program checks whether a given integer is a
 * palindrome number or not. A palindrome number
 * remains the same when its digits are reversed.
 * The program reverses the number using arithmetic
 * operations and compares it with the original number.
 *
 * Given Number:
 * 12321
 *
 * Output:
 * 12321 is a palindrome number.
 */

public class PallindromeNumber {
    public static boolean palindrome(int num) {
        int revNum = 0;
        int originalNum = num;
        while (num > 0) {
            revNum = revNum * 10 + num % 10;
            num = num / 10;
        }
        return revNum == originalNum;
    }
    public static void main(String args[]) {

        int num = 12321;
        boolean isPalindrome = palindrome(num);
        
        if (isPalindrome) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
    }
}
