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
    public static Node minimumRightSide(Node root) {
        Node temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp;
    }
    private Node deleteNode(Node root, int value) {
        if (root == null)
            return root;
        else if ( value > root.data)
            root.right = deleteNode(root.right, value);
        else if (value < root.data)
            root.left = deleteNode(root.left, value);
        else {
            if (root.left != null && root.right != null) {
                Node replaceNode = minimumRightSide(root.right);
                root.data = replaceNode.data;
                root.right = deleteNode(root.right, replaceNode.data);
            } else if (root.left == null) {
                root = root.right;
            } else if (root.left == null) {
                root = root.left;
            } else {
                root = null;
            }
        }
        return root;
    }
    public void delete(int value)
    {
        root = deleteNode(root, value);
    }
    public void deleteAll()
    {
        root = null;
    }
    private boolean isBinaryUtil(Node root, int minValue, int maxValue) {
        if (root == null) return true;
        if (root.data < minValue && root.data < maxValue 
            && isBinaryUtil(root.left, minValue, root.data) 
            && isBinaryUtil(root.right, root.data, maxValue))
            return true;
        else return false;
    }
    public boolean isBinarySearchTree(Node root) {
        return isBinaryUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
