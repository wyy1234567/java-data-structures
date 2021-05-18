package sortings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    private QuickSort quickSort;

    @BeforeEach
    void setUp() {
        this.quickSort = new QuickSort();
    }

    @Test
    void whenInputIsEmpty_shouldKeepTheOriginalList() {
        List<Integer> list = new ArrayList<>();
        quickSort.sort(list);
        assertTrue(list.isEmpty());
    }

    @Test
    void whenInputHasOneElement_shouldKeepTheOriginalList() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        quickSort.sort(list);
        assertEquals(1, list.size());
        assertEquals(1, list.get(0));
    }

    @Test
    void whenInputHasMultipleElement_shouldSortList() {
        List<Integer> list = new ArrayList<>(Arrays.asList(4,5,1,3,2,8,0));
        quickSort.sort(list);
        List<Integer> expected = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,8));
        assertEquals(expected, list);
    }
}