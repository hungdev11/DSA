public class LongestPalindromeSubsequence {
    private int findLPS(String s, int startIndex, int endIndex) {
        if (startIndex > endIndex)
            return 0;
        if (startIndex == endIndex)
            return 1;
        int opt1 = 0;
        if (s.charAt(startIndex) == s.charAt(endIndex)) {
            opt1 = 2 + findLPS(s, startIndex + 1, endIndex - 1);
        }
        int opt2 = findLPS(s, startIndex + 1, endIndex);
        int opt3 = findLPS(s, startIndex, endIndex - 1);
        return Math.max(opt1, Math.max(opt2, opt3));
    }

    public int finLPSLength(String s) {
        return findLPS(s, 0, s.length() - 1);
    }
}
