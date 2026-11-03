
/*
 * Description:
 * This program extracts and prints the digits of a number
 * one by one using modulo (%) and division (/) operations.
 *
 * Input:
 * 12345
 *
 * Output:
 * 5
 * 4
 * 3
 * 2
 * 1
 */

import java.util.Scanner;
public class BasicMaths {
    public static void printNumberOneByOne(int num){
        while(num>0){
            int digit = num % 10;
            System.out.println(digit);
            num = num /10;
        }
    }
    public static void main(String args[]){
        int num = 12345;
        printNumberOneByOne(num);
    }
}
