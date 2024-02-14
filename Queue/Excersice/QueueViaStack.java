import java.util.Stack;

public class QueueViaStack{
    private Stack<Integer> stack1, stack2;

    public QueueViaStack()
    {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }
    public int size()
    {
        return stack1.size() + stack2.size();
    }
    public void enqueue(int value)
    {
        stack1.push(value);
    }
    public int dequeue()
    {
        moveElementsFromStack1ToStack2();
        return stack2.pop();
    }
    private void moveElementsFromStack1ToStack2()
    {
        if(stack2.isEmpty())
        {
            while(!stack1.isEmpty())
            {
                int popedOut = stack1.pop();
                stack2.push(popedOut);
            }
        }
    }
    public int peek()
    {
        moveElementsFromStack1ToStack2();
        return stack2.peek();
    }
}