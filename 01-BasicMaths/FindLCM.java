/*
 * Program: FindLCM.java
 * Author: Krapi
 * 
 * Description:
 * This program calculates the Least Common Multiple (LCM)
 * of two integers using the Highest Common Factor (HCF/GCD).
 *
 * Approach:
 * 1. Find the HCF using the Euclidean Algorithm.
 * 2. Apply the formula:
 *      LCM = (a × b) / HCF
 * 3. Return and display the calculated LCM.
 *
 * Input:
 * Two integer values.
 *
 * Output:
 * LCM of the given integers.
 *
 * Time Complexity: O(log(min(a, b)))
 * Space Complexity: O(1)
 */

public class FindLCM {
    public static int getHCF(int a, int b) {
        while(b!= 0){
            int temp = a % b;
            a = b;
            b = temp;
        }
        
        return a;
    }
    public static int getLCM(int a, int b){
        int hCF = getHCF(a, b);
        int lCM = a*b/hCF;
        return lCM;
    }
    public static void main(String args[]){
        
        System.out.println(getLCM(5, 6));
    }
    
}
