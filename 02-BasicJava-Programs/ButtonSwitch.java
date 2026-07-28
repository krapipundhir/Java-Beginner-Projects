import java.util.Scanner;

public class ButtonSwitch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.print("Hello");
                break;
            case 2:
                System.out.print("Namaste");

                break;
            case 3:
                System.out.print("Hi");

                break;
            case 4:
                System.out.print("Bonjour");

                break;
            default:
                System.out.print("Invalid Button");
                sc.close();
        }

    }

}
