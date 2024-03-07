import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    int[] arr;

    public BucketSort(int[] arr) {
        this.arr = arr;
    }

    public void print() {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public void printBucket(ArrayList<Integer>[] buckets) {
        for (int i = 0; i < buckets.length; i++) {
            System.out.println("\nBucket#" + i + ":");
            for (int j = 0; j < buckets[i].size(); j++) {
                System.out.print(buckets[i].get(j) + " ");
            }
        }
    }

    public void sort() {
        int n = arr.length;
        int numberOfBuckets = (int) Math.ceil(Math.sqrt(n));
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }
        ArrayList<Integer>[] buckets = new ArrayList[numberOfBuckets];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }
        for (int value : arr) {
            int bucketNumber = (int) Math.ceil((float) value * numberOfBuckets / (float) maxValue);
            buckets[bucketNumber - 1].add(value);
        }

        System.out.println("Buckets before sorting...");
        printBucket(buckets);

        for (ArrayList<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }
        System.out.println("\nBuckets after sorting...");

        int index = 0;
        for (ArrayList<Integer> bucket : buckets) {
            for (int value : bucket) {
                arr[index++] = value;
            }
        }
        printBucket(buckets);
        System.out.println("\nResult...");
        print();
    }
}
