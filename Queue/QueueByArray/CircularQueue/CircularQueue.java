public class CircularQueue {
    public int[] arr;
    public int front;
    public int rear;
    int size;

    public CircularQueue(int size) {
        arr = new int[size];
        front = -1;
        rear = -1;
        this.size = size;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public boolean isFull() {
        return (front == rear + 1) || (front == 0 && rear == size - 1);
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("The Queue is full!");
            return;
        }
        if (isEmpty())
            front = 0;
        rear = (rear == size - 1) ? 0 : rear + 1;
        arr[rear] = value;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("The Queue is empty!");
            return Integer.MIN_VALUE;
        }
        int temp = arr[front];
        arr[front] = Integer.MIN_VALUE;
        if (front == rear)
            front = rear = -1;
        else if (front == size - 1)
            front = 0;
        else
            front++;
        return temp;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The Queue is empty!");
            return Integer.MIN_VALUE;
        }
        return arr[front];
    }

    public void deleteQueue() {
        arr = null;
        front = rear = -1;
    }
}
