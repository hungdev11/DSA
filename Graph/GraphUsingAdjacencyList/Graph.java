import java.util.ArrayList;

/**
 * Graph
 */
public class Graph {
    ArrayList<GraphNode> nodes;

    Graph(ArrayList<GraphNode> nodes) {
        this.nodes = nodes;
    }

    public void addUndirectedEdge(int i, int j) {
        GraphNode first = nodes.get(i);
        GraphNode second = nodes.get(j);
        first.neighbors.add(second);
        second.neighbors.add(first);
    }

    public String print() {
        StringBuilder s = new StringBuilder();
        s.append("\n");
        for (GraphNode node : nodes) {
            s.append(node.name + ": ");
            for (int j = 0; j < node.neighbors.size(); j++) {
                if (j != node.neighbors.size() - 1)
                    s.append(node.neighbors.get(j).name + " -> ");
                else
                    s.append(node.neighbors.get(j).name);
            }
            s.append("\n");
        }
        return s.toString();
    }
}