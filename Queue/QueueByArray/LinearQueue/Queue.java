public class Queue {
    public int front;
    public int rear;
    public int[] arr;

    public Queue(int size) {
        arr = new int[size];
        front = rear = -1;
    }

    public boolean isFull() {
        return rear == arr.length - 1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The Queue is full!");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        arr[++rear] = value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("The Queue is empty!");
            return Integer.MIN_VALUE;
        }
        return arr[front];
    }

    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The Queue is empty!");
            return Integer.MIN_VALUE;
        }
        int value = arr[front++];
        if (front > rear) {
            front = rear = -1;
        }
        return value;
    }

    public void deleteQueue() {
        arr = null;
    }
}
