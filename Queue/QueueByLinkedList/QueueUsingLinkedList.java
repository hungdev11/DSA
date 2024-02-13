public class QueueUsingLinkedList {
    
    public LinkedList ll;
    
    public QueueUsingLinkedList()
    {
        ll = new LinkedList();
    }
    public boolean isEmpty()
    {
        return ll.head == null;
    }
    public void enqueue(int value)
    {
        ll.insertNode(value);
        System.out.println("The queue insert successfully!");
    }
    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("The Queue is empty!");
            return Integer.MIN_VALUE;
        }
        int value = ll.head.value;
        ll.head = ll.head.next;
        ll.size--;
        return value;
    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("The Queue is empty!");
            return Integer.MIN_VALUE;
        }
        return ll.head.value;
    }
    public void delete()
    {
        ll.head = null;
        ll.tail = null;
    }
}