public class Main {
    public static void main(String[] args) {
        QuadraticProbing qp = new QuadraticProbing(5);
        qp.insert("/");
        qp.insert("0");
        qp.insert("2");
        qp.insert("1"); //1 1+1 1+4 1+9 1+16  
        qp.insert("3");
        qp.delete("6");
        qp.delete("3");
        qp.display();

    }
}