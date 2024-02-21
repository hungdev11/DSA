public class Main {
    public static void main(String[] args) {
        LinearProbing lp = new LinearProbing(4);
        lp.insert("A");
        lp.insert("C");
        lp.insert("B");
        lp.insert("D");

        lp.insert("A");
        lp.insert("X");
        lp.insert("/");
        lp.insert("B");
        lp.insert("/");
        lp.display();
    }
    
}