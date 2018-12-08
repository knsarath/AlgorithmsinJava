package main;

import main.algorithms.BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] sorted = bubbleSort.sort(new int[]{1, 5, 2, 0, 4, 8, 5, 7, 88, -1, 3, 4, 5, 66});
        main.util.Print.array(sorted);
    }
}
