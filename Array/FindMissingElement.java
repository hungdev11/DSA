import java.util.Scanner;

public class FindMissingElement{
    public static int findMissingElement(int[] list)
    {
        int sum = (list.length*(list.length+1))/2;
        int realSum = 0;
        for(int e : list)
        {
            realSum += e;
        }
        return sum-realSum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size:");
        int arrSize = sc.nextInt();
        int[] listSequenceNumber = new int[arrSize];
        for(int i = 0; i < arrSize; i++)
        {
            if(i+1 == 6) continue;
            listSequenceNumber[i] = i+1;
        }
        System.out.println(findMissingElement(listSequenceNumber));

    }
}