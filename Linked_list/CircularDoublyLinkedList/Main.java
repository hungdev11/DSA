public class Main{
    public static void main(String[] args)
    {
        CircularDoublyLinkedList CDLL = new CircularDoublyLinkedList();
        CDLL.insertNode(1, 0);
        CDLL.insertNode(2, 1);
        CDLL.insertNode(1, 2);
        CDLL.insertNode(2, 3);
        CDLL.insertNode(5, 6);
        CDLL.insertNode(6, 5);
        CDLL.traversalCDLL();
        //CDLL.reverseTraversalCDLL();

        //CDLL.deleteNode(1);
        //CDLL.deleteNode(3);
        //CDLL.deleteNode(4);
        CDLL.deleteAll();
        CDLL.traversalCDLL();
        //System.out.println(CDLL.searchANode(6));
        //System.out.println(CDLL.searchANode(-2));
        System.out.println(CDLL.size);

        //2 3 0 1 6 5
    }
}