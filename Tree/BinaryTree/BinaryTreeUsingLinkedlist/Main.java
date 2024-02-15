public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        for(int i = 1; i<= 10 ; i++)
        {
            bt.insertNode("N" + i);;
        }
        System.out.print("PreOrder:\n");
        bt.preOrder(bt.root);
        System.out.print("\nInOrder:\n");
        bt.inOrder(bt.root);
        System.out.print("\nPostOrder:\n");
        bt.postOrder(bt.root);
        System.out.print("\nLevelOrder:\n");
        bt.levelOrder(bt.root);

        System.out.println(bt.searchNode("N5"));
        System.out.println(bt.searchNode("N10"));
    }
}
