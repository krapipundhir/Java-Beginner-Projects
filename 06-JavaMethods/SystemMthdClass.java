/*
 * Program Name : SystemClassDemo
 *
 * Description :
 * Demonstrates useful methods and fields of System class.
 * System class provides access to standard input,
 * output, error streams and system-related utilities.
 *
 * Author : Krapi Pundhir
 */

public class SystemMthdClass {

    public static void main(String[] args) {

        // Prints data to console
        System.out.println("Hello Java");

        // Prints error message
        System.err.println("This is an error message");

        // Returns current time in milliseconds
        System.out.println("Current Time Millis : ");
        System.out.println(System.currentTimeMillis());

        // Gets Java version
        System.out.println("Java Version : ");
        System.out.println(System.getProperty("java.version"));

        // Gets Operating System name
        System.out.println("OS Name : ");
        System.out.println(System.getProperty("os.name"));

        // Copies array elements
        int[] source = {10, 20, 30, 40};
        int[] destination = new int[4];

        System.arraycopy(source, 0,
                destination, 0,
                source.length);

        System.out.println("Array Copied Successfully");
        
    }
}