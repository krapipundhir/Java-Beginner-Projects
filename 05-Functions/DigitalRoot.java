/**
 * Problem: Digital Root / Add Digits (LeetCode 258)
 * Approach: Mathematical O(1) Time & Space Complexity
 * 
 * Description:
 * Repeatedly add all digits of a number until the result has only one digit.
 * This utilizes the Digital Root concept based on modulo 9 arithmetic.
 */

public class DigitalRoot {
    public int digitalRoot(int num) {
        if(num<10)return num;
        if(num%9==0)return 9;
        return num%9;
    }
    public static void main(String[] args) {
        int num = 12;
        DigitalRoot object = new DigitalRoot();
        System.out.println(object.digitalRoot(num));
    }
}
