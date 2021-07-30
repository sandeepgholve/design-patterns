package problem.solving.array.rotation;

/**
 *  https://www.geeksforgeeks.org/array-rotation/
 *
 * METHOD (A Juggling Algorithm)
 * This is an extension of method 2. Instead of moving one by one, divide the array in different sets
 * where number of sets is equal to GCD(Greatest Common Divisor) of n and d and move the elements within sets.
 * If GCD is 1 as is for the above example array (n = 7 and d =2), then elements will be moved within one set only, we
 * just start with temp = arr[0] and keep moving arr[I+d] to arr[I] and finally store temp at the right place.
 * Here is an example for n =12 and d = 3. GCD is 3 and
 *
 *
 * Let arr[] be {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}
 *
 * a)    Elements are first moved in first set
 *           arr[] after this step --> {4 2 3 7 5 6 10 8 9 1 11 12}
 *
 * b)    Then in second set.
 *           arr[] after this step --> {4 5 3 7 8 6 10 11 9 1 2 12}
 *
 * c)    Finally in third set.
 *           arr[] after this step --> {4 5 6 7 8 9 10 11 12 1 2 3}
 *
 * Time complexity : O(n)
 * Auxiliary Space : O(1)
 */
public class JugglingLeftRotationalArray implements Rotational {

    @Override
    public <T> T[] rotate(T[] array, int numOfRotations) {

        // to handle if numberOfRotation >= array.length
        final int arrLength = array.length;
        numOfRotations = numOfRotations % arrLength;

        int i, j, k;
        T temp;

        int gcdNum = gcd(numOfRotations, arrLength);

        for (i = 0; i < gcdNum; i++) {
            /* move i-th values of blocks */
            temp = array[i];
            j = i;

            while (true) {
                k = j + numOfRotations;
                if (k >= arrLength) {
                    k = k - arrLength;
                }
                if (k == i) break;

                array[j] = array[k];
                j = k;
            }
            array[j] = temp;
        }
        return array;
    }

    // function to get gcd of a and b
    private int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }
}
