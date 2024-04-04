import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Fibonacci {
    public int fiboMemo(int n, Map<Integer, Integer> memo) {
        if (n == 1)
            return 0;
        if (n == 2)
            return 1;
        if (!memo.containsKey(n))
            memo.put(n, fiboMemo(n - 1, memo) + fiboMemo(n - 2, memo));
        return memo.get(n);
    }

    public int fiboTab(int n) {
        List<Integer> tab = new ArrayList<>();
        tab.add(0);
        tab.add(1);
        for (int i = 2; i < n; i++) {
            tab.add(tab.get(i - 1) + tab.get(i - 2));
        }
        return tab.get(n - 1);
    }
}
