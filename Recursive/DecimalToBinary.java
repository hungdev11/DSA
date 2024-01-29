public class DecimalToBinary{
    public int DToB(int decimalNumber) 
    {
        if(decimalNumber < 0) return -1;
        if(decimalNumber == 0) return 0;
        return 10*DToB(decimalNumber/2) + decimalNumber%2;
    } 

    public static void main(String[] args)
    {
        DecimalToBinary dtb = new DecimalToBinary();
        for( int i = 0; i <= 16; i++)
                System.out.println(dtb.DToB(i));
    }
}