/*
 * Program Name : StringClassDemo
 *
 * Description :
 * Demonstrates commonly used methods of Java String class.
 * String is immutable, which means once a String object
 * is created, it cannot be modified.
 *
 * Author : Krapi Pundhir
 */

public class StringMthdClss {

    public static void main(String[] args) {

        String str = "Java Programming";

        // Returns length of string
        System.out.println("Length : " + str.length());

        // Returns character at given index
        System.out.println("Character at index 2 : "
                + str.charAt(2));

        // Converts string to uppercase
        System.out.println("UpperCase : "
                + str.toUpperCase());

        // Converts string to lowercase
        System.out.println("LowerCase : "
                + str.toLowerCase());

        // Checks if string contains given text
        System.out.println("Contains 'Prog' : "
                + str.contains("Prog"));

        // Returns substring
        System.out.println("Substring : "
                + str.substring(5));

        // Replaces characters
        System.out.println("Replace : "
                + str.replace('a', '@'));

        // Checks equality
        System.out.println("Equals : "
                + str.equals("Java Programming"));

        // Removes leading and trailing spaces
        String name = "   Krapi   ";
        System.out.println("Trim : " + name.trim());
        
    }
}