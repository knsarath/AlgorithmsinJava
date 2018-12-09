package main;

import main.algorithms.MergeSort;
import main.algorithms.QuickSorter;
import main.util.Print;

public class Main {
    public static void main(String[] args) {
        QuickSorter quickSorter = new QuickSorter();
        int[] sort = quickSorter.sort(new int[]{23, 5, 2, 8, 12, 7, 16, 9, 0, 4, 8, 5});
        Print.array(sort);
    }
}
