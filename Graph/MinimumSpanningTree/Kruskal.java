import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Kruskal {
    List<WeightedNode> nodeList = new ArrayList<WeightedNode>();
    List<UndirectedEgde> egdes = new ArrayList<>();

    public Kruskal(List<WeightedNode> nodes) {
        this.nodeList = nodes;
    }

    public void addWeightedUndirectedEgde(int firstIndex, int secondIndex, int weight) {
        UndirectedEgde egde = new UndirectedEgde(nodeList.get(firstIndex), nodeList.get(secondIndex), weight);
        WeightedNode first = egde.first;
        WeightedNode second = egde.second;

        first.neighbors.add(second);
        second.neighbors.add(first);
        first.weightMap.put(second, weight);
        second.weightMap.put(first, weight);

        egdes.add(egde);
    }

    void kruskal() {
        DisjointSet.makeSet(nodeList);
        Comparator<UndirectedEgde> comparator = new Comparator<UndirectedEgde>() {
            public int compare(UndirectedEgde a, UndirectedEgde b) {
                return a.weight - b.weight;
            }
        };

        Collections.sort(egdes, comparator);

        int cost = 0;

        for (UndirectedEgde egde : egdes) {
            WeightedNode first = egde.first;
            WeightedNode second = egde.second;

            if (!DisjointSet.findSet(first).equals(DisjointSet.findSet(second))) {
                DisjointSet.union(first, second);
                cost += egde.weight;
                System.out.println("Taken " + egde);
            }
        }
        System.out.println("\nTotal cost: " + cost);
    }
}
