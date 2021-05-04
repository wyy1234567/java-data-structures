package linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    private LinkedList linkedlist;

    @BeforeEach
    void setup() {
        linkedlist = new LinkedList();
    }

    @Test
    @DisplayName("Linkedlist is created with a null head node")
    void linkedListInitializedWithHeadNode() {
        assertNull(linkedlist.getHead());
    }

    @Test
    @DisplayName("isEmpty() will tell if linked list is empty")
    void isEmpty_returnTrueForEmptyLinkedList() {
        assertTrue(linkedlist.isEmpty());
    }

    @Test
    @DisplayName("Can add node to the linkedlist")
    void add_addNewNodeToTheEndOfLinkedList() {
        Node expected = new Node(1);
        linkedlist.add(1);
        Node actual = linkedlist.getHead();
        assertEquals(expected.getData(), actual.getData());
    }

    @Test
    @DisplayName("Can return first item in linked list")
    void getFirst_returnsFirstItemInList() {
        linkedlist.add(5);
        Node expected = linkedlist.getHead();
        Node actual = linkedlist.getFirst();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Can return last item in linked list")
    void getLast_returnsLastItemInList() {
        linkedlist.add(5);
        linkedlist.add(10);
        int expected = 10;
        int actual = linkedlist.getLast().getData();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Can return nth item in linked list")
    void get_returnsNthItemInList() {
        linkedlist.add(5);
        linkedlist.add(10);
        linkedlist.add(15);
        int expected = 10;
        int actual = linkedlist.get(1).getData();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Throws IndexOutOfBounds exception if N > length of list")
    void get_throwsIndexOutOfBoundsException_whenNGreaterThanLength() {
        linkedlist.add(5);
        linkedlist.add(10);
        linkedlist.add(15);
        assertThrows(IndexOutOfBoundsException.class, () -> {
            linkedlist.get(4);
        });
    }

    @Test
    @DisplayName("Should return index of object if it exist in the list")
    void contains_shouldReturnIndexOfObject() {
        linkedlist.add(5);
        linkedlist.add(10);
        linkedlist.add(15);
        int expected = 1;
        int actual = linkedlist.contains(10);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Should return -1 of object if doesn't exist in the list")
    void contains_shouldReturnNegativeOneIfNotContainsObject() {
        linkedlist.add(5);
        linkedlist.add(10);
        linkedlist.add(15);
        int expected = -1;
        int actual = linkedlist.contains(20);
        assertEquals(expected, actual);
    }


}