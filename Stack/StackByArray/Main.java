public class Main {
    public static void main(String[] args)
    {
        Stack st = new Stack(6);
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(3);
        st.pop();
        st.deleteStack();
        System.out.println(st.peek());

    }
    
}