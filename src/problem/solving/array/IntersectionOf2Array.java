package problem.solving.array;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Write a program to find intersection of two sorted arrays in Java? (solution)
 * Another interesting array interview question, where you need to treat the array as Set. Your task is to write a
 * function in your favorite language e.g. Java, Python, C or C++ to return the intersection of two sorted arrays.
 *
 * For example, if the two sorted arrays as input are {21, 34, 41, 22, 35} and {61, 34, 45, 21, 11}, it should
 * return an intersection array with numbers {34, 21}, For the sake of this problem you can assume that numbers in
 * each integer array are unique.
 *
 * Read more: https://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz5K2Shh99x
 */
public class IntersectionOf2Array {
    public static void main(String[] args) {
        int[] arr1 = {21, 34, 41, 22, 35};
        int[] arr2 = {61, 34, 45, 21, 11};

        System.out.println("Array1 = " + Arrays.toString(arr1));
        System.out.println("Array2 = " + Arrays.toString(arr2));
        HashSet<Integer> set = new HashSet<>(arr1.length);
        for (int num : arr1)
            set.add(num);

        System.out.printf("Intersection of array = ");
        for (int num : arr2) {
            if (!set.add(num)) {
                System.out.printf(" " + num);
            }
        }
    }
}
