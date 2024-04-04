import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NumberFactor {
    public int numberFactorMemo(int n, Map<Integer, Integer> dp) {
        if (n <= 2)
            return 1;
        if (n == 3)
            return 2;
        if (!dp.containsKey(n)) {
            int nf1 = numberFactorMemo(n - 1, dp);
            int nf2 = numberFactorMemo(n - 3, dp);
            int nf3 = numberFactorMemo(n - 4, dp);
            dp.put(n, nf1 + nf2 + nf3);
        }
        return dp.get(n);
    }

    public int numberFactorTab(int n) {
        List<Integer> tab = new ArrayList<>();
        tab.add(1); // For n = 0
        tab.add(1); // For n = 1
        tab.add(1); // For n = 2
        tab.add(2);
        for (int i = 4; i < n + 1; i++) {
            tab.add(numberFactorTab(n - 1) + numberFactorTab(n - 3) + numberFactorTab(n - 4));
        }
        return tab.get(n);
    }
}
