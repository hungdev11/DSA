import java.util.HashSet;
import java.util.Set;

public class RemoveDups
{
    public static LinkedList removeDupsNode(LinkedList ll)
    {
        Set<Integer> setList = new HashSet<>();
        Node currNode = ll.head;
        Node prevNode = null;
        while (currNode != null) {
            if(setList.contains(currNode.value))
            {
                prevNode.next = currNode.next;
                ll.size--;
            }
            else{
                setList.add(currNode.value);
                prevNode = currNode;
            }
            currNode = currNode.next;
        }
        return ll;
    }
    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();
        ll.createLinkedList(1);
        ll.insertNode(2);
        ll.insertNode(1);
        ll.insertNode(3);
        ll.insertNode(1);

        ll.traversalLL();
        ll = removeDupsNode(ll);
        ll.traversalLL();
    }
}