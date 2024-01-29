public class SumOfDigits{
    public int SOD(int number)
    {
        if(number < 0) return -1;
        if(number == 0) return number;
        return (number%10) + SOD(number/10);
    }
    public static void main(String[] args)
    {
        SumOfDigits sod = new SumOfDigits();
        System.out.println(sod.SOD(1238));
        System.out.println(sod.SOD(-121));
        System.out.println(sod.SOD(10));
    }
}