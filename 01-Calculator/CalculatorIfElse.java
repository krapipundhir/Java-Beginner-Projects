import java.util.Scanner;

public class CalculatorIfElse {
    public static void main(String args[]) {
        System.out.println("Enter the first number:");
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        System.out.println("Enter the Second number:");
        int second = sc.nextInt();
        System.out.println(" 1.Sum\n 2. subtraction\n 3. Multlipication\n 4. Division");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Sum is:" + (first + second));
        } else if (choice == 2) {
            System.out.print("Subtraction is:" + (first - second));
        } else if (choice == 3) {
            System.out.print("Multlipication is:" + (first * second));

        } else if (choice == 4) {
            System.out.print("Division is: " + (first/second));

        } else {
            System.out.print("Invalid choice");
        }
    }

}
