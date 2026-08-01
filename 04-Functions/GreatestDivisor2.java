import java.util.Scanner;

public class GreatestDivisior2 {
    public static void commonGreatestDivisior(int a, int b) {

        while (b != 0) {
            int remiander = a % b;
            a = b;
            b = remiander;

        }

        System.out.println("GCD is: " + a);
        return;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First number: ");
        int First = sc.nextInt();
        System.out.print("Enter Second number: ");
        int Second = sc.nextInt();

        commonGreatestDivisior(First, Second);
        return;
    }

}
