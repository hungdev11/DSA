public class Main{
    public static void main(String[] args)
    {
        CircularSinglyLinkedList CSLL = new CircularSinglyLinkedList();
        CSLL.insertCSLL(1, 3);
        CSLL.insertCSLL(2, 4);
        CSLL.insertCSLL(1, 2);
        CSLL.insertCSLL(1, 6);
        CSLL.insertCSLL(1, 7);
        CSLL.insertCSLL(6, 0);
        System.out.println(CSLL.size);
        CSLL.traversalCSLL();
        CSLL.deleteNodeCSLL(1);
        CSLL.deleteNodeCSLL(2);
        CSLL.deleteNodeCSLL(4);
        System.out.println(CSLL.size);
        CSLL.traversalCSLL();


        

        //7 6 2 3 4 0
    }
}