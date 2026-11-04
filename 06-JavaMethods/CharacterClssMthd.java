/*
 * Program Name : CharacterClassDemo
 *
 * Description :
 * Demonstrates important methods of Character class.
 * Used to check properties of characters.
 */

public class CharacterClssMthd {

    public static void main(String[] args) {

        char ch = 'A';

        // Checks whether character is a letter
        System.out.println("isLetter(): "
                + Character.isLetter(ch));

        // Checks whether character is a digit
        System.out.println("isDigit(): "
                + Character.isDigit(ch));

        // Checks if character is uppercase
        System.out.println("isUpperCase(): "
                + Character.isUpperCase(ch));

        // Checks if character is lowercase
        System.out.println("isLowerCase(): "
                + Character.isLowerCase(ch));

        // Converts uppercase to lowercase
        System.out.println("toLowerCase(): "
                + Character.toLowerCase(ch));

        // Converts lowercase to uppercase
        System.out.println("toUpperCase(): "
                + Character.toUpperCase('a'));

    }
}