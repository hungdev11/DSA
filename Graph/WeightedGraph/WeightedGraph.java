import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class WeightedGraph {
    List<WeightedNode> nodes;

    WeightedGraph(List<WeightedNode> nodeList) {
        nodes = nodeList;
    }

    public static void pathPrint(WeightedNode node) {
        if (node.parent != null) {
            pathPrint(node.parent);
        }
        System.out.print(node.name + " ");
    }

    void dijkstra(WeightedNode node) {
        Queue<WeightedNode> queue = new PriorityQueue<WeightedNode>();
        node.distance = 0;
        queue.addAll(nodes);
        while (!queue.isEmpty()) {
            WeightedNode currNode = queue.remove();
            for (WeightedNode neighbor : currNode.neighbors) {
                if (queue.contains(neighbor)) {
                    if (neighbor.distance > currNode.distance + currNode.weightMap.get(neighbor)) {
                        neighbor.distance = currNode.distance + currNode.weightMap.get(neighbor);
                        neighbor.parent = currNode;
                        queue.remove(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }
        for (WeightedNode nodeToCheck : nodes) {
            System.out.print("Node " + nodeToCheck + ", distance: " + nodeToCheck.distance + ", Path: ");
            pathPrint(nodeToCheck);
            System.out.println();
        }
    }

    void addWeightedEgde(int i, int j, int weight) {
        WeightedNode first = nodes.get(i);
        WeightedNode second = nodes.get(j);
        first.neighbors.add(second);
        first.weightMap.put(second, weight);
    }

    public void bellmanFord(WeightedNode node) {
        node.distance = 0;
        for (int i = 0; i < nodes.size(); i++) {
            for (WeightedNode currNode : nodes) {
                for (WeightedNode neighbor : currNode.neighbors) {
                    if (neighbor.distance > currNode.distance + currNode.weightMap.get(neighbor)) {
                        neighbor.distance = currNode.distance + currNode.weightMap.get(neighbor);
                        neighbor.parent = currNode;
                    }
                }
            }
        }
        // Checking for negative cycle
        // Print negative cycle if found
        System.out.println("Checking for negative cycle...");
        for (WeightedNode currNode : nodes) {
            for (WeightedNode neighbor : currNode.neighbors) {
                if (neighbor.distance > currNode.distance + currNode.weightMap.get(neighbor)) {
                    System.out.println("Negative cycle found: \n");
                    System.out.println("Vertex name: " + neighbor.name);
                    System.out.println("Old cost: " + neighbor.distance);
                    int newDistance = currNode.distance + currNode.weightMap.get(neighbor);
                    System.out.println("New cost: " + newDistance);
                    return;
                }
            }
        }
        System.out.println("Negative cycle not found!\n");
        // Print shortest paths for each node
        for (WeightedNode nodeToCheck : nodes) {
            System.out.print("Node " + nodeToCheck + ", distance: " + nodeToCheck.distance + ", Path: ");
            pathPrint(nodeToCheck);
            System.out.println();
        }
    }

    public void floydWarshall() {
        // Init a matrix
        int size = nodes.size();
        int[][] W = new int[size][size];

        for (int i = 0; i < size; i++) {
            WeightedNode first = nodes.get(i);
            for (int j = 0; j < size; j++) {
                WeightedNode second = nodes.get(j);
                if (i == j) {
                    W[i][j] = 0;
                } else if (first.weightMap.containsKey(second)) {
                    W[i][j] = first.weightMap.get(second);
                } else {
                    W[i][j] = Integer.MAX_VALUE / 10;
                }
            }
        }

        for (int k = 0; k < size; k++) {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (W[i][j] > W[i][k] + W[k][j]) {
                        W[i][j] = W[i][k] + W[k][j];
                    }
                }
            }
        }
        System.out.print("   ");
        for (int i = 0; i < size; i++) {
            System.out.print(nodes.get(i).name + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(nodes.get(i).name + ": ");
            for (int j = 0; j < size; j++) {
                System.out.print(W[i][j] + " ");
            }
            System.out.println();
        }
    }
}
