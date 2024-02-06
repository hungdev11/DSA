public class Main{
    public static void main(String[] args)
    {
        DoublyLinkedList DLL = new DoublyLinkedList();
        DLL.insertDLL(1, 0);
        DLL.insertDLL(1, 2);
        DLL.insertDLL(1, 1);
        DLL.insertDLL(2, 4);
        DLL.insertDLL(1, 7);
        DLL.insertDLL(6, 6);
        System.out.println(DLL.size);
        DLL.traversalDLL();
        //System.out.println(DLL.searchDLL(-2));
        //DLL.reverseTraversalDLL();

        DLL.deleteNode(1);
        DLL.deleteNode(5);
        DLL.deleteNode(2);
        DLL.deleteNode(1);
        DLL.deleteNode(1);
        DLL.deleteNode(1);

        DLL.traversalDLL();
        System.out.println(DLL.size);


        // 7 1 4 2 0 6
    }
}