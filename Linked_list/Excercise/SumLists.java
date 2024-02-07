public class SumLists{
    public LinkedList sumLists(LinkedList ll1, LinkedList ll2) {
        LinkedList llSum = new LinkedList();
        Node temp1 = ll1.head;
        Node temp2 = ll2.head;
        int remainDigits = 0; 
    
        while (temp1 != null || temp2 != null /*|| remainDigits > 0*/) {
            int value1 = (temp1 != null) ? temp1.value : 0;
            int value2 = (temp2 != null) ? temp2.value : 0;
    
            int sum = value1 + value2 + remainDigits;
            int sumDigits = sum % 10;
                
            llSum.insertNode(sumDigits);
    
            remainDigits = sum / 10;
    
            if (temp1 != null) temp1 = temp1.next;
            if (temp2 != null) temp2 = temp2.next;
        }
        return llSum;
    }
    public LinkedList sumList2(LinkedList ll1, LinkedList ll2)
    {
        LinkedList llSum = new LinkedList();
        Node temp1 = ll1.head;
        Node temp2 = ll2.head;
        int carry = 0; 
        while(temp1 != null || temp2 != null)
        {
            int result = carry;
            if(temp1 != null)
            {
                result += temp1.value;
                temp1 = temp1.next;
            }
            if(temp2 != null)
            {
                result += temp2.value;
                temp2 = temp2.next;
            }
            llSum.insertNode(result%10);
            carry = result/10;
        }
        return llSum;
    }
    
    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();
        ll.createLinkedList(7);
        ll.insertNode(4);
        ll.insertNode(6);
        ll.insertNode(2);

        LinkedList ll2 = new LinkedList();
        ll2.createLinkedList(5);
        ll2.insertNode(8);
        ll2.insertNode(2);
        //ll2.insertNode(0);

        //647
        //+
        //285
        //932
        ll.traversalLL();
        ll2.traversalLL();

        new SumLists().sumLists(ll, ll2).traversalLL();
    }
}