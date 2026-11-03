/*
 * ------------------------------------------------------------
 *              Armstrong Number Checker
 * ------------------------------------------------------------
 * Author  : Krapi
 * Language: Java
 *
 * Description:
 * This program checks whether a given number is an
 * Armstrong Number or not.
 *
 * An Armstrong Number is a number that is equal to the
 * sum of the cubes of its digits.
 *
 * Example:
 *      Number: 153
 *      Calculation:
 *      1³ + 5³ + 3³
 *      = 1 + 125 + 27
 *      = 153
 *
 * Since the sum of the cubes of its digits is equal to
 * the original number, 153 is an Armstrong Number.
 *
 * Approach:
 * 1. Store the original number.
 * 2. Extract each digit using the modulus (%) operator.
 * 3. Find the cube of each digit and add it to a sum.
 * 4. Remove the last digit using integer division (/).
 * 5. Compare the calculated sum with the original number.
 * 6. Return true if they are equal; otherwise return false.
 *
 * Input:
 *      An integer number.
 *
 * Output:
 *      true  -> Armstrong Number
 *      false -> Not an Armstrong Number
 *
 * Time Complexity : O(d)
 * Space Complexity: O(1)
 * where d = number of digits.
 * ------------------------------------------------------------
 */
public class ArmStrongNumber {
    public static boolean isArmStrong(int num){
        int sum =0;
        int originalNum = num;
        while(num!=0){

            int digit = num%10;
            int cuboidOfDigit = digit*digit*digit;
            sum +=cuboidOfDigit;
            num = num/10;
        }
        if(sum == originalNum){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        System.out.println(isArmStrong(153));
    }
}
