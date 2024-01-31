public class IsPalindromeString{
    public boolean isPalindrome(String str)
    {
        if(str.length()<2) return true;
        if(str.charAt(0) == str.charAt(str.length()-1))
            return isPalindrome(str.substring(1, str.length()-1));
        return false;
    }
    public static void main(String[] args)
    {
        IsPalindromeString ips = new IsPalindromeString();
        System.out.println(ips.isPalindrome("abcndah"));
        System.out.println(ips.isPalindrome("abccba"));
        System.out.println(ips.isPalindrome("abcba"));
        System.out.println(ips.isPalindrome(""));
        System.out.println(ips.isPalindrome("a"));
        

    }
}