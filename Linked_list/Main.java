public class Main{
    public static void main(String[] args)
    {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.insertNode(1, 54);
        sLL.insertNode(1, 1);
        sLL.insertNode(2, 2);
        sLL.insertNode(1, 3);
        sLL.insertNode(1, 56);
        sLL.insertNode(6, 4);
        System.out.println(sLL.size); 
        System.out.println(sLL.head.value);
        System.out.println(sLL.tail.value);
        sLL.traversalSinglyLinkedList();
        System.out.println(sLL.searchNodeValue(0));
    }
}
// 56 3 1 2 54 6  
// h,          t