/**
 * Topic: Java BigInteger Basics
 * Folder: 02-BasicJava-Programs
 * Description:
 * A simple program to demonstrate reading large integers from input
 * and performing basic arithmetic operations (addition & multiplication)
 * using Java's BigInteger class.
 */
import java.util.*;
import java.math.BigInteger;

public class BigIntegerDemo {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        BigInteger a =new BigInteger(sc.next());
        BigInteger b= new BigInteger(sc.next());
        BigInteger sum = a.add(b);
        BigInteger product=a.multiply(b);
        System.out.println(sum);
        System.out.println(product);
        sc.close();
        
        
        
    }
}