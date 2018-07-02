package problem.solving.array;

import java.util.*;

/**
 * Find a pairs of number in array that sums up 30
 * Given array is {10, 3, 16, 18, 13, 14, 20, 27}
 *
 * There are 3 approaches to this solution:
 *
 * Let the sum be T and n be the size of array
 *
 * Approach 1:
 * The naive way to do this would be to check all combinations (n choose 2). This exhaustive search is O(n2).
 *
 * Approach 2:
 *  A better way would be to sort the array. This takes O(n log n)
 * Then for each x in array A, use binary search to look for T-x. This will take O(nlogn).
 * So, overall search is  O(n log n)
 *
 * Approach 3 :
 * The best way would be to insert every element into a hash table (without sorting). This takes O(n) as constant time insertion.
 * Then for every x, we can just look up its complement, T-x, which is O(1).
 * Overall the run time of this approach is O(n).
 *
 * Following is approach #3
 */
public class PairOfNumInArray {
    public static void main(String[] args) {
        int[] array = {10, 3, 16, 40, 18, 13, 14, 20, 27};
        // Key as actual value and
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int num : array) {
            if (num >30)
                continue;
            if (integerMap.containsKey(30-num)) {
                integerMap.put(30-num, num);
            } else {
                integerMap.put(num, null);
            }
        }

        System.out.println(integerMap);
    }
}
