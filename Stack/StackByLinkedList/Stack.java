public class Stack {
    public LinkedList list;
    public Stack()
    {
        list = new LinkedList();
    }
    public void push(int Value)
    {
        list.insertNode(Value);
        System.out.println("The Stack push successfully!");
    }
    public boolean isEmpty()
    {
        return list.head == null;
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("The Stack is empty!");
            return Integer.MIN_VALUE;
        }
        int value = list.head.value;
        list.head = list.head.next;
        list.size--;
        return value;
    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("The Stack is empty!");
            return Integer.MIN_VALUE;
        }
        return list.head.value;
    }
    public void deleteStack()
    {
        list.head = null;
    }
}