import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    Map<Character, TrieNode> children;
    boolean endOfString;

    TrieNode() {
        children = new HashMap<Character, TrieNode>();
        endOfString = false;
    }
}
