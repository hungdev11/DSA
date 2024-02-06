public class CircularSinglyLinkedList{
    public Node head;
    public Node tail;
    public int size;

    public Node createCSLL(int nodeValue)
    {
        Node newNode = new Node();
        newNode.value = nodeValue;
        newNode.next = newNode;

        head = tail = newNode;
        size = 1;
        return head;
    }
}