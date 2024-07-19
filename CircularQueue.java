public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int count;

    public CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Unable to enqueue item.");
            return;
        }

        rear = (rear + 1) % size;
        queue[rear] = item;
        count++;
        System.out.println(item + " enqueued successfully.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Unable to dequeue item.");
            return;
        }

        int item = queue[front];
        front = (front + 1) % size;
        count--;
        System.out.println(item + " dequeued successfully.");
    }

    public boolean isFull() {
        return count == size;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue: ");
        int i = front;
        while (i != rear) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % size;
        }
        System.out.println(queue[rear]);
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();

        queue.dequeue();
        queue.dequeue();
        queue.display();
    }
}