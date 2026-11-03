
/*
 * Program: PerfectNumber.java
 * Author: Krapi
 *
 * Description:
 * Checks whether a given number is a Perfect Number
 * by comparing the sum of its proper divisors with
 * the original number.
 *
 * Time Complexity: O(√n)
 * Space Complexity: O(1)
 */

public class PerfectNumber {
    public static boolean isPerfect(int num){
        int sum = 1 ;
        for(int i = 2; i*i<=num; i++){
            if(num %i == 0){
                int firstCount =i;
                int secondCount= num/i;

                if(firstCount ==secondCount ){
                    sum+=firstCount;
                }
                sum+=firstCount+secondCount;
            }
        }
        if(sum==num){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        System.out.println(isPerfect(36));
    }
}
