import static org.junit.jupiter.api.Assertions.*;

class TestMyQueue {

    @org.junit.jupiter.api.Test
    void isFull() {
        MyQueue queue = new MyQueue();
        queue.enqueue(1);
        assertFalse(queue.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
    }

    @org.junit.jupiter.api.Test
    void enqueue() {
    }

    @org.junit.jupiter.api.Test
    void dequeue() {
    }

    @org.junit.jupiter.api.Test
    void getFront() {
    }

    @org.junit.jupiter.api.Test
    void getRear() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}