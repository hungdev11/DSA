public class Main {
    public static void main(String[] args) {
        int[] coinList = new int[] { 1, 2, 5, 10, 50, 20, 1000, 10000 };
        CoinChange cc = new CoinChange();
        int count = cc.coinChange(coinList, 30291);
        System.out.println("\nNumber of Coins:" + count);
    }
}