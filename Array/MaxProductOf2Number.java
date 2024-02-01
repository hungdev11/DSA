public class MaxProductOf2Number{
    public static int[] pairMaxProduct(int[] arr)
    {
        if(arr.length < 2) return new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        int maxValue = Integer.MIN_VALUE;
        int[] result = new int[2];
        for(int i = 0; i<arr.length-1; i++)
        {
            for(int j = i+1; j<arr.length; j++)
            {
                if(maxValue < arr[i]*arr[j])
                {
                    maxValue = arr[i]*arr[j];
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 30, 10, 50, 1};
        int[] arr2 = {10};
        for(int x : pairMaxProduct(arr2))
        {
            System.out.println(x);
        }

    }
}