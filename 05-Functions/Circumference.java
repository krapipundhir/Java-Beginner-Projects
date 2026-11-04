// Program to print the Circumference from Radius given by the User as the Input.

import java.util.*;

public class Circumference {
    public static void findCircumference(int r) {

        double circumference = 2 * Math.PI * r;

        System.out.print("Circumference will be : " + circumference);
        return;

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius : ");
        int r = sc.nextInt();

        findCircumference(r);

        return;
    }

}
