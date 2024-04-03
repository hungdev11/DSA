public class Main {
    public static void main(String[] args) {
        int[] profits = { 31, 26, 17, 72 };
        int[] weights = { 3, 1, 2, 5 };
        ZeroOneKnapsack zok = new ZeroOneKnapsack();
        System.out.println(zok.maxProfit(profits, weights, 7));
    }

}