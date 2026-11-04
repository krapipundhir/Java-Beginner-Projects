import java.util.ArrayList;
import java.util.Collections;

/*
 * Program Name : CollectionsDemo
 *
 * Description :
 * Demonstrates utility methods of Collections class.
 */

public class CollectionsMthdClass {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(50);
        list.add(10);
        list.add(30);
        list.add(70);

        System.out.println("Original List:");
        System.out.println(list);

        // Sort list in ascending order
        Collections.sort(list);

        System.out.println("\nSorted List:");
        System.out.println(list);

        // Reverse list
        Collections.reverse(list);

        System.out.println("\nReversed List:");
        System.out.println(list);

        // Maximum element
        System.out.println("\nMaximum Element:");
        System.out.println(Collections.max(list));

        // Minimum element
        System.out.println("\nMinimum Element:");
        System.out.println(Collections.min(list));
    }
}