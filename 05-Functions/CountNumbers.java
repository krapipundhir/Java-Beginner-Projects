// Program to Count the All Positives, Negatives, And Zeros given by the user as such as He/She want can give the inputs to Calculate.
import java.util.Scanner;

public class CountNumbers {
    public static void countNumbers(Scanner sc){
        
        
        int positive=0,negative=0,zeros=0;
    
        int choice;

        do{
            System.out.print("Enter the numbers as you want to count(-1 to infinity):");
            int number=sc.nextInt();
            
            if(number>0){
                positive++;
            }
            else if(number<0){
                negative++;
            }
            else{
                zeros++;
            }
            System.out.print("Do you want to enter another number? (1 for yes, 0 for no): ");
            choice=sc.nextInt();
        }
        while(choice==1);
            
        System.out.println("Final Result: ");
        System.out.println("Total Positive Counts: "+positive);

        System.out.println("Total Negative Counts: "+negative);
        System .out.println("Toatal Zeros Counts: "+zeros);
        sc.close();
        return;
    
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        
        countNumbers(sc);
        
    }

}
