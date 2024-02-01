public class IsUniqueElementInAnArray{
    public static boolean isUnique(int[] arr){
        if(arr.length < 2) return true;
        for(int i = 0; i<arr.length-1; i++)
        {
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 10};
        int[] arr2 = {10, 20, 30, 40};
        int[] arr3 = {10};
        System.out.println(isUnique(arr));
        System.out.println(isUnique(arr2));
        System.out.println(isUnique(arr3));


    }
}