package problem.solving.array;

/**
 * Find duplicate number on Integer array in Java.
 * An array contains n numbers ranging from 0 to n-2. There is exactly one number is repeated in the array.
 * You need to write a program to find that duplicate number.
 *
 * For example, if an array with length 6 contains numbers {0, 3, 1, 2, 3}, then duplicated number is 3.
 *
 * Read more: https://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz5JzX4J5Qe
 */
public class DuplicateNumberInArray {
    public static void main(String[] args) {
        int[] arr = {0, 2   , 1, 2, 3};
        int length = arr.length;
        int expectedSum = length * ((length -1) / 2);
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        System.out.println("Expected Sum = " + expectedSum);
        System.out.println("Actual Sum = " + actualSum);
        int diff = expectedSum - actualSum;
        System.out.println("Diff = " + diff);
        int duplicateElement = (length - 1) - diff;
        System.out.println("Duplicate number is = " + duplicateElement);
    }
}
