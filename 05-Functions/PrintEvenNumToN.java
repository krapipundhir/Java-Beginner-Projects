// Printing all Even Numbers that exists between the 0 and n ("n is the input that is giving by the user").
import java.util.*;

public class PrintEvenNumToN {
    public static void printEvenNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n : ");
        int n = sc.nextInt();
        int Even = 0;
        for (int i = 1; i <= n / 2; i++) {

            Even = Even + 2;

            System.out.println(Even);

        }
        sc.close();

    }

    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        printEvenNum();

    }

}
