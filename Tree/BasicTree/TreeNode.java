import java.util.ArrayList;

public  class TreeNode{
    public String value;
    public ArrayList<TreeNode> children;

    public TreeNode(String value)
    {
        this.value = value;
        children = new ArrayList<TreeNode>();
    }

    public void addChild(TreeNode tn)
    {
        children.add(tn);
    }

    public String print(int level)
    {
        String result;
        result = "  ".repeat(level) + "*" +this.value + "\n";
        for(TreeNode tn : children)
        {
            result += tn.print(level+1);
        }
        return result;
    }
}