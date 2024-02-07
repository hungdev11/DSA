public class Intersection{
    public Node getKthNode(Node head, int k)
    {
        Node currNode = head;
        while(k>0 && currNode != null)
        {
            currNode = currNode.next;
            k--;
        }
        return currNode;
    }
    public Node findIntersection(LinkedList ll1, LinkedList ll2)
    {
        if(ll1.head == null || ll2.head == null) return null;
        if(ll1.tail != ll2.tail) return null;

        Node longer = ll1.size > ll2.size ? ll1.head : ll2.head;
        Node shorter = (longer == ll1.head) ? ll2.head : ll1.head;

        longer = getKthNode(longer, Math.abs(ll1.size-ll2.size));

        while(shorter != longer)
        {
            shorter = shorter.next;
            longer = longer.next;
        }
        return longer;
    }
    public void addSameNode(LinkedList a, LinkedList b, int value)
    {
        Node node = new Node();
        node.value = value;

        a.tail.next = node;
        a.tail = node;
        a.size++;
        b.tail.next = node;
        b.tail = node;
        b.size++;
    }
    public static void main(String[] args)
    {
        LinkedList a = new LinkedList();
        LinkedList b = new LinkedList();

        a.insertNode(3);
        a.insertNode(1);
        a.insertNode(5);
        a.insertNode(9);

        b.insertNode(2);
        b.insertNode(4);
        b.insertNode(6);

        Intersection i = new Intersection();
        i.addSameNode(a, b, 7);
        i.addSameNode(a, b, 2);
        i.addSameNode(a, b, 1);

        a.traversalLL();
        b.traversalLL();

        System.out.println(i.findIntersection(a, b).value);
    }
}