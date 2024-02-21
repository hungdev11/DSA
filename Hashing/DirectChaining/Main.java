public class Main {
    public static void main(String[] args) {
        DirectChaining dc = new DirectChaining(15);
        dc.insert("The");
        dc.insert("quick");
        dc.insert("quick");
        dc.insert("brown");
        dc.insert("fox");
        dc.insert("over");
        dc.display();
    }
}
