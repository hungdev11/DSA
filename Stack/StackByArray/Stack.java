public class Stack{
    int[] arr;
    int topOfStack;

    public Stack(int size)
    {
        arr = new int[size];
        topOfStack = -1;
        System.out.println("The Stack is created with size of " + size);
    }
    public boolean isEmpty()
    {
        return topOfStack == -1;
    }
    public boolean isFull()
    {
        return topOfStack == arr.length - 1;
    }
}