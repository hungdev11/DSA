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
    public void traversalSinglyLinkedList()
    {
        while(head != null)
        {
            System.out.print(head.value + " ");
            head = head.next;
        }
    }
    public Node insertNode(int position, int nodeValue)
    {
        if(position > size + 1 || position < 1)
        {
            System.out.println("Wrong position input!, Can't insert value.");
            return head;
        }
        if(head == null)
        {
            head = createSinglyLinkedList(nodeValue);
            return head;
        }
        else
        {
            Node newNode = new Node();
            newNode.value = nodeValue;
            newNode.next = null;
        
            if(position == 1)
            {
                newNode.next = head;
                head = newNode;
            }
            else if(position == size + 1)
            {
                tail.next = newNode;
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
                travelNode.next = newNode;
            }
        }
        size++;
        return head;
    }
}