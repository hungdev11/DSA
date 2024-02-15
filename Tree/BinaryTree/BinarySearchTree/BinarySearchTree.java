import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    public Node root;

    BinarySearchTree() {
        root = null;
    }
    private Node insert(Node currNode, int value) {
        if (currNode == null) {
            Node node = new Node(value);
            currNode = node;
        } else {
            if (currNode.data >= value) {
                currNode.left = insert(currNode.left, value);
            } else {
                currNode.right = insert(currNode.right, value);
            }
        }
        return currNode;
    }
    public void insert(int value) {
        root = insert(root, value);
    }
    public void preOrder(Node curNode) {
        if(curNode != null) {
            System.out.print(curNode.data + " ");
            preOrder(curNode.left);
            preOrder(curNode.right);
        }
    }   
    public void InOrder(Node curNode) {
        if(curNode != null) {
            InOrder(curNode.left);
            System.out.print(curNode.data + " ");
            InOrder(curNode.right);
        }
    }   
    public void postOrder(Node curNode) {
        if(curNode != null) {
            postOrder(curNode.left);
            postOrder(curNode.right);
            System.out.print(curNode.data + " ");
        }
    }   
    public void levelOrder() {
        Queue<Node> nodes = new LinkedList<Node>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            Node node = nodes.remove();
            System.out.print(node.data + " ");
            if (node.left != null)
                nodes.add(node.left);
            if (node.right != null)
                nodes.add(node.right);
        }
    }
}
