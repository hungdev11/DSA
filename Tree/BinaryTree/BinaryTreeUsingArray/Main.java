public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree(9);
        //bt.deleteTree();
        bt.insert("N1");
        bt.insert("N2");
        bt.insert("N3");
        bt.insert("N4");
        bt.insert("N5");
        bt.insert("N6");
        bt.insert("N7");
        bt.insert("N8");
        bt.insert("N9");
        bt.preOrder(1);
        System.out.println("\n");
        bt.inOrder(1);
        System.out.println("\n");
        bt.postOrder(1);
        System.out.println("\n");
        bt.levelOrder();
        //System.out.println(bt.search("N3"));;
        //System.out.println(bt.search("N10"));

        bt.delete("N5");
        bt.delete("N10");
        bt.deleteTree();
        bt.levelOrder();
    }
}