
/*
* Description:
* This program calculates the sum of all digits present
* in a given integer using modulo (%) and division (/)
* operations. Each digit is extracted and added to a
* running total until the number becomes 0.
*
* Given Number:
* 123455
*
* Output:
* Sum of digits: 20
*/

public class SumOfCountDigits {
    public static int sumOfCountDigits(int num){
        int sum = 0;
        while(num>0){
            int digit = num % 10;
            sum += digit;
            num = num /10;
        }
        return sum;
    }
    public static void main(String args[]){
        int num = 123455;
        int digitSum = sumOfCountDigits(num);
        System.out.println("Sum of digits: " + digitSum);  
    }
}
