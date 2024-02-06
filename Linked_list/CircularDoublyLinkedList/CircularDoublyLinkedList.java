public class CircularDoublyLinkedList{
    public Node head;
    public Node tail;
    public int size;

    public Node newNode(int nodeValue)
    {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.prev = null;
        newNode.next = null;
        return newNode;
    }
    public Node createCDLL(int nodeValue)
    {
        Node newNode = newNode(nodeValue);
        newNode.prev = newNode;
        newNode.next = newNode;
        head = tail = newNode;
        size = 1;
        return head;
    }
}