import java.util.LinkedList;
import java.util.Queue;

public class AVLTree {
    public Node root;

    AVLTree() {
        root = null;
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
    private Node search(Node currNode, int value) {
        if(currNode == null)
            return null;
        else if(currNode.data == value)
            return currNode;
        else if(currNode.data >= value)
            return search(currNode.left, value);
        else
            return search(currNode.right, value);
    }
    public Node search(int value) {
        return search(root, value);
    }
    public int getHeight(Node node) {
        return node==null?0:node.height;
    }
    public int setHeight(Node node) {
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }
    public Node rotateRight(Node disBalanceNode) {
        Node newRoot = disBalanceNode.left;
        disBalanceNode.left = disBalanceNode.left.right;
        newRoot.right = disBalanceNode;
        disBalanceNode.height = setHeight(disBalanceNode);
        newRoot.height = setHeight(newRoot);
        return newRoot;
    }
    public Node rotateLeft(Node disBalanceNode) {
        Node newRoot = disBalanceNode.right;
        disBalanceNode.right = disBalanceNode.right.left;
        newRoot.left = disBalanceNode;
        disBalanceNode.height = setHeight(disBalanceNode);
        newRoot.height = setHeight(newRoot);
        return newRoot;
    }
    public int getBalanceNode(Node node) {
        return node==null?0:getHeight(node.left) - getHeight(node.right);
    }
    private Node insertNode(Node node, int value) {
        if (node == null) {
            Node newNode = new Node(value);
            newNode.height = 1;
            return newNode;
        } else if (node.data < value) {
            node.right = insertNode(node.right, value);
        } else {
            node.left = insertNode(node.left, value);
        }

        node.height = setHeight(node);
        int balance = getBalanceNode(node);

        if (balance > 1 && value <= node.left.data) {
            return rotateRight(node);
        } else if (balance > 1 && value > node.left.data) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        } else if (balance < -1 && value > node.right.data) {
            return rotateLeft(node);
        } else if (balance < -1 && value <= node.right.data) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }
        return node;
    }
    public void insert(int value) {
        root = insertNode(root, value);
    }
    public void deleteAll()
    {
        root = null;
    }
}
