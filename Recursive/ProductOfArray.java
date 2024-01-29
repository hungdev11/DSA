public class ProductOfArray{
    public int productOfArray(int[] arr, int size)
    {
        if(arr.length <= 0) return Integer.MIN_VALUE;
        if(size == 1) return 1;
        return arr[size-1] * productOfArray(arr, size-1);
    }
    public static void main(String[] args)
    {
        ProductOfArray poa = new ProductOfArray();
        int[] arr1 = new int[0];
        int[] arr2 = {2,3,1,4};
        System.out.println(poa.productOfArray(arr1, arr1.length));
        System.out.println(poa.productOfArray(arr2, arr2.length));

    }
}