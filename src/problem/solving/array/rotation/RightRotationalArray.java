package problem.solving.array.rotation;

public class RightRotationalArray implements Rotational {

    @Override
    public <T> T[] rotate(T[] array, int numOfRotations) {

        // to handle if numberOfRotation >= array.length
        numOfRotations = numOfRotations % array.length;

        int count = 0;
        while (count < numOfRotations) {
            rotateRightByOne(array);
            count++;
        }

        return array;
    }

    private <T> void rotateRightByOne(T[] array) {
        T temp = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;
    }
}
