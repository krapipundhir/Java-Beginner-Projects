import java.util.*;

public class Factorial {
    public static void printfactorial(int a){
        // loop.
        if(a<0){
            System.out.println("Invalid number");
            return;
        }
        int factorial=1;
        for(int i=a;i>=1;i--){
            factorial=factorial*i;
            


        }
        System.out.println("The Facto is : "+factorial);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a : ");
        int a = sc.nextInt();
        printfactorial(a);

    }

}
