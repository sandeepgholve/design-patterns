package problem.solving.array.rotation;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Monk and Rotation
 * Monk loves to preform different operations on arrays, and so being the principal of Hackerearth School, he
 * assigned a task to his new student Mishki. Mishki will be provided with an integer array A of size N and an
 * integer K , where she needs to rotate the array in the right direction by K steps and then print the resultant array.
 * As she is new to the school, please help her to complete the task.
 *
 * Input:
 * The first line will consists of one integer T denoting the number of test cases.
 * For each test case:
 * 1) The first line consists of two integers N and K, N being the number of elements in the array and K denotes the
 * number of steps of rotation.
 * 2) The next line consists of N space separated integers , denoting the elements of the array A.
 *
 * Output:
 * Print the required array.
 *
 * Constraints:
 * 1 <= T <= 20
 * 1 <= N <= 10^5
 * 0 <= K <= 10^6
 * 0 <= A[i] <= 10^6
 *
 *
 * Sample Input
 * 1
 * 5 2
 * 1 2 3 4 5
 *
 * Sample Output
 * 4 5 1 2 3
 *
 * Explanation
 * Here T is 1, which means one test case.
 *  denoting the number of elements in the array and , denoting the number of steps of rotations.
 * The initial array is:
 * In first rotation, 5 will come in the first position and all other elements will move to one position ahead from
 * their current position. Now, the resultant array will be
 * In second rotation, 4 will come in the first position and all other elements will move to one position ahead from
 * their current position. Now, the resultant array will be
 */

public class MonkAndRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Integer numOfTestCases = Integer.valueOf(scanner.nextLine());

            System.out.println("Number of test cases are = " + numOfTestCases);
            for (int i = 0 ; i < numOfTestCases ; i++) {
                // Parse first line which consist of two integers N and K
                String firstLine = scanner.nextLine();
                StringTokenizer stringTokenizer = new StringTokenizer(firstLine, " ");

                if (stringTokenizer.countTokens() != 2) {
                    System.out.println("We need only 2 integers N and K separated by space. Invalid input ==> " + firstLine);
                    return;
                }
                int N = Integer.parseInt(stringTokenizer.nextToken());
                int K = Integer.parseInt(stringTokenizer.nextToken());

                String secondLine = scanner.nextLine();
                stringTokenizer = new StringTokenizer(secondLine, " ");
                int[] intArray = new int[stringTokenizer.countTokens()];
                int index = 0;
                while (stringTokenizer.hasMoreTokens() && index < N) {
                    intArray[index] = Integer.parseInt(stringTokenizer.nextToken());
                    index++;
                }

                System.out.println("Array before rotation --> " + Arrays.toString(intArray));
                rotateRightArray(intArray, K);
                System.out.println("Array after rotation --> " + Arrays.toString(intArray));
            }

        } catch (Exception e) {
            System.out.println("Usage: \n" +
                "The first line will consists of one integer T denoting the number of test cases.\n" +
                "For each test case:\n" +
                "1) The first line consists of two integers N and K, N being the number of elements in the array and " +
                        "K denotes the number of steps of rotation.\n" +
                "2) The next line consists of N space separated integers , denoting the elements of the array A."
            );

        }
    }

    private static void rotateRightArray(int[] intArray, int numberOfRotations) {
        int count = 0;
        while (count < numberOfRotations) {
            int temp = intArray[intArray.length-1];
            for (int i=intArray.length-1 ; i>0 ; i--) {
                intArray[i] = intArray[i-1];
            }
            intArray[0] = temp;
            count++;
        }
    }
}
