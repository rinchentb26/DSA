class CircularQueue {
    int capacity;
    int[] data;
    int front, rear;

    CircularQueue(int capacity) {
        this.capacity = capacity;
        front = rear = -1;
        data = new int[capacity];
    }

    private boolean isFull() {
        if ((rear + 1) % capacity == front) {
            return true;
        }
        return false;
    }

    private boolean isEmpty() {
        return front == -1;
    }

    public boolean enqueue(int val) {
        if (isFull()) {
            System.out.println("Queue is Full! Cant add!");
            return false;
        } else {
            if (front == -1)
                front = 0;
            rear = (rear + 1) % capacity;
            data[rear] = val;
            System.out.println(data[rear] + " enqueued!");
            return true;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Empty! Can't dequeue");
            return Integer.MIN_VALUE;
        } else {
            int val = data[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % capacity;
            }
            return val;
        }
    }
}

class Main {
    public static void main(String[] args) {

        CircularQueue q = new CircularQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.enqueue(10);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());


    }
}