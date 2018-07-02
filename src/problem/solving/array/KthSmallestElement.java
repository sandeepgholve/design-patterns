package problem.solving.array;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] array = {12, 3, 5, 7, 19};
        int k = 2;
        int element = MinHeap.kthElement(array, k);
        System.out.println("k^th smallest element is = " + element);
    }
}

class MinHeap {
    private int[] inputArray;
    private int heapSize;

    private MinHeap(int[] array) {
        this.inputArray = array;
        this.heapSize = array.length;

        int index = (heapSize -1) / 2;
        while( index >= 0) {
            minHeapify(index);
            index--;
        }
    }
    public static int kthElement(int[] array, int k) {
        MinHeap minHeap = new MinHeap(array);

        for (int i=0 ; i<k-1 ; i++) {
            minHeap.extractMin();
        }

        return minHeap.getMin();
    }

    /**
     * Returns minimum
     * @return root, which is minimum element at given point.
     */
    private int getMin() {
        return inputArray[0];
    }

    /**
     * Method to remove minimum element (or root) from min heap
     * @return removed element / root element
     */
    private int extractMin() {
        if (heapSize == 0)
            return Integer.MAX_VALUE;

        // Store the minimum value
        int root = inputArray[0];

        // if there are more than 1 times, move the last item to root and call heapify.
        if (heapSize > 1) {
            inputArray[0] = inputArray[heapSize-1];
            minHeapify(0);
        }
        heapSize--;

        return root;
    }

    /**
     * Recursive method to heapify a subtree with root at given index.
     * This method assumes that the subtrees are already heapified.
     * @param index index of root
     */
    private void minHeapify(int index) {
        int left = left(index);
        int right = right(index);
        int smallest = index;

        if (left < heapSize && inputArray[left] < inputArray[index])
            smallest = left;
        if (right < heapSize && inputArray[right] < inputArray[smallest])
            smallest = right;
        if (smallest != index) {
            swap(index, smallest);
            minHeapify(smallest);
        }
    }

    private void swap(int index, int smallest) {
        int temp = inputArray[index];
        inputArray[index] = inputArray[smallest];
        inputArray[smallest] = temp;
    }

    private int left(int index) {
        return (2*index + 1);
    }

    private int right(int index) {
        return (2*index + 2);
    }
}
