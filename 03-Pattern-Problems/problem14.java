// Printing a Butterfly Pattern by using Stars.
import java.util.*;
public class problem14 {
    public static void main(String args[]){
        int m=5;
        // Upper Half.
        for(int i=1;i<=m;i++){
            // first part.
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // Spaces.
            int spaces=2 * (m-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            // 2nd Part.
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower Half.
        for(int i=m;i>=1;i--){
            // First part.
            for(int j=1;j<=i;j++){

                System.out.print("*");
            }

            // Spaces.
            
            int spaces=2*(m-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            



            }
            // 2nd Part.
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();












        }











            










            









            











        













    }
}


















    

