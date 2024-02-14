import java.util.ArrayList;
import java.util.EmptyStackException;

public class SetOfStacks{
    public ArrayList<Stack> stacks;
    public int capacity;

    public SetOfStacks(int capacity)
    {
        this.capacity = capacity;
        this.stacks = new ArrayList<Stack>();
    }
    public Stack getLastStack()
    {
        if(stacks.size() == 0) return null;
        return stacks.get(stacks.size()-1);
    }
    public void push(int value)
    {
        Stack last = getLastStack();
        if(last != null && !last.isFull())
        {
            last.push(value);
        }
        else
        {
            Stack newStack = new Stack(capacity);
            newStack.push(value);
            stacks.add(newStack);
        }
    }
    public int pop()
    {
        Stack last = getLastStack();
        if(last.size == 0) throw new EmptyStackException();
        int result = last.pop();
        if(last.size == 0) stacks.remove(stacks.get(stacks.size()-1));
        return result;
    }
    public int shiftLeft(int index, boolean removeTop)
    {
        Stack stk = stacks.get(index);
        int removedItem;
        if(removeTop) removedItem = stk.pop();
        else removedItem = stk.removeBottom();

        if(stk.size == 0)
        {
            stacks.remove(index);
        }
        else if(  stacks.size() > index + 1)
        {
            int v = shiftLeft(index+1, false);
            stk.push(v);
        }
        return removedItem;
    }
    public int popAt(int index)
    {
        return shiftLeft(index, true);
    }
}