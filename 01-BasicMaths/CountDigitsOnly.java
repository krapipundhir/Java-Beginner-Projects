/*
 * Description:
 * This class provides a method to determine the number of
 * digits in an integer. It uses an iterative approach and
 * basic arithmetic operations without converting the number
 * into a String.
 *
 * Given Number:
 * 123456
 *
 * Output:
 * Number of digits: 6
 */

public class CountDigitsOnly {
    public static int countDigitsOnly(int num){
        int count = 0;
        while(num>0){
            int digit = num % 10;
            count++;
            num = num /10;
        }
        return count;
    }
    public static void main(String args[]){
        int num = 123455;
        int digitCount = countDigitsOnly(num);
        System.out.println("Number of digits: " + digitCount);
    }
}
