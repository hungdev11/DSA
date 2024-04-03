public class FibonancciSeries {
    public static long fibonancci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonancci(n - 1) + fibonancci(n - 2);
    }

    public static void fibonancciSeries(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibonancci(i) + " ");
        }
    }
}
