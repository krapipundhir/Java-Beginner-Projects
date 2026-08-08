// A Program to check two numbers given by users as input to which one Greater or Smaller.

import java.util.*;

public class CompareTwoNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.print("Equal");
        } else {
            if (a > b) {
                System.out.println("a is greater than b");
            } else {
                System.out.println("a is less");
            }

        }
    }

}
