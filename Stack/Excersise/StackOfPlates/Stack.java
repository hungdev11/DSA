import java.util.EmptyStackException;

public class Stack{
    public StackNode top;
    public StackNode bottom;
    private int capacity;
    public int size;

    public Stack(int capacity)
    {
        this.capacity = capacity;
        size = 0;
    }

    public boolean isFull()
    {
        return capacity <= size;
    }
    public void join(StackNode above, StackNode below)
    {
        if(above != null) above.below = below;
        if(below != null) below.above = above;
    }
    public boolean push(int value)
    {
        if(isFull()) return false;
        size++;
        StackNode newStk = new StackNode(value);
        if(size == 1) bottom = newStk;
        join(newStk, top);
        top = newStk;
        return true;
    }
    public int pop()
    {
        if(size == 0) throw new EmptyStackException();
        int result = top.value;
        top = top.below;
        size--;
        return result;
    }
    public int removeBottom()
    {
        StackNode b = bottom;
        bottom = bottom.above;
        if(bottom != null) bottom.below = null;
        size--;
        return b.value;
    }
}