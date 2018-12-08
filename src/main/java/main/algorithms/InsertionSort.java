package main.algorithms;

/**
 * Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
 * see @{link https://cdncontribute.geeksforgeeks.org/wp-content/uploads/insertionsort.png}
 */
public class InsertionSort {
    public int[] sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int current = array[i];

            /**
             * Each time the left section (left of a[i] is sorted, so take the new item from the right and find its position in the left section )
             */
            for (int j = i - 1; j >= 0 && array[j] > current; j--) {
                int temp = array[j + 1];
                array[j+1] = array[j];
                array[j] = temp;
            }
        }
        return array;
    }
}
