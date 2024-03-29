import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

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

    public void addDirected(int i, int j) {
        matrix[i][j] = 1;
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

    private void dfsVisit(GraphNode firstNode) {
        Stack<GraphNode> stack = new Stack<>();
        stack.add(firstNode);
        int count = 0;
        while (!stack.isEmpty()) {
            GraphNode node = stack.pop();
            node.isVisited = true;
            count++;
            if (count != matrix.length) {
                System.out.print(node.name + " -> ");
            } else {
                System.out.print(node.name);
            }
            List<GraphNode> neighbors = getNeighbors(node);
            for (GraphNode g : neighbors) {
                if (!g.isVisited) {
                    stack.push(g);
                    g.isVisited = true;
                }
            }
        }
    }

    public void dfs() {
        for (GraphNode g : nodes) {
            if (!g.isVisited) {
                dfsVisit(g);
            }
        }
    }

    private void topologicalSortVisit(GraphNode beginNode, Stack<GraphNode> stack) {
        List<GraphNode> neighbors = getNeighbors(beginNode);
        for (GraphNode neighbor : neighbors) {
            if (!neighbor.isVisited) {
                topologicalSortVisit(neighbor, stack);
            }
        }
        beginNode.isVisited = true;
        stack.push(beginNode);
    }

    public void topologicalSort() {
        Stack<GraphNode> stack = new Stack<GraphNode>();
        for (GraphNode node : nodes) {
            if (!node.isVisited)
                topologicalSortVisit(node, stack);
        }
        int count = -1;
        while (!stack.isEmpty()) {
            GraphNode popNode = stack.pop();
            count++;
            if (count != nodes.size() - 1) {
                System.out.print(popNode.name + " -> ");
            } else {
                System.out.println(popNode.name);
            }
        }
    }

    public static void pathPrint(GraphNode node) {
        if (node.parent != null) {
            pathPrint(node.parent);
        }
        System.out.print(node.name + " ");
    }

    public void bfsForSSSPP(GraphNode node) {
        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode currNode = queue.remove();
            currNode.isVisited = true;
            System.out.println("Path : " + node.name + " -> " + currNode.name);
            pathPrint(currNode);
            System.out.println("\n");
            List<GraphNode> neighbors = getNeighbors(currNode);
            for (GraphNode neighbor : neighbors) {
                if (neighbor.isVisited != true) {
                    neighbor.isVisited = true;
                    queue.add(neighbor);
                    neighbor.parent = currNode;
                }
            }
        }
    }

}