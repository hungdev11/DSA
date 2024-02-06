public class LinkedList{
    public Node head;
    public Node tail;
    public int size;

    public Node createNode(int nodeValue)
    {
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        node.prev = null;
        return node;
    }
    public Node createLinkedList(int nodeValue)
    {
        Node newNode = createNode(nodeValue);
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }
    public void insertNode(int nodeValue)
    {
        Node newNode = createNode(nodeValue);
        tail.next = newNode;
        tail = newNode;
        size++;
    }
    public void traversalLL()
    {
        Node temp = head;
        if(temp == null)
        {
            System.out.println("Your list is empty!");
            return;
        }
        for(int i = 0; i<size; i++)
        {
            System.out.print(temp.value);
            if(i != size - 1)
            {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println("\n");
    }
}