import java.util.Arrays;

/*
 * Program Name : ArraysClassDemo
 *
 * Description :
 * Demonstrates commonly used methods of Java Arrays class.
 * Arrays class provides utility methods for sorting,
 * searching, filling and printing arrays.
 *
 * Author : Krapi Pundhir
 */

public class ArrayClassMthd {

    public static void main(String[] args) {

        // Original array
        int[] arr = {5, 2, 8, 1, 9};

        System.out.println("Original Array:");
        
        // This line prints the array in a readable format using Arrays.toString() method, without it, it would print the reference of the array.
        // Withou using anyy For loop, we can print the Whole array using Arrays.toString() method.

        System.out.println(Arrays.toString(arr));

        // Sorts array in ascending order
        Arrays.sort(arr);

        System.out.println("\nSorted Array:");
        System.out.println(Arrays.toString(arr));

        // Searches a value in sorted array
        int index = Arrays.binarySearch(arr, 8);

        System.out.println("\nIndex of 8: " + index);

        // Replaces all elements with given value
        Arrays.fill(arr, 100);

        System.out.println("\nArray after fill():");
        System.out.println(Arrays.toString(arr));
    }
}