public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        TreeNode N1 = new TreeNode("N1");
        TreeNode N2 = new TreeNode("N2");
        TreeNode N3 = new TreeNode("N3");
        N1.leftChild = N2; N1.rightChild = N3;
        TreeNode N4 = new TreeNode("N4");
        TreeNode N5 = new TreeNode("N5");
        N2.leftChild = N4; N2.rightChild = N5;
        TreeNode N6 = new TreeNode("N6");
        TreeNode N7 = new TreeNode("N7");
        N3.leftChild = N6; N3.rightChild = N7;
        TreeNode N8 = new TreeNode("N8");
        TreeNode N9 = new TreeNode("N9");
        N4.leftChild = N8; N4.rightChild = N9;
        bt.root = N1;
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
