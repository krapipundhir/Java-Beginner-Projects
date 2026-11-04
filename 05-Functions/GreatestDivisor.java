// Solving GCD problem by using Euclidian Algorithm.
import java.util.*;

public class GreatestDivisor {
    public static void commonGreatestDivisor(int a, int b) {
       
        while (a!=b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }

        }
        System.out.print("GCD is: " + a);
        return;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int First = sc.nextInt();
        System.out.print("Enter Second number: ");
        int Second = sc.nextInt();

        commonGreatestDivisor(First,Second);
        return;
    }

}
