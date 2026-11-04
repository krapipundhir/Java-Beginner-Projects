/*
 * Program Name : StringBuilderDemo
 *
 * Description :
 * Demonstrates commonly used methods of StringBuilder.
 * StringBuilder allows modification of strings without
 * creating new objects repeatedly.
 */

public class StringBuilderClass {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        // Adds string at the end
        sb.append(" Programming");

        System.out.println(sb);

        // Inserts string at given index
        sb.insert(0, "Learn ");

        System.out.println(sb);

        // Deletes characters
        sb.delete(0, 6);

        System.out.println(sb);

        // Reverses the string
        sb.reverse();

        System.out.println(sb);
        
    }
}