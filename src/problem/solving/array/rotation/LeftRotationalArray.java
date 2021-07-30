package problem.solving.array.rotation;

/**
 * https://www.geeksforgeeks.org/array-rotation/
 *
 * METHOD (Rotate one by one)
 *
 * leftRotate(arr[], d, n)
 * start
 *   For i = 0 to i < d
 *     Left rotate all elements of arr[] by one
 * end
 * To rotate by one, store arr[0] in a temporary variable temp, move arr[1] to arr[0], arr[2] to arr[1] …and finally
 * temp to arr[n-1]
 * Let us take the same example arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2
 * Rotate arr[] by one 2 times
 * We get [2, 3, 4, 5, 6, 7, 1] after first rotation and [ 3, 4, 5, 6, 7, 1, 2] after second rotation.
 *
 * Time complexity : O(n * d)
 * Auxiliary Space : O(1)
 */
public class LeftRotationalArray implements Rotational {

    @Override
    public <T> T[] rotate(T[] array, int numOfRotations) {
        int count = 0;
        while (count < numOfRotations) {
            T temp = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = temp;
            count++;
        }
        return array;
    }
}
