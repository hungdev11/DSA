class Node{
    public int value;
    public Node next;

    public Node(int value, Node nextNode)
    {
        this.value = value;
        this.next = nextNode;
    }
}
public class StackMinimum{
    Node top;
    Node min;
    StackMinimum()
    {
        top = null;
        min = null;
    }
    public int min()
    {
        return min.value;
    }
    public void push(int value)
    {
        if(min == null)
        {
            min = new Node(value, min);
        }
        else if(min.value > value)
        {
            min = new Node(value, min);
        }
        else
        {
            min = new Node(min.value, min);
        }
        top = new Node(value, top);
    }
    public int pop()
    {
        min = min.next;
        int value = top.value;
        top = top.next;
        return value;
    }
    public static void main(String[] args) {
        StackMinimum sm = new StackMinimum();
        sm.push(5);
        System.out.println(sm.min());
        sm.push(6);
        System.out.println(sm.min());
        sm.push(3);
        System.out.println(sm.min());
        sm.push(7);
        System.out.println(sm.min());
        sm.pop();
        System.out.println(sm.min());
        sm.pop();
        System.out.println(sm.min());

    }
}