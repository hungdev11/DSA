public class Main {
    public static void main(String[] args)
    {
        Stack st = new Stack();
        System.out.println(st.isEmpty());
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(0);
        st.push(1);
        st.list.traversalLL();
        //st.pop();
        System.out.println(st.peek());
        st.deleteStack();
        st.list.traversalLL();
    }
}