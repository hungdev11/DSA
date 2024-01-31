import java.util.Scanner;

public class CountNoDaysAboveAverageTempurture{
    public static float averageTemputure(float[] listOfTempurture)
    {
        if(listOfTempurture.length == 0) return Float.MIN_VALUE;
        float sumTemp = 0;
        for(float x : listOfTempurture)
        {
            sumTemp += x;
        }
        return sumTemp/listOfTempurture.length;
    }
    public static int numDaysAboveAVGTemp(float[] list, float avgTemp)
    {
        int count = 0;
        for(float i : list)
        {
            if(i > avgTemp)
                count++;
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list of temperature size: ");
        int size = sc.nextInt();
        float[] temps = new float[size];

        for (int i = 0; i < size; i++)
        {
            System.out.println("Enter temperature: ");
            temps[i] = sc.nextFloat();
        }

        System.out.println(averageTemputure(temps));
        System.out.println("Number of days above average temperature: " + numDaysAboveAVGTemp(temps, averageTemputure(temps)));
    }

}