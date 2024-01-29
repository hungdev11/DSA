public class Fibonacci{
    public int f(int n)
    {
        if(n < 0) return -1;
        if(n < 2) return n;
        return f(n-1) + f(n-2);
    }
    public static void main(String[] args)
    {
        Fibonacci f = new Fibonacci();
        System.out.println(f.f(6)); // 0 1 1 2 3 5
        System.out.println(f.f(0));
        System.out.println(f.f(1));
        System.out.println(f.f(-3));

    }
}