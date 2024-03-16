public class UndirectedEgde {
    public WeightedNode first;
    public WeightedNode second;
    public int weight;

    public UndirectedEgde(WeightedNode firNode, WeightedNode secNode, int weight) {
        first = firNode;
        second = secNode;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Egde (" + first + "," + second + "), weight: " + weight;
    }
}
