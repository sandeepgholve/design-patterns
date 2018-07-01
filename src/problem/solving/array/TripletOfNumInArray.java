package problem.solving.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Print all triplets with given sum
 * Given an array of distinct elements. The task is to find triplets in array whose sum is equal to a given number.
 *
 * Examples:
 *
 * Input : arr[] = {0, -1, 2, -3, 1}
 *         sum = -2
 * Output : 0  -3  1
 *          -1  2 -3
 *
 * Input : arr[] = {1, -2, 1, 0, 5}
 *         sum = 0
 * Output : 1 -2  1
 */
public class TripletOfNumInArray {
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int sum = -2;

        int count = 0;
        for (int x : arr) {
            Set<Integer> set = new HashSet<>();
            for (int y : arr) {
                int num = sum - (x + y);
                if (set.contains(num)) {
                    count++;
                    System.out.printf("\nTriplet #%d = {%d, %d, %d}", count, num, x, y);
                } else {
                    set.add(y);
                }
            }
        }
    }
}
