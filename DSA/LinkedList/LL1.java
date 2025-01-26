package DSA.LinkedList;

import java.util.LinkedList;

public class LL1 {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements to the LinkedList
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Display the LinkedList
        System.out.println("LinkedList Elements:");
        for (int element : list) {
            System.out.println(element);
        }
    }
}
