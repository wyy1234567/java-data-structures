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





}