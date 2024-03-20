import java.util.ArrayList;

/**
 * GraphNode
 */
enum State {
    Unvisited, Visited, Visiting;
}

public class GraphNode {
    String name;
    ArrayList<GraphNode> neighbors;
    int index;
    GraphNode parent;
    State state;

    GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
        neighbors = new ArrayList<>();
        parent = null;
        state = State.Unvisited;
    }
}