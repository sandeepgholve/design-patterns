package problem.solving.array.rotation;

import java.util.Arrays;

/**
 * https://www.geeksforgeeks.org/array-rotation/
 * METHOD (Using temp array)
 *
 * Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
 * 1) Store the first d elements in a temp array
 *    temp[] = [1, 2]
 * 2) Shift rest of the arr[]
 *    arr[] = [3, 4, 5, 6, 7, 6, 7]
 * 3) Store back the d elements
 *    arr[] = [3, 4, 5, 6, 7, 1, 2]
 *
 * Time complexity : O(n)
 * Auxiliary Space : O(d)
 */
public class TempArrayLeftRotationalArray implements Rotational {

    @Override
    public <T> T[] rotate(T[] array, int numOfRotations) {
        T[] tempArray = Arrays.copyOf(array, numOfRotations);

        for (int i = 0; i < array.length - numOfRotations; i++) {
            array[i] = array[i + numOfRotations];
        }

        for (int i = 0; i < tempArray.length; i++) {
            array[array.length - numOfRotations + i] = tempArray[i];
        }
        return array;
    }
}
