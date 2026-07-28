import java.util.*;

public class Calculator {
    public static void main(String args[]) {
        System.out.println("Enter the first number: ");

        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();

        System.out.println("Enter the Second number: ");
        int second = sc.nextInt();

        System.out.println("Which operator you want to use: ");
        System.out.println("Plaese select the Operation: ");
        System.out.println("1.Addition");
        System.out.println("2.Multiplication");
        System.out.println("3.Substraction");
        System.out.println("4.Division");
        System.out.print("Enter your choice: ");
        int Choice = sc.nextInt();

        switch (Choice) {
            case 1:
                System.out.println("sum = " + (first + second));
                break;
            case 2:
                System.out.print("Multiplication = " + (first * second));
                break;
            case 3:
                System.out.print("Substraction = " + (first - second));
                break;
            case 4:
                System.out.print("Division = " + (first % second));
                break;
            default:
                System.out.print("Invalid Choice");

                sc.close();

        }

    }

}