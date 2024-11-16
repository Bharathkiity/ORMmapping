// QueueOperations.java
public class Queue {
    private int front, rear, capacity;
    private int[] queue;

    // Constructor to initialize the queue with a specific capacity
    public Queue(int capacity) {
        this.capacity = capacity;
        front = rear = -1;
        queue = new int[capacity];
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Check if the queue is full
    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }

    // Add an element to the queue (enqueue)
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        System.out.println("Enqueued: " + item);
    }

    // Remove an element from the queue (dequeue)
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Dequeued: " + queue[front]);
        if (front == rear) { // Queue becomes empty
            front = rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
    }

    // Retrieve the element at the front of the queue without removing it (peek)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    // Display the queue elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Queue elements: ");
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            if (i == rear) {
                break;
            }
            i = (i + 1) % capacity;
        }
        System.out.println();
    }
}
