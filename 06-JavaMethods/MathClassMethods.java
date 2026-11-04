/*
 * This program is used to demonstrate the use of Math class methods in Java.
 * It takes four numbers as input from the user and performs various mathematical operations using Math class methods.
 * The operations include finding power, square root, cube root, random number generation, absolute value, floor, ceiling, maximum and minimum values.
 */

import java.util.Scanner;
public class MathClassMethods{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input1 from user.
        System.out.print("Enter the first no : ");
        double a = sc.nextDouble();
        // Taking input 2 from user.
        System.out.println("Enter the second no : ");
        double b = sc.nextDouble();

        // Taking input 3 from user.
        System.out.println("Enter the third no : ");
        double c = sc.nextDouble();

        // Taking input 4 from user.
        System.out.println("Enter the fourth no : ");
        double d = sc.nextDouble();

        
        // For finding power of a number.
        System.out.println(Math.pow(a, b));

        // For finding Square root of a number.
        System.out.println(Math.sqrt(a));
        
        //For finding cube root fo a number.
        System.out.println(Math.cbrt(a));

        // For finding random number.
        System.out.println(Math.random());

        // For getting number positive only.
        System.out.println(Math.abs(a));

        // For getting a least intiger no of a decimal.
        System.out.println(Math.floor(a));

        // For getting a greater integer of a decimal.
        System.out.println(Math.ceil(a));

        // For getting maximum of the given no 
        System.out.println(Math.max(a, b));

        // For getting minimum of the given no
        System.out.println(Math.min(a, b)); 

        // For getting maximum of the three given no.
        System.out.println(Math.max(a,Math.max(b, c))); 

        // For finding th max of four no .
        System.out.println(Math.max(Math.max(a, b), Math.max(c, d)));

    }
}