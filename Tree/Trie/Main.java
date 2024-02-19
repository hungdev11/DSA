public class Main {
    public static void main(String[] args) {
        Trie te = new Trie();
        te.insert("AP");
        te.insert("APIS");
        te.insert("ABS");
        te.insert("BLA");
        te.insert("BH");

        System.out.println(te.search("ABI"));
        System.out.println(te.search("BLA"));
    }
}
