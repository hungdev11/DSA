public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(4);
        bst.insert(5);
        bst.insert(1);
        bst.insert(2);
        bst.insert(3);
        bst.insert(7);
        bst.insert(8);
        bst.insert(6);
        bst.insert(0);
        

        bst.preOrder(bst.root);
        System.out.println("\n");
        bst.InOrder(bst.root);
        System.out.println("\n");
        bst.postOrder(bst.root);
        System.out.println("\n");
        bst.levelOrder();

        //System.out.println(bst.search(6).data);
        //System.out.println(bst.search(10));

        //System.out.println(BinarySearchTree.minimumRightSide(bst.root).data);
        bst.delete(4);
        System.out.println("\n");
        bst.deleteAll();
        bst.levelOrder();


    }
}
