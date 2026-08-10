// Printing the product of that two numbers that is giving by the user.
import java.util.*;

public class MultipleOfNumbers {
    public static int calculateProduct(int a, int b) {
        int multiply = a * b;
        return multiply;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a : ");
        int a = sc.nextInt();
        System.out.print("Enter the number b : ");
        int b = sc.nextInt();
        // int multiply = calculateProduct(a, b);

        System.out.print("The Multiply of two Numbers is : " +calculateProduct(a,b));
        sc.close();
    }

}
