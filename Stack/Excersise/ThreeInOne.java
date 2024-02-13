public class ThreeInOne {
    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] sizes;
    private int[] values;

    public ThreeInOne(int stackSize)
    {
        stackCapacity = stackSize;
        sizes = new int[stackSize];
        values = new int[stackCapacity*numberOfStacks];
    }
    public boolean isFull(int stackNum)
    {
        return sizes[stackNum] == stackCapacity;
    }
    public boolean isEmpty(int stackNum)
    {
        return sizes[stackNum] == 0;
    }
    public int indexOfTop(int stackNum)
    {
        int offSet = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offSet+size-1;
    }
    public void push(int stackNum, int value)
    {
        if(isFull(stackNum))
        {
            System.out.println("Stack number " + stackNum + " is full!");
            return;
        }
        sizes[stackNum]++;
        values[indexOfTop(stackNum)] = value;
    }
    public int pop(int stackNum)
    {
        if(isEmpty(stackNum))
        {
            System.out.println("Stack number " + stackNum + " is empty!");
            return Integer.MIN_VALUE;
        }
        int value = values[indexOfTop(stackNum)];
        sizes[stackNum]--;
        return value;
    }
    public int peek(int stackNum)
    {
        if(isEmpty(stackNum))
        {
            System.out.println("Stack number " + stackNum + " is empty!");
            return Integer.MIN_VALUE;
        }   
        return values[indexOfTop(stackNum)];
    }
    public static void main(String[] args) {
        ThreeInOne tio = new ThreeInOne(3);
        tio.push(0, 1);
        tio.push(0, 1);
        tio.push(0, 3);
        tio.push(1, 2);
        tio.push(2, 1);
        System.out.println(tio.peek(0));
        //System.out.println(tio.pop(0));
        System.out.println(tio.pop(2));
        for(int i = 0; i<3; i++)
        {
            System.out.println(tio.isEmpty(i));
        }
    }
}