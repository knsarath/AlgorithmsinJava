package main;

import main.algorithms.SelectionSort;

public class Main {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] sorted = selectionSort.sort(new int[]{1, 5, 2, 0, 4, 8, 5, 7, 88, -1, 3, 4, 5, 66});
        main.util.Print.array(sorted);
    }
}
