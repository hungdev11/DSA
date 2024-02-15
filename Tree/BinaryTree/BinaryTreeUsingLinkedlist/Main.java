public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        for(int i = 1; i<= 8 ; i++)
        {
            bt.insertNode("N" + i);;
        }
        bt.deleteNode("N10");
        bt.deleteAllTree();
        System.out.print("PreOrder:\n");
        bt.preOrder(bt.root);
        System.out.print("\nInOrder:\n");
        bt.inOrder(bt.root);
        System.out.print("\nPostOrder:\n");
        bt.postOrder(bt.root);
        System.out.print("\nLevelOrder:\n");
        bt.levelOrder(bt.root);

        System.out.println(bt.deepestNode().data);

        //System.out.println(bt.searchNode("N5"));
        //System.out.println(bt.searchNode("N10"));
    }
}
//pre N8
//cur N9
// 