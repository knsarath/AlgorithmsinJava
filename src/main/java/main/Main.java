package main;

import main.algorithms.MergeSort;
import main.util.Print;

public class Main {
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] sort = mergeSort.sort(new int[]{23, 5, 2, 8, 12, 7, 16, 9});
        Print.array(sort);
    }
}
