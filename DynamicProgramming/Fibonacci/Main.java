import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        Map<Integer, Integer> memo = new HashMap<>();
        System.out.println(f.fiboMemo(10, memo));
        System.out.println(f.fiboTab(10));
    }
}