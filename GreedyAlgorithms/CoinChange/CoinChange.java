import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coinList, int total) {
        Arrays.sort(coinList);
        int count = 0;
        for (int i = coinList.length - 1; i >= 0; i--) {
            if (total > 0) {
                int times = total / coinList[i];
                total -= times * coinList[i];
                for (int j = 0; j < times; j++) {
                    System.out.print(coinList[i] + " ");
                    count++;
                }
            }
        }
        return count;
    }
}
