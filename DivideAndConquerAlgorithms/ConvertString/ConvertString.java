public class ConvertString {
    public static int findMinOperation(String a, String b, int indexA, int indexB) {
        if (a.length() == indexA) {
            return b.length() - indexB;
        } else if (b.length() == indexB) {
            return a.length() - indexA;
        } else if (a.charAt(indexA) == b.charAt(indexB)) {
            return findMinOperation(a, b, indexA + 1, indexB + 1);
        } else {
            int deleteOp = 1 + findMinOperation(a, b, indexA, indexB + 1);
            int insertOp = 1 + findMinOperation(a, b, indexA + 1, indexB);
            int replaceOp = 1 + findMinOperation(a, b, indexA + 1, indexB + 1);
            return Math.min(insertOp, Math.min(deleteOp, replaceOp));
        }
    }
}
