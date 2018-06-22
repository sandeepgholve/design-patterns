package test;

public class PrintRepeatNums {
    void printRepeating(int arr[], int size) {
        int count[] = new int[size];
        int i;

        System.out.println("Repeated elements are : ");
        for (i = 0; i < size; i++) {
            if (count[arr[i]] == 1)
                System.out.print(arr[i] + " ");
            else
                count[arr[i]]++;
        }
    }

    public static void main(String[] args) {
        PrintRepeatNums repeat = new PrintRepeatNums();
        int arr[] = {4, 2, 4, 5, 2, 3, 1};
        int arr_size = arr.length;
        repeat.printRepeating(arr, arr_size);

        for (int i=0 ; i<255 ; i++) {
            System.out.printf("\n%d --> %c", i, i);
        }
    }
}
