
public class Factorial{
    public int f(int n)
    {
        if(n < 0) return -1;
        if(n < 2)
            return 1;
        return n*f(n-1);
    }
    public static void main(String[] args)
    {
        Factorial f = new Factorial();
        System.out.println(f.f(4));
        System.out.println(f.f(0));
        System.out.println(f.f(-2));

    }
}