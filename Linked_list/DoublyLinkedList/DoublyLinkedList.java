public class DoublyLinkedList{
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
    public Node createDLL(int nodeValue)
    {
        Node newNode = newNode(nodeValue);
        head = newNode;
        tail = newNode;
        size = 1;
        return head;
    }
    public Node insertDLL(int position, int nodeValue)
    {
        if(position < 1 || position > size+1)
        {
            System.out.println("Your postition is invalid!");
            return head;
        }
        if(head == null)
        {
            return createDLL(nodeValue);
        }
        else
        {
            Node newNode = newNode(nodeValue);
            if(position == 1)
            {
                head.prev = newNode;
                newNode.next = head;
                head = newNode;
            }
            else if(position == size+1)
            {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }   
            else
            {
                Node travelNode = head;
                for(int i = 1; i < position - 1; i++)
                {
                    travelNode = travelNode.next;
                }
                newNode.next = travelNode.next;
                travelNode.next.prev = newNode;
                newNode.prev = travelNode;
                travelNode.next = newNode;
            }
        }
        size++;
        return head;
    }
    public void traversalDLL()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println("\n");
    }
    public int searchDLL(int nodeValue)
    {
        Node temp = head;
        int foundAt = 0;
        while(temp != null)
        {
            foundAt++;
            if(temp.value == nodeValue)
                return foundAt;
            temp = temp.next;
        }
        return -1;
    }
    public void reverseTraversalDLL()
    {
        Node temp = tail;
        while(temp != null)
        {
            System.out.print(temp.value + " ");
            temp = temp.prev;
        }
        System.out.println("\n");
    }
}