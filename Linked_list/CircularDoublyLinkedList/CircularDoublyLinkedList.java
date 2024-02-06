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
    public Node insertNode(int position, int nodeValue)
    {
        if(position < 1 || position > size +1)
        {
            System.out.println("Invalid position");
            return head;
        }
        if(head == null)
        {
            return createCDLL(nodeValue);
        }
        else
        {
            Node newNode = newNode(nodeValue);
            if(position == 1){
                head.prev = newNode;
                newNode.next = head;
                newNode.prev = tail;
                head = newNode;
                tail.next = head;
            }else if(position == size+1){
                tail.next = newNode;
                newNode.prev = tail;
                newNode.next = head;
                tail = newNode;
                head.prev = tail;
            }else{
                Node temp = head;
                for(int i = 1; i<position-1; i++)
                {
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next.prev = newNode;
                temp.next = newNode;
                newNode.prev = temp;
            }
        }
        size++;
        return head;
    }
    public void traversalCDLL()
    {
        Node temp = head;
        if(temp == null)
        {
            System.out.println("Empty linked list!");
        }
        do
        {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }while(temp != tail.next);
        System.out.println("\n");
    }
}