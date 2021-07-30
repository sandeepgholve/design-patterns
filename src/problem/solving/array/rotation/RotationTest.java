package problem.solving.array.rotation;

import java.util.Arrays;

public class RotationTest {
    public static void main(String[] args) {
        final int numOfRotations = 5;
        Integer[] inputArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        Rotational rightRotationalArray = new RightRotationalArray();
        Rotational leftRotationalArray = new LeftRotationalArray();
        Rotational tempArrayLeftRotationalArray = new TempArrayLeftRotationalArray();
        Rotational jugglingArrayLeftRotationalArray = new JugglingLeftRotationalArray();

        System.out.println("Input Array --> " + Arrays.toString(inputArray));


        Integer[] outputArray1 = rightRotationalArray.rotate(Arrays.copyOf(inputArray, inputArray.length), numOfRotations);
        System.out.println("Output Array1 --> " + Arrays.toString(outputArray1));

        Integer[] outputArray2 = leftRotationalArray.rotate(Arrays.copyOf(inputArray, inputArray.length), numOfRotations);
        System.out.println("Output Array2 --> " + Arrays.toString(outputArray2));

        Integer[] outputArray3 = tempArrayLeftRotationalArray.rotate(Arrays.copyOf(inputArray, inputArray.length), numOfRotations);
        System.out.println("Output Array3 --> " + Arrays.toString(outputArray3));

        Integer[] outputArray4 = jugglingArrayLeftRotationalArray.rotate(Arrays.copyOf(inputArray, inputArray.length), numOfRotations);
        System.out.println("Output Array4 --> " + Arrays.toString(outputArray4));
    }
}
