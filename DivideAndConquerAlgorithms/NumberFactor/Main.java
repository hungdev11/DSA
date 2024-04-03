public class Main {
    public static void main(String[] args) {
        NumberFactor nf = new NumberFactor();
        System.out.println(nf.waysToGetN(4)); // {4} {1,3} {3,1} {1,1,1,1}
        System.out.println(nf.waysToGetN(5)); // {4,1} {1,4} {3,1,1} {1,3,1} {1,1,3} {1,1,1,1,1}
        System.out.println(nf.waysToGetN(6));
        // {4,1,1} {1,4,1} {1,1,4} {1,1,1,3} {1,3,1,1} {1,1,3,1} {1,1,1,3} {1,1,1,1,1,1}
        // {3,3}
    }

}