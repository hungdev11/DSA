/**
 * GraphNode
 */
public class GraphNode {
    String name;
    int index;
    boolean isVisited;
    GraphNode parent;

    GraphNode(String name, int index) {
        this.name = name;
        this.index = index;
        isVisited = false;
        parent = null;
    }
}