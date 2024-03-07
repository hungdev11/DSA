public class MergeSort {
    private static void merge(int[] arr, int left, int middle, int right) {
        int leftArrSize = middle - left + 1;
        int rightArrSize = right - middle;

        int[] leftArr = new int[leftArrSize];
        int[] rightArr = new int[rightArrSize];

        for (int i = 0; i < leftArrSize; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int i = 0; i < rightArrSize; i++) {
            rightArr[i] = arr[middle + 1 + i];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < leftArrSize && j < rightArrSize) {
            if (leftArr[i] > rightArr[j]) {
                arr[k] = rightArr[j++];
            } else {
                arr[k] = leftArr[i++];
            }
            k++;
        }
        while (i < leftArrSize) {
            arr[k++] = leftArr[i++];
        }
        while (j < rightArrSize) {
            arr[k++] = rightArr[j++];
        }
    }

    public static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            sort(arr, left, middle);
            sort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
