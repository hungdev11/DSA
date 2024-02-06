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
        Node curNode = head;
        while(curNode != null)
        {
            System.out.print(curNode.value + " ");
            curNode = curNode.next;
        }
        System.out.println("\n");
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
    public int searchNodeValue(int value) {
        int foundAt = 0;
        Node current = head;
        while (current != null) {
            foundAt++;
            if (current.value == value) {
                return foundAt;
            }
            else
            {
                current = current.next;
            }
        }
        return -1;
    }
    public Node deleteNode(int position) {
        if (position > size || position < 1) {
            System.out.println("Wrong position input! Can't delete value.");
            return head;
        }
        if (head == null) {
            System.out.println("Your linked list is empty!!");
            return head;
        } else {
            if (position == 1) {
                head = head.next;
                size--;
                if (size == 0) {
                    tail = null;
                }
            } else {
                Node travelNode = head;
                for (int i = 1; i < position - 1; i++) {
                    travelNode = travelNode.next;
                }
                if (position == size) {
                    tail = travelNode;
                    travelNode.next = null;
                } else {
                    Node tempNode = travelNode.next;
                    travelNode.next = tempNode.next;
                    tempNode.next = null;
                }
                size--;
            }
        }
        return head;
    }
    public void deleteAll()
    {
        head = tail = null;
    }
}