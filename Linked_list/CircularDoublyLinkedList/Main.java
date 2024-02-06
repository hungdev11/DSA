public class Main{
    public static void main(String[] args)
    {
        CircularDoublyLinkedList CDLL = new CircularDoublyLinkedList();
        CDLL.createCDLL(6);
        System.out.println(CDLL.head.prev.value);
        System.out.println(CDLL.head.next.value);

    }
}