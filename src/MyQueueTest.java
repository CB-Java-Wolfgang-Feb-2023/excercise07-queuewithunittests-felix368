import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    private MyQueue queue;
    @BeforeEach
    void setUp() {
        queue = new MyQueue();

        for (int i = 0; i < 20; i++) {
            queue.enqueue(i);
        }

    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void isEmpty() {

        assertFalse(queue.isEmpty());
        queue = new MyQueue();
        assertTrue(queue.isEmpty());
    }

    @Test
    void enqueue() {

    }

    @Test
    void dequeue() {
        queue = new MyQueue();

        queue.enqueue(1);
        queue.dequeue();


        queue.enqueue(2);
        queue.dequeue();
    }

    @Test
    void getFront() {
        assertEquals(queue.getFront(),20);

        queue = new MyQueue();
        System.out.println(queue.getFront());
    }

    @Test
    void getRear() {
        assertEquals(queue.getRear(),0);
    }


}