import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

    private void bfsVisit(GraphNode beginNode) {
        Queue<GraphNode> queue = new LinkedList<GraphNode>();
        queue.add(beginNode);
        while (!queue.isEmpty()) {
            GraphNode currNode = queue.remove();
            currNode.isVisited = true;
            if (currNode.index == nodes.size() - 1) {
                System.out.print(currNode.name);
            } else {
                System.out.print(currNode.name + " -> ");
            }
            for (GraphNode g : currNode.neighbors) {
                if (!g.isVisited) {
                    queue.add(g);
                    g.isVisited = true;
                }
            }
        }
    }

    public void bfs() {
        for (GraphNode g : nodes) {
            if (!g.isVisited)
                bfsVisit(g);
        }
    }

    private void dfsVisit(GraphNode startNode) {
        Stack<GraphNode> stack = new Stack<GraphNode>();
        stack.push(startNode);
        int count = -1;
        while (!stack.isEmpty()) {
            GraphNode currNode = stack.pop();
            currNode.isVisited = true;
            count++;
            if (count == nodes.size() - 1) {
                System.out.print(currNode.name);
            } else {
                System.out.print(currNode.name + " -> ");
            }
            for (GraphNode neighbor : currNode.neighbors) {
                if (!neighbor.isVisited) {
                    stack.push(neighbor);
                    neighbor.isVisited = true;
                }
            }
        }
    }

    public void dfs() {
        for (GraphNode g : nodes) {
            if (!g.isVisited)
                dfsVisit(g);
        }
    }
}