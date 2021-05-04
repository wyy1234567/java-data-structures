package linkedlist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    @DisplayName("Can create a node with integer")
    void nodeShouldCreatedWithInteger() {
        Node node = new Node(10);
        int expected = 10;
        int actual = node.getData();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("New node's next node is null")
    void nodeShouldCreatedWithNextNullPointer() {
        Node node = new Node(10);
        Node actual = node.getNext();
        assertNull(actual);
    }



}