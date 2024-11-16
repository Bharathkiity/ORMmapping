// TestQueue.java
public class QueueTest {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        // Test enqueuing elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        
        // Display queue
        queue.display();

        // Test dequeue
        queue.dequeue();
        queue.display();

        // Test peek
        System.out.println("Front element: " + queue.peek());

        // Enqueue after dequeue to see the circular behavior
        queue.enqueue(60);
        queue.display();

        // Test full condition
        queue.enqueue(70); // This should show that the queue is full

        // Further dequeuing to empty the queue
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        
        queue.display();  // Should show empty queue

        queue.dequeue();  // Trying to dequeue from empty queue
    }
}
