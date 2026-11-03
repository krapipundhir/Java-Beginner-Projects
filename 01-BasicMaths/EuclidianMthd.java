/*
 * Program: Euclidean Method for GCD/HCF

 * Author: Krapi
 * 
 * Description:
 * This program finds the Greatest Common Divisor (GCD),
 * also known as the Highest Common Factor (HCF), of two
 * integers using the Euclidean Algorithm.
 *
 * Logic:
 * Repeatedly replace:
 *     a = b
 *     b = a % b
 * until b becomes 0.
 * The final value of a is the GCD/HCF.
 *
 * Example:
 * Input: 24, 12
 * Output: 12
 *
 * Time Complexity: O(log(min(a, b)))
 * Space Complexity: O(1)
 */
public class EuclidianMthd {
    public static int getGCD(int a, int b){
        while(b!=0){
            int tem = a % b;
            a = b ;
            b = tem ;
        }
        return a;
    }
    public static void main(String args[]){
        System.out.print(getGCD(24, 12));
    }
}
