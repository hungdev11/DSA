public class TheLongestCommonSubsequence {
    public int findLCS(String s1, String s2, int indexA, int indexB) {
        if (s1.length() == indexA || s2.length() == indexB) {
            return 0;
        }
        if (s1.charAt(indexA) == s2.charAt(indexB)) {
            return 1 + findLCS(s1, s2, indexA + 1, indexB + 1);
        } else {
            int opt1 = findLCS(s1, s2, indexA, indexB + 1);
            int opt2 = findLCS(s1, s2, indexA + 1, indexB);
            return Math.max(opt1, opt2);
        }
    }
}
