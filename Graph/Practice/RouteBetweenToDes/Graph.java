import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Graph
 */

public class Graph {
    List<GraphNode> nodes;

    Graph(List<GraphNode> nodes) {
        this.nodes = nodes;
    }

    public void addDirectedEdge(int i, int j) {
        nodes.get(i).neighbors.add(nodes.get(j));
    }

    public boolean routeBetween(GraphNode node1, GraphNode node2) {
        Queue<GraphNode> queue = new LinkedList<GraphNode>();
        for (GraphNode node : nodes) {
            node.state = State.Unvisited;
        }
        queue.add(node1);
        node1.state = State.Visiting;
        while (!queue.isEmpty()) {
            GraphNode curNode = queue.remove();
            if (curNode != null) {
                for (GraphNode neighbor : curNode.neighbors) {
                    if (neighbor.state.equals(State.Unvisited)) {
                        neighbor.parent = curNode;
                        if (neighbor.name.equals(node2.name)) {
                            return true;
                        } else {
                            neighbor.state = State.Visiting;
                            queue.add(neighbor);
                        }
                    }
                }
            }
            curNode.state = State.Visited;
        }
        return false;
    }

    public static void pathPrint(GraphNode node) {
        if (node.parent != null) {
            pathPrint(node.parent);
        }
        System.out.print(node.name + " ");
    }
}