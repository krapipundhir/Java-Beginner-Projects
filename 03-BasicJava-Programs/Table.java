// A Program to print the Table of any Num given by thr User.

import java.util.*;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which table you want to print. : ");
        int n = sc.nextInt();
        

        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

    }

}
