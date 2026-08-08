// Program to Check the age of a Person is Adult or not.

import java.util.*;

public class CheckAgeCriteria {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("Adult");

        } else {
            System.out.println("Not Adult");
        }

    }
}
