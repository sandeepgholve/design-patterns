package problem.solving.array.rotation;

public interface Rotational {
    /**
     * A class implements the Rotational interface to implement the rotation behaviour of the array
     * @param array an input array that is to be rotated
     * @param numOfRotations number of rotations to perform
     * @param <T> type of the array
     * @return rotated array
     */
    <T> T[] rotate(T[] array, int numOfRotations);
}
