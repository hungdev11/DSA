public class TwoSum{
    public int[] findPair(int[] arr , int target)
    {
        for(int i = 0; i< arr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                if(arr[i] + arr[j] == target)
                    return new int[] {i,j};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args)
    {
        TwoSum ts = new TwoSum();
        int[] arr = {1,2,5,1,4};
        int[] pair = ts.findPair(arr, 5);
        for(int e : pair)
            System.out.println(e);
    }
}