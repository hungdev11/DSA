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
            return;
        }
        do
        {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }while(temp != tail.next);
        System.out.println("\n");
    }
    public void reverseTraversalCDLL()
    {
        Node temp = tail;
        if(temp == null)
        {
            System.out.println("Empty linked list!");
        }
        do
        {
            System.out.print(temp.value + " ");
            temp = temp.prev;
        }while(temp != head.prev);
        System.out.println("\n");
    }
    public int searchANode(int nodeValue)
    {
        Node temp = head;
        int foundAt = 0;
        do
        {
            foundAt++;
            if(temp.value == nodeValue)
                return foundAt;
            temp = temp.next;
        }while(temp != tail.next);
        return -1;
    }
    public Node deleteNode(int position)
    {
        if(position < 1 || position > size)
        {
            System.out.println("Invalid position!");
            return head;
        }
        if(head != null)
        {
            if(position == 1)
            {
                head = head.next;
                head.prev = tail;
                tail.next = head;
            }
            else if(position == size)
            {
                tail = tail.prev;
                tail.next = head;
                head.prev = tail;
            }
            else
            {
                Node temp = head;
                for(int i = 1; i< position-1; i++)
                {
                    temp = temp.next;
                }
                Node temp2 = temp.next;
                temp.next = temp2.next;
                temp2.next.prev = temp;
            }
        }
        size--;
        return head;
    }
    public void deleteAll()
    {
        if(head == null)
        {
            System.out.println("List alraedy empty!");
            return;
        }
        Node temp = head;
        do
        {
            temp.prev = null;
            temp = temp.next;
        }while(temp != tail.next);
        tail.next = null;
        head = tail = null;
        size = 0;
    }
}