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
        System.out.println(CDLL.size);

        //2 3 0 1 6 5
    }
}