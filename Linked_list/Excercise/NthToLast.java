public class NthToLast{
    public Node nthToLast(LinkedList ll, int nth)
    {
        Node p1 = ll.head;
        Node p2 = ll.head;
        for(int i=0; i< nth; i++)
        {
            if(p2 == null) return p2;
            p2 = p2.next;
        }
        while(p2 != null)
        {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }
    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();
        ll.createLinkedList(1);
        ll.insertNode(2);
        ll.insertNode(1);
        ll.insertNode(3);
        ll.insertNode(1);

        ll.traversalLL();

        System.out.println(new NthToLast().nthToLast(ll, 2).value);
    }
}