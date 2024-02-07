public class Main{
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(4);
        cq.enqueue(1);
        cq.enqueue(3);
        cq.enqueue(2);
        cq.enqueue(0);
        //cq.enqueue(2);
        cq.dequeue();
        cq.dequeue();
        cq.dequeue();
        cq.enqueue(2);
        cq.enqueue(4);
        cq.dequeue();
        System.out.println(cq.front + " " + cq.rear);
        System.out.println(cq.arr[cq.front] + " " + cq.arr[cq.rear]);
        
        //   24_0
        //    r f
    }
}