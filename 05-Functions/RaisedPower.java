// This Program is used to calculate the power of a number that is giving by the user.
import java.util.*;

public class RaisedPower {

    public static void raisedPower(int x, int n) {

        int result = 1;
        for (int i = 1; i <= n; i++) {

            result = result * x;

        }
        System.out.println(result);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base number: ");
        int x = sc.nextInt();

        System.out.print("Enter the Exponent: ");
        int n = sc.nextInt();
        raisedPower(x, n);
        return;

    }

}
