package main.algorithms;

/**
 * Like Merge Sort, QuickSort is a Divide and Conquer algorithm. It picks an element as pivot and partitions the given array around the picked pivot. There are many different versions of quickSort that pick pivot in different ways.
 *
 * Always pick first element as pivot.
 * Always pick last element as pivot (implemented below)
 * Pick a random element as pivot.
 * Pick median as pivot.
 * The key process in quickSort is partition(). Target of partitions is, given an array and an element x of array as pivot, put x at its correct position in sorted array and put all smaller elements (smaller than x) before x, and put all greater elements (greater than x) after x. All this should be done in linear time.
 */
public class QuickSorter {
	
	public int[] sort(int[] data) {
		return quicksort(data, 0, data.length-1);
	}
	
	public int[] quicksort(int[] data, int start, int end) {
		if (start < end) {
			int pivotIndex = partition(data, start, end);
			quicksort(data, start, pivotIndex-1);
			quicksort(data, pivotIndex+1, end);
		}
		return data;
	}
	
	private int partition(int[] data, int start, int end) {
		int pivot = data[end];
		int i = start;
		for (int j = start; j <= end - 1; j++) {
			if (data[j] < pivot) {
				int tmp = data[i];
				data[i] = data[j];
				data[j] = tmp;
				i++;
			}
		}
		data[end] = data[i];
		data[i] = pivot;
		return i;
	}
	

	
}
