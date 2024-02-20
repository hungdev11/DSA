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
    private boolean delete(TrieNode parentNode, String word, int index) {
        char ch = word.charAt(index);
        TrieNode currNode = parentNode.children.get(ch);
        boolean canThisNodeBeDeleted;
        if ( currNode.children.size() > 1) {
            delete(currNode, word, index+1);
            return false;
        }
        if ( index == word.length()-1) {
            if ( currNode.children.size() >= 1) {
                currNode.endOfString = false;
                return false;
            } else {
                currNode.children.remove(ch);
                return true;
            }
        }
        if (currNode.endOfString == true) {
            delete(currNode, word, index+1);
            return false;
        }
        canThisNodeBeDeleted = delete(currNode, word, index+1);
        if (canThisNodeBeDeleted) {
            parentNode.children.remove(ch);
            return true;
        } else return false;
    }
    public void delete(String word) {
        if (search(word)) {
            delete(root, word, 0);
        }
    }
}