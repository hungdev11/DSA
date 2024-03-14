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
}
