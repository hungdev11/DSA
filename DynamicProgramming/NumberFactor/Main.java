import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        NumberFactor nf = new NumberFactor();
        Map<Integer, Integer> dp = new HashMap<>();
        System.out.println(nf.numberFactorMemo(6, dp));
        System.out.println(nf.numberFactorTab(4));
    }

}