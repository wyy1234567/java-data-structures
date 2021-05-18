package sortings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    private MergeSort mergeSort;

    @BeforeEach
    void setUp() {
        this.mergeSort = new MergeSort();
    }

    @Test
    void whenInputIsEmpty_shouldKeepTheOriginalList() {
        int[] list = new int[0];
        mergeSort.sort(list);
        assertEquals(0, list.length);
    }

    @Test
    void whenInputHasOneElement_shouldKeepTheOriginalList() {
        int[] list = new int[1];
        list[0] = 1;
        mergeSort.sort(list);
        assertEquals(1, list.length);
        assertEquals(1, list[0]);
    }

    @Test
    void whenInputHasMultipleElement_shouldSortList() {
        int[] actual = { 4,5,1,3,2,8,0 };
        int[] expected = { 0,1,2,3,4,5,8 };
        mergeSort.sort(actual);
        assertArrayEquals(expected, actual);
    }

}