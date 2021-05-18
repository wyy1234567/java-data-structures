package sortings;

import java.util.List;
import static java.util.Collections.swap;

public class QuickSort {

    public void sort(List<Integer> list) {
        this.sort(list, 0, list.size()-1);
    }

    public void sort(List<Integer> list, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = list.get((left + right) / 2);
        int index = this.partition(list, left, right, pivot);
        this.sort(list, left, index - 1);
        this.sort(list, index, right);
    }

    public int partition(List<Integer> list, int left, int right, int pivot) {
        while (left <= right) {
            while (list.get(left) < pivot) {
                left++;
            }

            while (list.get(right) > pivot) {
                right--;
            }

            if (left <= right) {
                swap(list, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

}
