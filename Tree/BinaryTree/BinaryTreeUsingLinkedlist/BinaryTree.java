import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public TreeNode root;
    //Traversal
    public void preOrder(TreeNode root) {
        if(root != null) {
            System.out.print(root.data + " ");
            preOrder(root.leftChild);
            preOrder(root.rightChild);
        }
    }
    public void inOrder(TreeNode root)
    {
        if(root != null) {
            inOrder(root.leftChild);
            System.out.print(root.data + " ");
            inOrder(root.rightChild);
        }
    }
    public void postOrder(TreeNode root)
    {
        if(root != null) {
            postOrder(root.leftChild);
            postOrder(root.rightChild);
            System.out.print(root.data + " ");
        }
    }
    public void levelOrder(TreeNode root)
    {
        Queue<TreeNode> nodes = new LinkedList<TreeNode>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            TreeNode currentNode = nodes.remove();
            System.out.print(currentNode.data + " ");
            if(currentNode.leftChild != null)
                nodes.add(currentNode.leftChild);
            if(currentNode.rightChild != null)
                nodes.add(currentNode.rightChild);
        }
    }
    //Search
    public TreeNode searchNode(String value)
    {
        Queue<TreeNode> nodes = new LinkedList<TreeNode>();
        nodes.add(root);
        while(!nodes.isEmpty()) {
            TreeNode currNode = nodes.remove();
            if(currNode.data.equals(value))
                return currNode;
            if(currNode.leftChild != null)
                nodes.add(currNode.leftChild);
            if(currNode.rightChild != null)
                nodes.add(currNode.rightChild);
        }
        return null;
    }
    //Insert
    public void insertNode(String data)
    {
        TreeNode node = new TreeNode(data);
        if(root == null) {
            root = node;
            return;
        }
        else {
            Queue<TreeNode> nodes = new LinkedList<TreeNode>();
            nodes.add(root);
            while (!nodes.isEmpty()) {
                TreeNode currNode = nodes.remove();
                if (currNode.leftChild == null) {
                    currNode.leftChild = node;
                    return;
                }
                else if (currNode.rightChild == null) {
                    currNode.rightChild = node;
                    return;
                }
                else
                {
                    nodes.add(currNode.leftChild);
                    nodes.add(currNode.rightChild);
                }
            }
        }
    }
    //Delete node
    public TreeNode deepestNode() {
        Queue<TreeNode> nodes = new LinkedList<TreeNode>();
        nodes.add(root);
        TreeNode currNode = null;
        while (!nodes.isEmpty()) {
            currNode = nodes.remove();
            if(currNode.leftChild != null)
                nodes.add(currNode.leftChild);
            if(currNode.rightChild != null)
                nodes.add(currNode.rightChild);
        }
        return currNode;
    }
    public void deleteDeepestNode() {
        Queue<TreeNode> nodes = new LinkedList<TreeNode>();
        nodes.add(root);
        TreeNode prevNode, currNode = null;
        while (!nodes.isEmpty()) {
            prevNode = currNode;
            currNode = nodes.remove();
            if (currNode.leftChild == null)
            {
                prevNode.rightChild = null;
                return;
            } else if (currNode.rightChild == null) {
                currNode.leftChild = null;
                return;
            }
            nodes.add(currNode.leftChild);
            nodes.add(currNode.rightChild);
        }
    }
    public void deleteNode(String value) {
        TreeNode needDel = searchNode(value);
        if (needDel == null) {
            System.out.println("Node not found!");
            return;
        }
        else {
            TreeNode replaceNode = deepestNode();
            needDel.data = replaceNode.data;
            deleteDeepestNode();
        }
    }
    //Delete tree
    public void deleteAllTree() {
        root = null;
    }
}
