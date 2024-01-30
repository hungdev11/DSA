public class ReverseString{
    public String reverseString(String str)
    {
        if(str.isEmpty() || str.length() < 2) return str;
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args)
    {
        ReverseString rs = new ReverseString();
        System.out.println(rs.reverseString("abcdacn"));
        System.out.println(rs.reverseString("a"));
        System.out.println(rs.reverseString(""));

    }
}