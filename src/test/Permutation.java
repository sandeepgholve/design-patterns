package test;

// Java program to print all permutations of a
// given string.
public class Permutation {
    public static void main(String[] args) {
        String str = "ABC";
        int length = str.length();
        Permutation permutation = new Permutation();
        permutation.permute(str, 0, length - 1);
    }

    /**
     * permutation function
     *
     * @param str string to calculate permutation for
     * @param left   starting index
     * @param right   end index
     */
    private void permute(String str, int left, int right) {
        if (left == right) {
            System.out.println(str);
        } else {
            for (int i=left ; i<=right ; i++) {
                swap(str, left, i);
                permute(str, left+1, right);
                swap(str, left, i);
            }
        }
    }

    /**
     * Swap Characters at position
     *
     * @param str string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public String swap(String str, int i, int j) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}