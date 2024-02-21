import java.util.ArrayList;

import javax.management.openmbean.ArrayType;

public class LinearProbing {
   public String[] hashtable;
   private int usedCells;

   LinearProbing(int size) {
    hashtable = new String[size];
    usedCells = 0;
   }

   private int hashFunction(String word, int hashSize) {
        int sum = 0;
        for (int i = 0; i< word.length(); i++) {
            sum += word.charAt(i);
        }
        return sum % hashSize;
   }
   private double loadFactor() {
    return (1.0*usedCells) / hashtable.length;
   }

   private void reHashing(String word) {
        usedCells = 0;
        ArrayList<String> data = new ArrayList<String>();
        for (String s: hashtable) {
            if (s != null) {
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
            int index = hashFunction(word, hashtable.length);
            for (int i = index ; i< index+hashtable.length; i++) {
                int newIndex = i % hashtable.length;
                if (hashtable[newIndex] == null) {
                    hashtable[newIndex] = word;
                    break;
                }
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
}
