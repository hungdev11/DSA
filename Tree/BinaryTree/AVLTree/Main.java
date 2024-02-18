public class Main {
    public static void main(String[] args) {
        AVLTree at = new AVLTree();
        
        at.insert(5);
        at.insert(10);
        at.insert(15);
        at.insert(20);
        at.insert(25);

        at.delete(30);
        at.deleteAll();
        at.levelOrder();
    }
}
