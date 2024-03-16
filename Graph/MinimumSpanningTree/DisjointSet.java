import java.util.ArrayList;
import java.util.List;

public class DisjointSet {
    private List<WeightedNode> nodesList = new ArrayList<>();

    public static void makeSet(ArrayList<WeightedNode> nodes) {
        for (WeightedNode node : nodes) {
            DisjointSet set = new DisjointSet();
            set.nodesList.add(node);
            node.set = set;
        }
    }

    public DisjointSet findSet(WeightedNode node) {
        return node.set;
    }

    public static DisjointSet union(WeightedNode a, WeightedNode b) {
        if (a.set.equals(b)) {
            return null;
        } else {
            if (a.set.nodesList.size() > b.set.nodesList.size()) {
                List<WeightedNode> nodeSet2 = b.set.nodesList;
                for (WeightedNode node : nodeSet2) {
                    node.set = a.set;
                    a.set.nodesList.add(node);
                }
                return a.set;
            } else {
                List<WeightedNode> nodeSet1 = a.set.nodesList;
                for (WeightedNode node : nodeSet1) {
                    node.set = b.set;
                    b.set.nodesList.add(node);
                }
                return b.set;
            }
        }
    }

    public void printNodesOfSet() {
        for (WeightedNode node : this.nodesList) {
            System.out.print(node + " ");
        }
        System.out.println();
    }

}
