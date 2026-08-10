// Progarm to Check the eligibilty of the user for Voting by using the Age that is entered by the user.

import java.util.*;

public class Eligibility {
    public static void checkAgeCriteria(int age) {
        if (age >= 18) {

            System.out.print("Coangratulations!You are Eligible for Voting.");

        } else {

            System.out.print("Sorry,You are not Eligible for Voting.");

        }
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your current Age : ");
        int age = sc.nextInt();

        checkAgeCriteria(age);
        return;

    }

}
