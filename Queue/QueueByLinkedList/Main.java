public class Main {

    public static void main(String[] args) {
        QueueUsingLinkedList q = new QueueUsingLinkedList();
        //q.enqueue(1);
        //System.out.println(q.peek());
        //System.out.println(q.dequeue());
        q.enqueue(1);q.enqueue(3);q.enqueue(2);q.enqueue(5);
        System.out.println(q.dequeue());
        q.ll.traversalLL();
        q.delete();
        q.ll.traversalLL();
    }
    
}