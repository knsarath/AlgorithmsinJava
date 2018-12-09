package main.algorithms;


public class MergeSort {
    public int[] sort(int[] array) {

        sort(array, 0, array.length - 1);
        return array;
    }

    // Merges two subarrays of arr[].
    // First subarray is arr[from..middle]
    // Second subarray is arr[middle+1..to]
    void merge(int arr[], int from, int middle, int to) {
        // Find sizes of two subarrays to be merged
        int leftArrayLength = middle - from + 1;
        int rightArrayLength = to - middle;

        /* Create temp arrays */
        int L[] = new int[leftArrayLength];
        int R[] = new int[rightArrayLength];

        /*Copy data to temp arrays*/
        for (int i = 0; i < leftArrayLength; ++i)
            L[i] = arr[from + i];
        for (int j = 0; j < rightArrayLength; ++j)
            R[j] = arr[middle + 1 + j];


        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarry array
        int k = from;
        while (i < leftArrayLength && j < rightArrayLength) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < leftArrayLength) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < rightArrayLength) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[from..to] using
    // merge()
    void sort(int arr[], int from, int to) {
        if (from < to) {
            // Find the middle point
            int middle = (from + to) / 2;

            // Sort first and second halves
            sort(arr, from, middle);
            sort(arr, middle + 1, to);

            // Merge the sorted halves
            merge(arr, from, middle, to);
        }
    }

}
