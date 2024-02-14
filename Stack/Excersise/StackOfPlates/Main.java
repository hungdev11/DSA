public class Main{
    public static void main(String[] args) {
        SetOfStacks newStack = new SetOfStacks(2);
        newStack.push(0);
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        newStack.push(-1);
        newStack.push(4);
        newStack.push(5);
        newStack.push(7);
        System.out.println(newStack.pop());
        System.out.println(newStack.pop());
        System.out.println(newStack.popAt(2));
    }
}