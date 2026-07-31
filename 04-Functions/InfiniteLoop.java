
// Use of Infinity Loop That's why Menu comes always.
import java.util.*;

public class InfiniteLoop {
    public static void atmExample(Scanner sc) {
        System.out.println("---ATM Menu---");
        System.out.println("1.Check the Balance");
        System.out.println("2.Exit Money");
        System.out.println("3.Exit");
        System.out.println("Enter your Choice : ");
        int Choice = sc.nextInt();

        if (Choice == 1) {
            System.out.println("Your Current balance is 10,000 now.");

        } 
        else if (Choice == 2) {
            System.out.println("Money has been exited!");
        }
        else if (Choice == 3) {
            System.out.println("Your Welcome!ATM Service has been ended.");

        } else {
            System.out.println("Wrong Choice!Please Try Again!");
            
        }  
            
        

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        while(true){
            
            atmExample(sc);
        }
    }

}
