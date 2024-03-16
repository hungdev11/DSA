import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<WeightedNode> nodes = new ArrayList<>();
        nodes.add(new WeightedNode("A", 0));
        nodes.add(new WeightedNode("B", 1));
        nodes.add(new WeightedNode("C", 2));
        nodes.add(new WeightedNode("D", 3));
        nodes.add(new WeightedNode("E", 4));

        Kruskal g = new Kruskal(nodes);
        g.addWeightedUndirectedEgde(0, 1, 5);
        g.addWeightedUndirectedEgde(0, 2, 13);
        g.addWeightedUndirectedEgde(0, 4, 15);
        g.addWeightedUndirectedEgde(1, 2, 10);
        g.addWeightedUndirectedEgde(1, 3, 8);
        g.addWeightedUndirectedEgde(2, 3, 6);
        g.addWeightedUndirectedEgde(2, 4, 20);

        g.kruskal();
    }
}
