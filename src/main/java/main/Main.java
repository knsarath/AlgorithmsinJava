package main;

import main.algorithms.InsertionSort;

public class Main {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] sorted = insertionSort.sort(new int[]{1, 5, 2, 0, 4, 8, 5, 7, 88, -1, 3, 4, 5, 66, -1,-1,0,0,100});
        main.util.Print.array(sorted);
    }
}
