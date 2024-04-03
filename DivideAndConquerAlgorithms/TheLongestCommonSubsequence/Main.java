public class Main {
    public static void main(String[] args) {
        TheLongestCommonSubsequence tlcs = new TheLongestCommonSubsequence();
        int x = tlcs.findLCS("elephant", "erepant", 0, 0);
        System.out.println(x);
    }

}