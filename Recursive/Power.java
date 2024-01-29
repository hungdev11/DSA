public class Power{
    public int powerOf(int number, int exp)
    {
        if(exp < 0) return Integer.MIN_VALUE;
        if(exp == 0) return 1;
        return number * powerOf(number, exp-1);
    }
    public static void main(String[] args)
    {
        Power p = new Power();
        System.out.println(p.powerOf(2, 3));
        System.out.println(p.powerOf(2, 0));
        System.out.println(p.powerOf(2, -2));
        System.out.println(p.powerOf(2, 4));

    }
}