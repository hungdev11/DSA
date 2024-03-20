import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WeightedNode /* implements Comparable<WeightedNode> */ {
    public String name;
    public List<WeightedNode> neighbors;
    public Map<WeightedNode, Integer> weightMap;
    public WeightedNode parent;
    public boolean isVisited;
    public int distance;
    public int index;
    public DisjointSet set;

    WeightedNode(String name, int index) {
        this.name = name;
        isVisited = false;
        distance = Integer.MAX_VALUE;
        neighbors = new ArrayList<WeightedNode>();
        weightMap = new HashMap<WeightedNode, Integer>();
        parent = null;
        this.index = index;
    }

    @Override
    public String toString() {
        return name;
    }

    /*
     * @Override
     * public int compareTo(WeightedNode o) {
     * return this.distance - o.distance;
     * }
     */

}
