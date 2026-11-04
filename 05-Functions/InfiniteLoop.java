
// Use of Do While Loop by usiing a function That's why Atm Menu comes again and again.

import java.util.*;

public class InfiniteLoop {
    public static void atmExample(Scanner sc) {
        System.out.println("---ATM Menu---");
        System.out.println("1.Check the Balance");
        System.out.println("2.Exit Money");
        System.out.println("3.Exit");
        System.out.print("Enter your Choice : ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Your Current balance is 10,000.");

        } else if (choice == 2) {
            System.out.println("Money has been exited!");
        } else if (choice == 3) {
            System.out.println("Your Welcome!ATM Service has been ended.");

        } else {
            System.out.println("Wrong Choice!Please Try Again!");

        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        do {
            atmExample(sc);
        } while (true);

    }

}
