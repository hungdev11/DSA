public class BinaryHeap {
    public int[] arr;
    public int sizeOfTree;

    BinaryHeap(int size) {
        arr = new int[size + 1];
        sizeOfTree = 0;
    }

    public void levelOrder() {
        for (int i = 1; i <= sizeOfTree ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }
    public boolean isEmpty() {
        return sizeOfTree == 0;
    }
    public int peek() {
        return isEmpty()?Integer.MIN_VALUE:arr[1];
    }
    private void heapifyBottomUp(int index, String type) {
        int parent = index / 2;

        if (index <= 1) return;

        if (type.equals("Min")) {
            if (arr[index] < arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        } else if (type.equals("Max")) {
            if (arr[index] > arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        }
        heapifyBottomUp(parent, type);
    }
    public void insert(int value, String type) {
        arr[++sizeOfTree] = value;
        heapifyBottomUp(sizeOfTree, type);
    }
    private void heapifyTopDown(int index, String type) {
        int left = index * 2;
        int right = left + 1;
        int indexGreater = 0;
        if ( sizeOfTree < left) {
            return;
        }
        if (type.equals("Min")) {
            if ( sizeOfTree == left) {
                if ( arr[left] < arr[index] ) {
                    int temp = arr[left];
                    arr[left] = arr[index];
                    arr[index] = temp;
                }
                return;
            } else {
                indexGreater = arr[left] < arr[right] ? left : right;
                if (arr[index] > arr[indexGreater]) {
                    int temp = arr[index];
                    arr[index] = arr[indexGreater];
                    arr[indexGreater] = temp;
                }
            }
        } else if (type.equals("Max")) {
            if ( sizeOfTree == left) {
                if ( arr[left] > arr[index] ) {
                    int temp = arr[left];
                    arr[left] = arr[index];
                    arr[index] = temp;
                }
                return;
            } else {
                indexGreater = arr[left] > arr[right] ? left : right;
                if (arr[index] < arr[indexGreater]) {
                    int temp = arr[index];
                    arr[index] = arr[indexGreater];
                    arr[indexGreater] = temp;
                }
            }
        }
        heapifyTopDown(indexGreater, type);
    }
    public int extractTop(String type) { 
        if (isEmpty()) return -1;
        else {
            int extractValue = arr[1];
            arr[1] = arr[sizeOfTree--];
            heapifyTopDown(1, type);
            return extractValue;
        }
    }
}