package problem.solving.array;

/**
 * Find the element that appears once in an array where every other element appears twice
 * Given an array of integers. All numbers occur twice except one number which occurs once. Find the number in O(n)
 * time & constant extra space.
 *
 * Example :
 *
 * Input:  ar[] = {7, 3, 5, 4, 5, 3, 4}
 * Output: 7
 * One solution is to check every element if it appears once or not. Once an an element with single occurrence is
 * found, return it. Time complexity of this solution is O(n2).
 *
 * A better solution is to use hashing.
 * 1) Traverse all elements and put them in a hash table. Element is used as key and count of occurrences is used as
 * value in hash table.
 * 2) Traverse the array again and print the element with count 1 in hash table.
 * This solution works in O(n) time, but requires extra space.
 *
 * The best solution is to use XOR. XOR of all array elements gives us the number with single occurrence. The idea
 * is based on following two facts.
 * a) XOR of a number with itself is 0.
 * b) XOR of a number with 0 is number itself.
 */
public class UniqueNumFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 5};

        int num = 0;
        for (int i : arr) {
            num = num ^ i;
        }
        System.out.println(num);
    }
}
