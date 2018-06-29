package test;

import java.util.*;

/**
 * Find a pairs of number in array that sums up 30
 * Given array is {10, 3, 16, 18, 13, 14, 20, 27}
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
