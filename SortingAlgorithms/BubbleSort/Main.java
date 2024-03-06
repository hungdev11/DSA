public class Main {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] arr = { 5, 1, 3, 2, 5, 7, 4 };
        bs.printArr(arr);
        bs.sort(arr);
        bs.printArr(arr);
    }
}