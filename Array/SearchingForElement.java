public class SearchingForElement{
    public static int searching(int[] arr, int element)
    {
        for(int i=0 ; i < arr.length; i++)
        {
            if(arr[i] == element)
                return i;
        }
        return -1; // NOT FOUND
    }
    public static void main(String[] args)
    {
        int[] arr = {0,1,2,4,5,2,3};
        System.out.println("Element found at index number :" + searching(arr, 2));
    }
}