public class Main {
    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6, 7 };
        MergeSort.printArray(arr);
        MergeSort.sort(arr, 0, arr.length - 1);
        MergeSort.printArray(arr);
    }
}