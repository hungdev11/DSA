import java.util.ArrayList;

/**
 * GraphNode
 */
public class GraphNode {
    String name;
    ArrayList<GraphNode> neighbors;
    int index;
    boolean isVisited;
    GraphNode parent;

    GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
        neighbors = new ArrayList<>();
        parent = null;
    }
}