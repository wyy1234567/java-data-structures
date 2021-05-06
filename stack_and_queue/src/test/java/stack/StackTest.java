package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack stack;

    @BeforeEach
    void setup() {
        stack = new Stack();
    }

    @Test
    @DisplayName("Stack is empty when initialization")
    void shouldInitializeEmptyStack() {
        assertTrue(stack.isEmpty());
    }

    @Test
    @DisplayName("Stack can peek its top item")
    void peek_shouldPeekTopItemOfStack() {
        stack.push(10);
        assertEquals(10, stack.peek());
    }

    @Test
    @DisplayName("Stack can push item to its top")
    void push_shouldPushItemToStackTop() {
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.peek());
    }

    @Test
    @DisplayName("Stack can pop item from the top")
    void pop_shouldPopItemFromTheTop() {
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.pop());
    }

    @Test
    @DisplayName("Should throw exception if stack is empty")
    void pop_shouldThrowExceptionWhenStackIsEmpty() {
        assertThrows(RuntimeException.class, () -> {
            stack.pop();
        });
    }

}