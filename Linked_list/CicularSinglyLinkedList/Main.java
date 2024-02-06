public class Main{
    public static void main(String[] args)
    {
        CircularSinglyLinkedList CSLL = new CircularSinglyLinkedList();
        CSLL.createCSLL(5);
        System.out.println(CSLL.head.next.value);

    }
}