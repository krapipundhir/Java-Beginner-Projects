import java.util.Random;

/*
 * Program Name : RandomClassDemo
 *
 * Description :
 * Demonstrates methods of Random class.
 * Used for generating random values.
 */

public class RandomClassDemo {

    public static void main(String[] args) {

        Random random = new Random();

        // Generates random integer
        System.out.println("Random Integer:");
        System.out.println(random.nextInt());

        // Generates random integer from 0 to 99
        System.out.println("\nRandom Integer (0-99):");
        System.out.println(random.nextInt(100));

        // Generates random double
        System.out.println("\nRandom Double:");
        System.out.println(random.nextDouble());

        // Generates random boolean
        System.out.println("\nRandom Boolean:");
        System.out.println(random.nextBoolean());
    }
}