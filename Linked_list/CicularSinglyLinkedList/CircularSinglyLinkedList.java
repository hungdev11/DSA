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
    public Node insertCSLL(int position, int nodeValue)
    {
        if(position < 1 || position > size + 1)
        {
            System.out.println("Can't insert at that position!");
            return head;
        }
        if(head == null)
        {
            return createCSLL(nodeValue);
        }
        else{
            Node newNode = new Node();
            newNode.value = nodeValue;
            newNode.next = null;

            if(position == 1)
            {
                newNode.next = head;
                head = newNode;
                tail.next = newNode;
            }
            else if(position == size + 1)
            {
                tail.next = newNode;
                tail = newNode;
                newNode.next = head;
            }
            else
            {
                Node travelNode = head;
                for(int i = 1; i<position-1; i++)
                {
                    travelNode = travelNode.next;
                }
                newNode.next = travelNode.next;
                travelNode.next = newNode;
            }
        }
        size++;
        return head;
    }
    public void traversalCSLL()
    {
        Node temp = head;
        if(temp == null) return;
        do
        {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }while(temp != tail.next);
        System.out.println("\n");
    }
    public int searchCSLL(int nodeValue)
    {
        int foundAt = 0;
        Node temp = head;
        do{
            foundAt++;
            if(temp.value == nodeValue)
            {
                return foundAt;
            }
            temp = temp.next;
        }while(temp != tail.next && temp != null);
        return -1;
    }
}