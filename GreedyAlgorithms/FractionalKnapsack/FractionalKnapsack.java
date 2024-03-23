import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FractionalKnapsack {
    public static int fractionalKnapsack(int W, List<Item> items) {
        Comparator<Item> ratioComp = new Comparator<Item>() {
            @Override
            public int compare(Item i1, Item i2) {
                double ratio1 = i1.getValue() / i1.getWeight();
                double ratio2 = i2.getValue() / i2.getWeight();
                return (int) (ratio2 - ratio1);
            }
        };
        int value = 0;
        Collections.sort(items, ratioComp);
        for (int i = 0; i < items.size(); i++) {
            if (W == 0) {
                break;
            } else {
                double itemValue = items.get(i).getValue();
                int itemWeight = items.get(i).getWeight();
                if (W - items.get(i).getWeight() > 0) {
                    value += itemValue;
                    W -= itemWeight;
                } else {
                    double remainSpace = W * 1.0 / itemWeight;
                    itemValue *= remainSpace;
                    value += itemValue;
                    W = 0;
                }
                System.out.println("Filled with item " + items.get(i).getName() + " " + itemValue);
            }
        }
        return value;
    }
}
