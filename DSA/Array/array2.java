package DSA.Array;

import java.util.Arrays;

public class array2 {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 3 };

        // Sorting the array
        Arrays.sort(arr);

        // Printing the sorted array
        System.out.println("Sorted Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
