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
        nodes.add(new GraphNode("H", 7));

        Graph g = new Graph(nodes);
        /*
         * g.addUndirectedEdge(0, 1);
         * g.addUndirectedEdge(0, 2);
         * g.addUndirectedEdge(0, 3);
         * g.addUndirectedEdge(2, 3);
         * g.addUndirectedEdge(3, 4);
         * g.addUndirectedEdge(1, 4);
         */
        g.addDirectedEdge(0, 2);
        g.addDirectedEdge(2, 4);
        g.addDirectedEdge(4, 7);
        g.addDirectedEdge(4, 5);
        g.addDirectedEdge(5, 6);
        g.addDirectedEdge(1, 2);
        g.addDirectedEdge(1, 3);
        g.addDirectedEdge(3, 5);

        System.out.println(g.print());
        // g.bfs();
        // g.dfs();
        g.topologicalSort();
    }
}
