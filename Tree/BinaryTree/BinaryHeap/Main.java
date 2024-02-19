public class Main {
    public static void main(String[] args) {
        BinaryHeap bh = new BinaryHeap(6);
        bh.insert(20, "Max");
        bh.insert(5, "Max");
        bh.insert(10, "Max");
        bh.insert(15, "Max");
        bh.insert(2, "Max");
        bh.insert(1, "Max");

        System.out.println(bh.extractTop("Max"));
        //System.out.println(bh.peek());
        bh.deleteBH();
        bh.levelOrder();
    }
}