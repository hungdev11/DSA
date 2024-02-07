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
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("The Stack is empty!");
            return Integer.MIN_VALUE;
        }
        return arr[topOfStack--];
    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("The Stack is empty!");
            return Integer.MIN_VALUE;
        }
        return arr[topOfStack];
    }
    public void push(int value)
    {
        if(isFull())
        {
            System.out.println("The Stack is full!");
            return;
        }
        else    
        {
            ++topOfStack;
            arr[topOfStack] = value;
            System.out.println("Push successfully!");
        }
    }
    public void deleteStack()
    {
        arr = null;
        System.out.println("The Stack is successfully deleted!");
    }
}