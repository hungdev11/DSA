import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<GraphNode> nodes = new ArrayList<>();
        nodes.add(new GraphNode("A", 0));
        nodes.add(new GraphNode("B", 1));
        nodes.add(new GraphNode("C", 2));
        nodes.add(new GraphNode("D", 3));
        nodes.add(new GraphNode("E", 4));
        nodes.add(new GraphNode("F", 5));
        nodes.add(new GraphNode("G", 6));
        nodes.add(new GraphNode("H", 7));
        nodes.add(new GraphNode("I", 8));
        nodes.add(new GraphNode("J", 9));
        Graph g = new Graph(nodes);
        g.addDirectedEdge(0, 1);
        g.addDirectedEdge(0, 2);
        g.addDirectedEdge(0, 3);
        g.addDirectedEdge(1, 9);
        g.addDirectedEdge(2, 6);
        g.addDirectedEdge(4, 0);
        g.addDirectedEdge(4, 5);
        g.addDirectedEdge(5, 8);
        g.addDirectedEdge(6, 7);
        g.addDirectedEdge(6, 3);

        Scanner sc = new Scanner(System.in);
        boolean conti = true;
        while (conti) {
            System.out.println("begin - end :");
            int from = sc.nextInt();
            int to = sc.nextInt();
            if (g.routeBetween(nodes.get(from), nodes.get(to))) {
                Graph.pathPrint(nodes.get(to));
            } else {
                System.out.println("Not found route!");
            }
            System.out.println("\nContinue?");
            conti = sc.nextBoolean();
        }
        sc.close();
    }
}
