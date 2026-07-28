import java.util.*;

public class OddEvenSwitch {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("it is an even number");
        } else {
            System.out.println("its an odd.");
        }
    }

}
