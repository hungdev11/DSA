import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Prims {
    List<WeightedNode> nodes = new ArrayList<WeightedNode>();

    public Prims(List<WeightedNode> nodes) {
        this.nodes = nodes;
    }

    public void addWeightedUndirectedEgde(int firstIndex, int secondIndex, int weight) {
        UndirectedEgde egde = new UndirectedEgde(nodes.get(firstIndex), nodes.get(secondIndex), weight);
        WeightedNode first = egde.first;
        WeightedNode second = egde.second;

        first.neighbors.add(second);
        second.neighbors.add(first);
        first.weightMap.put(second, weight);
        second.weightMap.put(first, weight);
    }

    public void prims(WeightedNode node) {
        for (WeightedNode node1 : nodes) {
            node1.distance = Integer.MAX_VALUE;
        }
        node.distance = 0;
        Queue<WeightedNode> queue = new PriorityQueue<WeightedNode>();
        queue.addAll(nodes);
        while (!queue.isEmpty()) {
            WeightedNode curNode = queue.remove();
            for (WeightedNode neighbor : curNode.neighbors) {
                if (queue.contains(neighbor)) {
                    if (neighbor.distance > curNode.weightMap.get(neighbor)) {
                        neighbor.distance = curNode.weightMap.get(neighbor);
                        neighbor.parent = curNode;
                        queue.remove(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }

        int cost = 0;
        for (WeightedNode n : nodes) {
            System.out.println("Node " + n.name + " Cost " + n.distance + " Parent " + n.parent);
            cost += n.distance;
        }
        System.out.println("Cost :" + cost);
    }
}
