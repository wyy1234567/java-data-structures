package sortings;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public void sort(int[] numbers) {
        this.sort(numbers, numbers.length);
    }

    public void sort(int[] numbers, int size) {
        if (size < 2) {
            return;
        }

        int middle = size / 2;
        int[] left = new int[middle];
        int[] right = new int[size - middle];

        System.arraycopy(numbers, 0, left, 0, middle);
        if (size - middle >= 0) System.arraycopy(numbers, middle, right, middle - middle, size - middle);

        this.sort(left, middle);
        this.sort(right, size - middle);
        this.merge(numbers, left, right, middle, size - middle);
    }

    public void merge(int[] numbers, int[] leftArr, int[] rightArr, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (leftArr[i] <= rightArr[j]) {
                numbers[k++] = leftArr[i++];
            }
            else {
                numbers[k++] = rightArr[j++];
            }
        }
        while (i < left) {
            numbers[k++] = leftArr[i++];
        }
        while (j < right) {
            numbers[k++] = rightArr[j++];
        }
    }
}
