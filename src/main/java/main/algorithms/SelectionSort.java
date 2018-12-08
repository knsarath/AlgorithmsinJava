package main.algorithms;

/**
 * The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.
 *
 * 1) The subarray which is already sorted.
 * 2) Remaining subarray which is unsorted.
 *
 * In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.
 */
public class SelectionSort {
    public int[] sort(int[] unsortedArray) {

        int n = unsortedArray.length;
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (unsortedArray[j] < unsortedArray[i]) {
                    int temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[j];
                    unsortedArray[j] = temp;
                }
            }
        }
        return unsortedArray;
    }
}
