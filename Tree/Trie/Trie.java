public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }
    public void insert(String str) {
        TrieNode currNode = root;
        for ( int i = 0; i< str.length(); i++) {
            char ch = str.charAt(i);
            TrieNode node = currNode.children.get(ch);
            if (node == null) {
                node = new TrieNode();
                currNode.children.put(ch, node);
            }
            currNode = node;
        }
        currNode.endOfString = true;
    }
    public boolean search(String word) {
        TrieNode currNode = root;
        for (int i = 0; i< word.length(); i++) {
            char ch = word.charAt(i);
            TrieNode node = currNode.children.get(ch);
            if (node == null) 
                return false;
            currNode = node;
        }
        return currNode.endOfString == true;
    }
}