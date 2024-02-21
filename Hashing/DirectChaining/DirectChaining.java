import java.util.LinkedList;

public class DirectChaining {
    public LinkedList<String>[] hashTable;
    private int maxSizeChaining = 5;
    
    DirectChaining(int size) {
        hashTable = new LinkedList[size];
    }
    private int hashfunction(String word, int M) {
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            sum += word.charAt(i);
        }
        return sum  % M;
    }
    public void insert(String word) {
        int index = hashfunction(word, hashTable.length);
        if (hashTable[index] == null) {
            hashTable[index] = new LinkedList<String>();
            hashTable[index].add(word);
        } else {
            hashTable[index].add(word);
        }
    }
    public void display() {
        if (hashTable == null) {
            System.out.println("Empty hashtable!");
            return;
        } else {
            for (int i = 0; i<hashTable.length; i++) {
                System.out.println("Index " + i + ", key:" + hashTable[i]);
            }
        }
    }
}