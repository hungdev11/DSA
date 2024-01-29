public class GCD{
    public int gcd(int firstNum, int secondNum)
    {
        if(firstNum < 0 || secondNum < 0) return -1;
        if(secondNum == 0) return firstNum;
        return gcd(secondNum, firstNum % secondNum);
    }
    public static void main(String[] args)
    {
        GCD f = new GCD();
        System.out.println(f.gcd(48, 18));
        System.out.println(f.gcd(8, 4));

    }
}