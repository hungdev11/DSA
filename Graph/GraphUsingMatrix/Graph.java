import java.util.ArrayList;

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
}