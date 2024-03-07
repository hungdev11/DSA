public class Main {
    public static void main(String[] args) {
        int[] arr = { 12, 4, 5, 6, 7, 3, 1, 15 };
        QuickSort.printArray(arr);
        QuickSort.sort(arr, 0, arr.length - 1);
        QuickSort.printArray(arr);
    }
}