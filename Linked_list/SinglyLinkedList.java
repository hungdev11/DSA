public class SinglyLinkedList{
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue){
        Node newNode = new Node();
        newNode.next = null;
        newNode.value = nodeValue;

        head = newNode;
        tail = newNode;

        size = 1;

        return head;
    }
}