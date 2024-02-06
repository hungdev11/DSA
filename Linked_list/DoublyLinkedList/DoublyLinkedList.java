public class DoublyLinkedList{
    public Node head;
    public Node tail;
    public int size;

    public Node createDLL(int nodeValue)
    {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.prev = null;
        newNode.next = null;
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }
}