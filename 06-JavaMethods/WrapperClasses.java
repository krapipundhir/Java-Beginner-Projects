/*
 * Program Name : WrapperClassDemo
 *
 * Description :
 * Demonstrates Integer Wrapper Class methods.
 * Wrapper classes convert primitive types into objects.
 */

public class WrapperClasses {

    public static void main(String[] args) {

        // Converts String to Integer object
        Integer num = Integer.valueOf("100");

        System.out.println("Integer Object: " + num);

        // Converts String to primitive int
        int value = Integer.parseInt("200");

        System.out.println("Primitive int: " + value);

        // Maximum Integer value
        System.out.println("MAX_VALUE: "
                + Integer.MAX_VALUE);

        // Minimum Integer value
        System.out.println("MIN_VALUE: "
                + Integer.MIN_VALUE);
    }
}