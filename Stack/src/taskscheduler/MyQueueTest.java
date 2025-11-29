package taskscheduler;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

public class MyQueueTest {

    @Test
    void testEnqueueAndPeek() {
        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("Task1");
        queue.enqueue("Task2");
        
   
        assertEquals("Task1", queue.peek(), "İlk eklenen eleman (Task1) başta olmalı."); 
    }

    @Test
    void testDequeueOrder() {
        MyQueue<Integer> queue = new MyQueue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        
        
        assertEquals(10, queue.dequeue(), "İlk çıkan 10 olmalı (FIFO).");
        assertEquals(20, queue.dequeue(), "İkinci çıkan 20 olmalı.");
    }
    
    @Test
    void testIsEmptyAndSize() {
        MyQueue<Double> queue = new MyQueue<>();
        
        assertTrue(queue.isEmpty(), "Yeni oluşturulan kuyruk boş olmalı.");
        assertEquals(0, queue.size());
        
        queue.enqueue(1.1);
        assertFalse(queue.isEmpty(), "Eleman eklendikten sonra kuyruk dolu olmalı.");
        assertEquals(1, queue.size());
        
        queue.dequeue();
        assertTrue(queue.isEmpty(), "Son eleman çıkarıldıktan sonra kuyruk tekrar boş olmalı.");
        assertEquals(0, queue.size());
    }

    @Test
    void testDequeueOnEmptyQueueThrowsException() {
        MyQueue<String> queue = new MyQueue<>();
        
     
        assertThrows(NoSuchElementException.class, queue::dequeue, 
                     "Boş kuyruktan dequeue çağrısı NoSuchElementException fırlatmalı.");
    }
}