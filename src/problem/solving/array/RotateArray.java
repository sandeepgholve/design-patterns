package problem.solving.array;

import java.util.Arrays;

/**
 * Program for Array Rotation
 * <p>
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements.
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};

        System.out.println(Arrays.toString(inputArray));
        int rotateByNum = 2;
        System.out.println("Rotate array by " + rotateByNum);
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotateMethod2(inputArray, inputArray.length, rotateByNum);
        System.out.println(Arrays.toString(inputArray));

    }
    /*
    private void rotateMethod2(int[] inputArray, int size, int rotateByNum) {
        if (rotateByNum > 0 && rotateByNum < size) {
            int temp = inputArray[0];
            for (int i = 0; i < size; i++) {
                inputArray[i] = (rotateByNum+i < size) ? inputArray[rotateByNum+i] : inputArray[rotateByNum+i-size];
            }
        }
    }
    */
    private void rotateMethod1(int[] inputArray, int count, int pos) {
        for (int i = 0; i < pos; i++) {
            rotateLeft(inputArray, count);
        }
    }

    private void rotateLeft(int[] inputArray, int count) {
        int i;
        int temp = inputArray[0];
        for (i = 0; i < count - 1; i++) {
            inputArray[i] = inputArray[i + 1];
        }
        inputArray[i] = temp;
    }

    /**
     * Using Reverse Algorithm
     *
     * Let AB are the two parts of the input array where A = arr[0..d-1] and B = arr[d..n-1]. The idea of the algorithm is :
     *
     * Reverse A to get ArB, where Ar is reverse of A.
     * Reverse B to get ArBr, where Br is reverse of B.
     * Reverse all to get (ArBr) r = BA.
     * Example :
     * Let the array be arr[] = [1, 2, 3, 4, 5, 6, 7], d =2 and n = 7
     * A = [1, 2] and B = [3, 4, 5, 6, 7]
     *
     * Reverse A, we get ArB = [2, 1, 3, 4, 5, 6, 7]
     * Reverse B, we get ArBr = [2, 1, 7, 6, 5, 4, 3]
     * Reverse all, we get (ArBr)r = [3, 4, 5, 6, 7, 1, 2]
     */
    private void rotateMethod2(int[] inputArray, int size, int rotateByNum) {
        if (rotateByNum < size) {
            // Rotate arr[0, rotateNum]
            reverse(inputArray, 0, rotateByNum-1);
            // Rotate arr[rotateNum+1, size-1]
            reverse(inputArray, rotateByNum, size - 1);
            reverse(inputArray, 0, size - 1);
        }
    }

    private void reverse(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
