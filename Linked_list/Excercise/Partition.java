public class Partition{
    public LinkedList partition(LinkedList ll, int value)
    {
        Node currNode = ll.head;
        if(currNode == null) return null;
        ll.tail = currNode;
        Node nextNode = null;
        while(currNode != null)
        {
            nextNode = currNode.next;
            if(currNode.value < value)
            {
                currNode.next = ll.head;
                ll.head = currNode;
            }
            else
            {
                currNode.next = null;
                ll.tail.next = currNode;
                ll.tail = currNode;
            }
            currNode = nextNode;
        }
        return ll;
    }
    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();
        ll.createLinkedList(1);
        ll.insertNode(2);
        ll.insertNode(4);
        ll.insertNode(1);
        ll.insertNode(3);
        ll.insertNode(1);
        ll.insertNode(0);


        ll.traversalLL();

        new Partition().partition(ll, 2).traversalLL();

    }
}