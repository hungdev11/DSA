import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item("A", 20, 100));
        items.add(new Item("B", 30, 120));
        items.add(new Item("C", 10, 60));

        int maxValue = FractionalKnapsack.fractionalKnapsack(50, items);
        System.out.println("Total : " + maxValue);
    }
}