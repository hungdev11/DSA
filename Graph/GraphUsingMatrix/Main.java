import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GraphNode> nodes = new ArrayList<GraphNode>();
        nodes.add(new GraphNode("A", 0));
        nodes.add(new GraphNode("B", 1));
        nodes.add(new GraphNode("C", 2));
        nodes.add(new GraphNode("D", 3));
        nodes.add(new GraphNode("E", 4));
        nodes.add(new GraphNode("F", 5));
        nodes.add(new GraphNode("G", 6));
        // nodes.add(new GraphNode("H", 7));

        Graph g = new Graph(nodes);
        g.addUndirect(0, 1);
        g.addUndirect(0, 2);
        g.addUndirect(1, 3);
        g.addUndirect(1, 6);
        g.addUndirect(2, 3);
        g.addUndirect(2, 4);
        g.addUndirect(3, 5);
        g.addUndirect(4, 5);
        g.addUndirect(5, 6);

        // g.addDirected(0, 2);
        // g.addDirected(2, 4);
        // g.addDirected(4, 7);
        // g.addDirected(4, 5);
        // g.addDirected(5, 6);
        // g.addDirected(1, 2);
        // g.addDirected(1, 3);
        // g.addDirected(3, 5);

        System.out.println(g.print());

        // g.bfs();
        // g.dfs();
        // g.topologicalSort();
        g.bfsForSSSPP(nodes.get(0));
    }
}
