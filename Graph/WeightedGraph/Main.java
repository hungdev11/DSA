import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<WeightedNode> nodeList = new ArrayList<>();
        nodeList.add(new WeightedNode("A", 0));
        nodeList.add(new WeightedNode("B", 1));
        nodeList.add(new WeightedNode("C", 2));
        nodeList.add(new WeightedNode("D", 3));
        nodeList.add(new WeightedNode("E", 4));
        nodeList.add(new WeightedNode("F", 5));
        nodeList.add(new WeightedNode("G", 6));

        WeightedGraph wg = new WeightedGraph(nodeList);
        wg.addWeightedEgde(0, 1, 2);
        wg.addWeightedEgde(0, 2, 5);
        wg.addWeightedEgde(1, 2, 6);
        wg.addWeightedEgde(1, 3, 3);
        wg.addWeightedEgde(1, 4, 3);
        wg.addWeightedEgde(3, 4, 4);
        wg.addWeightedEgde(4, 6, 9);
        wg.addWeightedEgde(2, 5, 8);
        wg.addWeightedEgde(5, 6, 7);

        System.out.println("Printing Dijkstra form source A");
        wg.dijkstra(nodeList.get(1));

    }
}