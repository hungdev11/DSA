public class IsTwoArrayArePermutation{
    public boolean isPermutation(int[] arr1, int[] arr2)
    {
        if(arr1.length != arr2.length) return false;
        int sum1 = 0, sum2 = 0;
        int product1 = 1, product2 = 1;
        for(int x = 0; x < arr1.length; x++)
        {
            sum1 += arr1[x]; product1 *= arr1[x];
            sum2 += arr2[x]; product2 *= arr2[x];
        }
        return sum1 == sum2 && product1 == product2;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {2,4,6,1,3,5};
        int[] arr3 = {1,2,3,4,5};

        System.out.println(new IsTwoArrayArePermutation().isPermutation(arr1, arr2));
        System.out.println(new IsTwoArrayArePermutation().isPermutation(arr1, arr3));

    }
}