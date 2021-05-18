package sortings;


public class BubbleSort {

    public void sort(int[] numbers) {
        if (numbers.length < 2) {
            return;
        }

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    this.swap(numbers, i, i+1);
                    isSorted = false;
                }
            }
        }
    }

    public void swap(int[] array,  int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
