import java.util.*;

public class Circumference {
    public static void findCircumference(int r) {

        double Circumference = 2 * Math.PI * r;

        System.out.print("Circumference will be : " + Circumference);
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
