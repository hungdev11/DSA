public class Main {
    public static void main(String[] args) {
        QueueViaStack qvs = new QueueViaStack();

        qvs.enqueue(4);
        qvs.enqueue(5);
        qvs.enqueue(1);
        qvs.enqueue(2);
        qvs.enqueue(3);
        System.out.println(qvs.dequeue());
        System.out.println(qvs.peek());
        System.out.println(qvs.size());
    }
}
