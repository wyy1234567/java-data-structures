package queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    private Queue queue;

    @BeforeEach
    void setup() {
        queue = new Queue();
    }

    @Test
    @DisplayName("Queue is empty when initialization")
    void shouldInitializeEmptyQueue() {
        assertTrue(queue.isEmpty());
    }

    @Test
    @DisplayName("Queue can peek its front item")
    void peek_shouldReturnTheFrontItemInQueue() {
        queue.add(10);
        assertEquals(10, queue.peek());
    }

    @Test
    @DisplayName("Queue can add item to the end")
    void add_shouldAddItemToTheEnd() {
        queue.add(10);
        queue.add(20);
        assertEquals(20, queue.getTail());
    }

    @Test
    @DisplayName("Queue can remove item from the front")
    void remove_shouldRemoveItemFromTheFront() {
        queue.add(10);
        assertEquals(10, queue.remove());
    }

    @Test
    @DisplayName("Should throw exception if queue is empty")
    void remove_shouldThrowExceptionWhenQueueIsEmpty() {
        assertThrows(RuntimeException.class, () -> {
            queue.remove();
        });
    }
}