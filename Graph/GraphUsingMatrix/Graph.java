import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Graph
 */
public class Graph {
    ArrayList<GraphNode> nodes;
    int[][] matrix;

    Graph(ArrayList<GraphNode> nodes) {
        this.nodes = nodes;
        int size = nodes.size();
        matrix = new int[size][size];
    }

    public void addUndirect(int i, int j) {
        matrix[i][j] = 1;
        matrix[j][i] = 1;
    }

    public String print() {
        StringBuilder s = new StringBuilder();
        s.append("   ");
        for (GraphNode node : nodes) {
            s.append(node.name + " ");
        }
        s.append("\n");
        int size = nodes.size();
        for (int i = 0; i < size; i++) {
            s.append(nodes.get(i).name + ": ");
            for (int j = 0; j < size; j++) {
                s.append(matrix[i][j] + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    private List<GraphNode> getNeighbors(GraphNode node) {
        List<GraphNode> neighbors = new ArrayList<>();
        int nodeIndex = node.index;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[nodeIndex][i] == 1) {
                neighbors.add(nodes.get(i));
            }
        }
        return neighbors;
    }

    private void bfsVisit(GraphNode beginNode) {
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(beginNode);
        while (!queue.isEmpty()) {
            GraphNode q = queue.poll();
            q.isVisited = true;
            if (q.index != matrix.length - 1) {
                System.out.print(q.name + " -> ");
            } else {
                System.out.print(q.name);
            }
            List<GraphNode> neighbors = getNeighbors(q);
            for (GraphNode neighbor : neighbors) {
                if (neighbor.isVisited == false) {
                    queue.add(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    public void bfs() {
        for (GraphNode g : nodes) {
            if (!g.isVisited) {
                bfsVisit(g);
            }
        }
    }

}