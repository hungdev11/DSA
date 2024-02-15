public class BinaryTree {
    String[] arr;
    int lastUsedIndex;

    public BinaryTree(int size) {
        arr = new String[size+1];
        lastUsedIndex = 0;
    }
    public boolean isFull() {
        return arr.length-1 == lastUsedIndex;
    }
    public void insert(String value) {
        if(!isFull()) {
            arr[lastUsedIndex+1] = value;
            lastUsedIndex++;
        } else {
            System.out.println("The BT is full at : " + value);
        }
    }
    public void preOrder(int rootIndex)
    {
        if( rootIndex > lastUsedIndex)
            return;
        System.out.print(arr[rootIndex] + " ");
        preOrder(2 * rootIndex);
        preOrder(2 * rootIndex + 1);
    }
    public void inOrder(int rootIndex)
    {
        if( rootIndex > lastUsedIndex)
            return;
        inOrder(2 * rootIndex);
        System.out.print(arr[rootIndex] + " ");
        inOrder(2 * rootIndex + 1);
    }
    public void postOrder(int rootIndex)
    {
        if( rootIndex > lastUsedIndex)
            return;
        postOrder(2 * rootIndex);
        postOrder(2 * rootIndex + 1);
        System.out.print(arr[rootIndex] + " ");
    }
    public void levelOrder()
    {
        for(int i = 1; i <= lastUsedIndex; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
