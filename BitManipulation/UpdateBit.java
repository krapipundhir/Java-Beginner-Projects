package BitManipulation;

import java.util.*;

public class UpdateBit {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 5; // is 0101 in Binary
        int pos = 2;
        int bitMask = 1 << pos;
        int choice = sc.nextInt();
        if (choice == 1 || choice==0) {
            if (choice == 1) {
                int newNum = bitMask | n;
                System.out.println(newNum);
            } else {
                int notBitMask = ~(bitMask);
                int newNum = notBitMask & n;
                System.out.println(newNum);

            }

        } else {
            System.out.println("Invalid Choice");
            
        }
    }

}
