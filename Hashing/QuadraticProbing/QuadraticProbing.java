import java.util.ArrayList;

public class QuadraticProbing {
    private String[] hashtable;
    private int usedCells;

    QuadraticProbing(int size) {
        hashtable = new String[size];
        usedCells = 0;
    }

    private double loadFactor() {
        return (1.0*usedCells) / hashtable.length;
    }
    private int hashFunction(String word, int hashSize) {
        int sum = 0;
        for ( int i = 0; i< word.length(); i++) {
            sum += word.charAt(i);
        }
        return sum % hashSize;
    }
    private void reHashing(String word) {
        usedCells = 0;
        ArrayList<String> data = new ArrayList<String>();
        for (String s : hashtable) {
            if(s != null) {
                data.add(s);
            }
        }
        data.add(word);
        hashtable = new String[hashtable.length*2];
        for (String s : data) {
            insert(s);
        }
    }
    public void insert(String word) {
        if (loadFactor() >= 0.75) {
            reHashing(word);
        } else {
            int count = 0;
            int size = hashtable.length, index = hashFunction(word, size);
            for (int i = index; i < index + size; i++) {
                int newIndex = (i + count*count) % size;
                if (hashtable[newIndex] == null) {
                    hashtable[newIndex] = word;
                    break;
                }
                count++;
            }
        }
        usedCells++;
    }
    public void display() {
        int i = 0;
        for (String s : hashtable) {
            System.out.println("Cell " + i++ + ": " + s);
        }
    }
    public boolean search(String word) {
        if (hashtable == null || hashtable.length == 0) return false;
        int count = 0;
        int size = hashtable.length;
        int idx = hashFunction(word, size);
        for (int i= idx; i< idx+size; i++) {
            int newIdx = (i+count*count) % size;
            if (hashtable[newIdx] != null && hashtable[newIdx].equals(word)) {
                return true;
            }   
            count++; 
        }
        return false;
    }
    public void delete(String word) {
        if (!search(word)) {
            System.out.println("Not Found : " + word);
            return;
        } else {
            int count = 0;
            int size = hashtable.length;
            int idx = hashFunction(word, size);
            for (int i= idx; i< idx+size; i++) {
                int newIdx = (i+count*count) % size;
                if (hashtable[newIdx] != null && hashtable[newIdx].equals(word)) {
                    hashtable[newIdx] = null;
                    //return; //if want only one element be deleted
                }   
                count++; 
            }
        }
    }
}
