import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GraphNode> nodes = new ArrayList<GraphNode>();
        nodes.add(new GraphNode("A", 0));
        nodes.add(new GraphNode("B", 1));
        nodes.add(new GraphNode("C", 2));
        nodes.add(new GraphNode("D", 3));
        nodes.add(new GraphNode("E", 4));

        Graph g = new Graph(nodes);
        g.addUndirect(0, 1);
        g.addUndirect(0, 2);
        g.addUndirect(0, 3);
        g.addUndirect(2, 3);
        g.addUndirect(3, 4);
        g.addUndirect(1, 4);

        System.out.println(g.print());

        g.bfs();
    }
}
