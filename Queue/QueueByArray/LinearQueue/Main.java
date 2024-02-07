public class Main{
    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.enQueue(4);
        q.enQueue(43);
        q.enQueue(2);
        q.enQueue(1);
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        //System.out.println(q.peek());
        System.out.println(q.deQueue());

        System.out.println(q.front + " " + q.rear);
        q.enQueue(4);

        // 4   43  2   1
        //         f   r
    }
}